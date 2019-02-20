package com.springboot.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springboot.service.AdminService;

@Controller

public class LoginController {

	@Autowired
	private AdminService adminService;
	
	
	@RequestMapping("/")
	public String InitializeHomePage(){
		return "home";
	}

	@RequestMapping("/login")
	public String InitializeLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="login/verify",method = RequestMethod.POST)
	public String loginUser(HttpServletRequest request, ModelMap map){
		
		String username = request.getParameter("txtUsername");
		String password = request.getParameter("txtPassword");
		
		boolean flag = adminService.AuthenticateAdmin(username, password);
		
		if(flag == true){
			return "dashboard";
		}
		else{
			return "login";
		}
	}
	
}