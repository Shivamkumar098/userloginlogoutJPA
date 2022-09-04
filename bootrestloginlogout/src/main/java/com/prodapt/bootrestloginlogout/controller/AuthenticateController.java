package com.prodapt.bootrestloginlogout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AuthenticateController {
	
	
		   @GetMapping("/index")
		    public String home(){
		        return "index";
		    }

}
