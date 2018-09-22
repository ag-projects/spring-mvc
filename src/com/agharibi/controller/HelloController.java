package com.agharibi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		model.addAttribute("formName", name);
		return "hello";
	}
	
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

}
