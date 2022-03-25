package com.dinhlong.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dinhlong.model.User;

@Controller
public class HelloController {
	
	@RequestMapping(value = {"/say-hello"})
	public ModelAndView sayHello1(HttpServletRequest request,HttpServletResponse response, HttpSession session, 
		@RequestParam(name = "user",required = true)String username 
		, @RequestHeader(name = "Accept",required = false) String contentType) {
		request.setAttribute("msg", contentType);
		return new ModelAndView("hello");
	}
	
	@RequestMapping("/hello/{name}/{id}")
	public String hello(HttpServletRequest request,
			@PathVariable(name = "name") String name,
			@PathVariable(name = "id")String id) {
		request.setAttribute("msg", name);
		request.setAttribute("msg", id);
		return "hello";
	}
	
	@RequestMapping(value = "/add-user",method = RequestMethod.GET)
	public String addUser(HttpServletRequest request) {
		User user = new User();
		user.setName("spring");
		request.setAttribute("user", user);
		return "addUser";
	}
	
	@RequestMapping( value = "/add-user" ,method = RequestMethod.POST)
	public String addUser(HttpServletRequest request,@ModelAttribute("user")User user) {
		request.setAttribute("user", user);
		return "viewUser";
	}
}
