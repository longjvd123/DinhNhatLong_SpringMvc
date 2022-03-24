package com.dinhlong.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dinhlong.model.Person;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	@Qualifier("person")
	private Person person;
	 
	@RequestMapping("/hello")
	public String Controller(ModelMap map) {
		//map.addAttribute("msg", "long");
		map.addAttribute("person", person);
		return "hello";
	}
}
