package com.dinhlong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dinhlong.model.User;
import com.dinhlong.service.UserService;
import com.dinhlong.service.impl.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = {"/list-user"},method = RequestMethod.GET)
	public String listUser(HttpServletRequest request) {
		List<User> users = userService.getAllUsers();
		request.setAttribute("users", users);
		return "user/listUser";
	}
	
	@RequestMapping(value = {"/add-user"},method = RequestMethod.GET)
	public String addUser() {
		return "user/addUser";
	}
	
	@RequestMapping(value = {"/add-user"},method = RequestMethod.POST)
	public String addUser(HttpServletRequest request) {
		return "user/addUser";
	}
	
	@RequestMapping
	public String deleteUser() {
		return "user/listUser";
	}
}
