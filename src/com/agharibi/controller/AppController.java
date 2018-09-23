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

	@RequestMapping("/")
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("home");	
		return model;
	}
	
	@RequestMapping("/admin")
	public ModelAndView admin() {
		ModelAndView model = new ModelAndView("admin");	
		return model;
	}
	
	@RequestMapping("/user")
	public ModelAndView user() {
		ModelAndView model = new ModelAndView("user");	
		return model;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView("login");	
		return model;
	}
	
	@RequestMapping("/403")
	public ModelAndView page403() {
		ModelAndView model = new ModelAndView("page403");	
		return model;
	}
	
}
