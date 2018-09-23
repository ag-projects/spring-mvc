package com.agharibi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.agharibi.model.User;
import com.agharibi.service.PasswordEncodingService;

@Component
public class AppDaoImpl implements AppDao {

	private DataSource dataSource;
	
	public AppDaoImpl() {
	}

	public AppDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public List<User> listUsers() {
		String SQL = "SELECT * FROM users order by user_id";
		List<User> users = new ArrayList<>();
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User user = new User(
						rs.getInt("user_id"), 
						rs.getString("username"), 
						rs.getString("email"));
				users.add(user);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return users;
		
	}

	@Override
	public void addUser(User user) {
		Connection conn = null;
		String SQL = "INSERT INTO users (username, email, password) VALUES (?,?,?)";
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, new PasswordEncodingService().passwordEncoder(user.getPassword()));
			ps.execute();
			
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
