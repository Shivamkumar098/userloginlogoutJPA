package com.prodapt.bootrestloginlogout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prodapt.bootrestloginlogout.entities.User;
import com.prodapt.bootrestloginlogout.entities.UserDetails;
import com.prodapt.bootrestloginlogout.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@GetMapping("/registration")
	public String showRegistrationFrom(@ModelAttribute("user") User user, @ModelAttribute("userdetails") UserDetails userdetails) {
		return "registration";
	}
	
	@PostMapping("/saveuser")
	public ModelAndView saveUser(@ModelAttribute ("user") User user, @ModelAttribute("userdetails") UserDetails userdetails) {
		user.setUserDetails(userdetails);
		ModelAndView mv = new ModelAndView();
		User usr = userService.addUser(user);
		mv.addObject("userData",usr);
		mv.setViewName("registration");
		
		return mv;
	}
	

}
