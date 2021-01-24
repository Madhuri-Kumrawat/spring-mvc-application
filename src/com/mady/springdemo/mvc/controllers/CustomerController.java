package com.mady.springdemo.mvc.controllers;

import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mady.springdemo.mvc.models.Customer;
import com.mady.springdemo.mvc.models.Student;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	// Add Initibinder
	@InitBinder
	public void initbinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEdition = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEdition);
	}
	
	
	// Need a controller method to show a form
	@RequestMapping("/custForm")
	public String custForm(Model theModel) {

		// Add Customer object to the model
		theModel.addAttribute("customer", new Customer());
		
		// Add Customer object to the model
		theModel.addAttribute("theCountryOptions", countryOptions);
		return "customer/customer-form";
	}

	// Need a controller method to process a form and add data to Model
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
		//log the input data
		
		if (theBindingResult.hasErrors()) {
			System.out.println("Student NAme : "+theCustomer.getFirstName()+" "+ theCustomer.getLastName());
			return "customer/customer-form";
		}else {
			return "customer/customer-confirmation";		
		}
	
	}
}
