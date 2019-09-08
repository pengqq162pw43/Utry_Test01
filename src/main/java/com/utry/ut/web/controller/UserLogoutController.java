package com.utry.ut.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utry.ut.pojo.TestUser;
import com.utry.ut.service.TestUserService;

@Controller
@RequestMapping("logout")
public class UserLogoutController {
	
	@Autowired
	TestUserService testUserService;
	
	//}/user/LoginUI
	@RequestMapping("/toLogout")
	public String toLogout(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		TestUser user = new TestUser();
		user = null;
		HttpSession session = request.getSession();
		session.setAttribute("currentUser", user);
		return "main/login";
	}
} 
