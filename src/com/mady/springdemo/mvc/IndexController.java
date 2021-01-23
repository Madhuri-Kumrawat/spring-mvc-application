package com.mady.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

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
}
