package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;

@Controller
public class HomeController {
	
	
	
	
	
		
	
	//	Student s =new Student(102, "roshan", "mankapur");

	
	
	
	
	@RequestMapping("/")
	String myfun(Model m)
	{
		
		Student s =new Student(102, "roshan", "mankapur");

		
	
	
		
		m.addAttribute("obj",s);
		
		
		return "page1.html";
	}
	
	
	
	
	
	
	
	
	

}
