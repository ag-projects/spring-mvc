package com.agharibi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.agharibi.dao.AppDaoImpl;
import com.agharibi.model.User;

@Controller
public class AppController {

	@RequestMapping("/")
	public ModelAndView homePage() {
		List<User> users = new ArrayList<>();

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/agharibi/dao/Spring-AppDAOConfig.xml");
		AppDaoImpl appDao = context.getBean("DAOBean", AppDaoImpl.class);
		users = appDao.listUsers();
		System.out.println(users);

		ModelAndView model = new ModelAndView("index");
		model.addObject("users", users);
		context.close();
		
		return model;
	}
}
