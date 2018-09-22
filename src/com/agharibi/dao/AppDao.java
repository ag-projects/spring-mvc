package com.agharibi.dao;

import java.util.List;

import com.agharibi.model.User;

public interface AppDao {
	/*
	 * @return
	 */
	List<User> listUsers();

	/*
	 * @param user
	 */
	void addUser(User user);
}
