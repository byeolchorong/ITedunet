package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	WelcomeController() {
		System.out.println("WelcomeController 객체 생성해쑴!");
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String welcome(Model model) {
		System.out.println("👉 welcome 입짱~");
		model.addAttribute("greeting", "Welcome to BookMarket");
		model.addAttribute("strapline", "Welcome to Web Shopping Mall!");
		return "welcome";
	}
}
