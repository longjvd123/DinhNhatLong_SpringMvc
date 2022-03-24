package com.longdinh.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloCopntroller {
	
	@RequestMapping("/hello")
	public String sayHello(ModelMap map) {
		map.addAttribute("msg","long dinh");
		return "hello";
	}
}
