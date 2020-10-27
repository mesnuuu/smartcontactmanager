package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.UserRepository;
import com.smart.entities.User;


@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/base")
	public String base() {
		
		return "base";
	}
	
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("title", "about page");
		return "about";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		
		model.addAttribute("title", "Registration");
		return "signup";
	}
	
	/*
	@GetMapping("/test")
	@ResponseBody()
	public String Test() {
		
		User user = new User();
		user.setName("John");
		user.setEmail("John@Doe.com");
		
		userRepository.save(user);
		return "Working";
	}
	*/
}
