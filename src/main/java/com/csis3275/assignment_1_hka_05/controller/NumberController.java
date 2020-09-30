package com.csis3275.assignment_1_hka_05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.csis3275.assignment_1_hka_05.models.ChildClass1;
import com.csis3275.assignment_1_hka_05.models.ChildClass2;


@Controller

public class NumberController {

	@GetMapping("/")
	public String viewActivity(Model model) {
		return "Assignment1-hka-05";
	}
	
	@PostMapping("/submit")
	public String submitData(ChildClass1 childClass1, Model model){
		System.out.println(childClass1.method1());
		System.out.println(childClass1.method2());
		ChildClass2 childClass2;
		try {
			model.addAttribute("childClass2", childClass1.getChildClass2());
		}catch(Exception ex) {
			childClass2 = new ChildClass2();
			childClass2.setErrorMessage("Please Enter a valid Number");
			model.addAttribute("childClass2", childClass2);
		}
		
		return "Assignment2-hka-05";
	}
	
}
