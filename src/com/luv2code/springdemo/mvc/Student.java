package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.List;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> languageOptions;
	private List<String> operatingSystem;
	private String favoriteLanguage;
	
	public Student() {
		//populate the countryOptions
		this.countryOptions = new LinkedHashMap<>();
		this.languageOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("AG", "Argentina");
		countryOptions.put("UR", "Uruguay");
		countryOptions.put("SW", "Sweden");
		countryOptions.put("CA", "Canada");
		languageOptions.put("Java ", "Java ");
		languageOptions.put("C++ ", "C++ ");
		languageOptions.put("C# ", "C# ");
		languageOptions.put("PHP ", "PHP ");		
	}
	
	
	public List<String> getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(List<String> operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}



	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	
	

}
