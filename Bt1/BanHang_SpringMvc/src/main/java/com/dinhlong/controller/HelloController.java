package com.dinhlong.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.taglibs.standard.extra.spath.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dinhlong.model.User;
import com.dinhlong.validator.UserValidator;

@Controller
public class HelloController {
	
	@Autowired
	private UserValidator userValidator;
	
	
//	@RequestMapping(value = {"/say-hello"})
//	public ModelAndView sayHello1(HttpServletRequest request,HttpServletResponse response, HttpSession session, 
//		@RequestParam(name = "user",required = true)String username 
//		, @RequestHeader(name = "Accept",required = false) String contentType) {
//		request.setAttribute("msg", contentType);
//		return new ModelAndView("hello");
//	}
//	
//	@RequestMapping("/hello/{name}/{id}")
//	public String hello(HttpServletRequest request,
//			@PathVariable(name = "name") String name,
//			@PathVariable(name = "id")String id) {
//		request.setAttribute("msg", name);
//		request.setAttribute("msg", id);
//		return "hello";
//	}
//	
//	@RequestMapping(value = "/add-user",method = RequestMethod.GET)
//	public String addUser(HttpServletRequest request) {
//		User user = new User();
//		user.setName("spring");
//		
//		List<String> favorites = new ArrayList<String>();
//		favorites.add("Music");
//		favorites.add("Movie");
//		favorites.add("Code");
//		
//		request.setAttribute("listFavorites", favorites);
//		request.setAttribute("user", user);
//		return "addUser";
//	}
//	
//	@RequestMapping( value = "/add-user" ,method = RequestMethod.POST)
//	public String addUser(HttpServletRequest request,@ModelAttribute("user") User user ,
//			BindingResult bindingResult) {
//		
//		userValidator.validate(user, bindingResult);
//		if(bindingResult.hasErrors()) {
//			List<String> favorites = new ArrayList<String>();
//			favorites.add("Music");
//			favorites.add("Movie");
//			favorites.add("Code");
//			 
//			request.setAttribute("listFavorites", favorites);
//			
//			return "addUser";
//		}
//		MultipartFile file =  user.getAvatar();
//		try {
//			File newFile = new File("D:\\img_test_spring\\"+file.getOriginalFilename());
//			FileOutputStream fileOutputStream = new FileOutputStream(newFile);
//			fileOutputStream.write(file.getBytes());
//			fileOutputStream.close();
//		}catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} 
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		request.setAttribute("user", user);
//		return "viewUser";
//	}
//	
//	@RequestMapping( value = "/upload-file" ,method = RequestMethod.GET)
//	public String uploadFile(HttpServletRequest request) {
//		return "upload";
//	}
//	
//	@RequestMapping( value = "/upload" ,method = RequestMethod.POST)
//	public String uploadFile(HttpServletRequest request,@RequestParam(name = "file") List<MultipartFile> files) {
//		for (MultipartFile file : files) {
//			try {
//				File newFile = new File("D:\\img_test_spring\\"+file.getOriginalFilename());
//				FileOutputStream fileOutputStream = new FileOutputStream(newFile);
//				fileOutputStream.write(file.getBytes());
//				fileOutputStream.close();
//			}catch (FileNotFoundException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			} 
//			catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		request.setAttribute("files", files);
//		return "viewFile";
//	}
//	
//	@RequestMapping(value = "/download-file", method = RequestMethod.GET)
//	public void downloadFile(HttpServletRequest request,HttpServletResponse response) {
//		String dataDirectory = "D:/img_test_spring/";
//		String fileName="17623.jpg";
//		java.nio.file.Path file = Paths.get(dataDirectory, fileName);
//		if(Files.exists(file)) {
//			response.setContentType("application/vnd.ms-excel");
//			response.setHeader("Content-Disposition", "attachment; filename="+fileName);
//			try {
//				Files.copy(file, response.getOutputStream());
//				response.getOutputStream().flush();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//	}
}
  