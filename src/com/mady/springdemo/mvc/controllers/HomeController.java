package com.mady.springdemo.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {

	// Need a controller method to show a form
	@RequestMapping("/showForm")
	public String showForm() {
		return "index-form";
	}

	// Need a controller method to process a form
	@RequestMapping("/processForm")
	public String processForm() {
		return "resultForm";
	}

	// Need a controller method to process a form and add data to Model 
	@RequestMapping("/processFormV2")
	public String processFormV2(HttpServletRequest request, Model model) {
		//Read the request parameter
		String theName = request.getParameter("studentName");
		//Convert data to UC
		
		theName =theName.toUpperCase();
		//Create the message
		String result="Your name is "+theName;
		model.addAttribute("message", result); 
		
		//Add the message
		return "resultFormV2";
	}

	// Need a controller method to process a form and add data to Model 
	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String theName, Model model) {
		//Convert data to UC
		theName =theName.toUpperCase();
		//Create the message
		String result="Welcome "+theName;
		model.addAttribute("message", result); 
		
		//Add the message
		return "resultFormV2";
	}
}
