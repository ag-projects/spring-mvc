package com.agharibi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.agharibi.config.AppConfig;
import com.agharibi.dao.AppDaoImpl;
import com.agharibi.model.User;

@Controller
public class AppController {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	AppDaoImpl appDao = context.getBean("DAOBean", AppDaoImpl.class);
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		List<User> users = new ArrayList<>();
		users = appDao.listUsers();
		System.out.println(users);

		ModelAndView model = new ModelAndView("index");
		model.addObject("users", users);
		context.close();
	
		return model;
	}
	
	@RequestMapping("/addUser")
	public String addUser(Model model, @Valid User user, BindingResult result) {

		if (result.hasErrors()) {
			model.addAttribute("user", user);
			return "addUser";
		} else if (user.getName() != null && user.getName() != null) {
			this.appDao.addUser(user);
			return "forward:/";
		} else {
			System.out.println("Loading form data");
			return "addUser";
		}
	}
	
}
