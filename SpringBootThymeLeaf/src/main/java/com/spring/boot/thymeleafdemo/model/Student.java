package com.spring.boot.thymeleafdemo.model;

import java.util.List;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private String favProgLang;
	
	private List<String> favOs;

	public Student() {		
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
	
	public String getFavProgLang() {
		return favProgLang;
	}

	public void setFavProgLang(String favProgLang) {
		this.favProgLang = favProgLang;
	}
	
	public List<String> getFavOs() {
		return favOs;
	}

	public void setFavOs(List<String> favOs) {
		this.favOs = favOs;
	}
}
