package com.spring.boot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.boot.thymeleafdemo.model.Student;

@Controller
public class StudentController {
	
	@Value("${countries}")
	private List<String> countries;
	
	@Value("${languages}")
	private List<String> languages;
	
	@Value("${systems}")
	private List<String> operSystems;

	@GetMapping("/studentForm")
	public String showStudentForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		
		//adding the list of countries to model
		theModel.addAttribute("countries", countries);
		theModel.addAttribute("languages", languages);
		theModel.addAttribute("operSystems", operSystems);
		
		return "student-form";
	}
	
	@PostMapping("/processStudentForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("theStudent " + theStudent.getFirstName() + " " + theStudent.getLastName() + " lives in " + theStudent.getCountry() + " and favourite programming language is " + theStudent.getFavProgLang());
		return "student-confirmation";
	}
}
