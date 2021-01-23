package com.mady.springdemo.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mady.springdemo.mvc.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	// Need a controller method to show a form
	@RequestMapping("/stdForm")
	public String stdForm(Model theModel) {
		// Create a Student Object
		Student theStudent = new Student();

		// Add Student object to the model
		theModel.addAttribute("student", theStudent);

		return "student/student-form";
	}

	// Need a controller method to process a form and add data to Model
	@RequestMapping("/processForm")
	public String processFormV3(@ModelAttribute("student") Student theStudent) {
		//log the input data
		System.out.println("Student NAme : "+theStudent.getFirstName()+" "+ theStudent.getLastName());
		return "student/student-confirmation";
	}
}
