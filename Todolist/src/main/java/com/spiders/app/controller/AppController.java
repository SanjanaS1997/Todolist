package com.spiders.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spiders.app.config.Constants;
import com.spiders.app.dto.UserDto;

@Controller

public class AppController {


	@RequestMapping("/")
	String displayIndex(HttpSession session , Model model){
		
		// logic fot session 
		UserDto user = (UserDto)session.getAttribute("user");
		if(user != null) {
			model.addAttribute("user", user);
			model.addAttribute("id",user.getId());
			model.addAttribute("user",user.getUser());
			
		
	}
		System.out.println("Entry point");	
		
		return "index";
	
	}
}
