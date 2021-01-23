package com.mady.springdemo.mvc.models;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	
	public Student(){
		//populate country options:used ISO coutnry Code
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("IND", "India");
		countryOptions.put("BRZ", "Brazil");
		countryOptions.put("CA", "Canada");
		countryOptions.put("USA", "United States");
		countryOptions.put("DE", "Germeny");
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
