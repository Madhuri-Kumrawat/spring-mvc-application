package com.mady.springdemo.mvc.models;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mady.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message=" Can not be Null")
	@Size(min=3,message=" atleast 3 char is required")
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String[] operatingSystems;

	@NotNull(message=" Can not be Null")
	@Min(value=0,message="must be greater than zero")
	@Max(value=10,message="must be less than ten")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="Only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value="AAA", message="must start with AAA")
	private String courseCode;

	public Customer(){
		//populate country options:used ISO coutnry Code
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("IND", "India");
		countryOptions.put("BRZ", "Brazil");
		countryOptions.put("CA", "Canada");
		countryOptions.put("USA", "United States");
		countryOptions.put("DE", "Germeny");
	}
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
