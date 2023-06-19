package com.amazon.mess.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/stu")
public class StudentController {

	@GetMapping("/getlist")
	public List<String> getStudent(){
		List<String> list =new ArrayList<>();
		list.add("manav");
		list.add("kavi");
		list.add("tommy");
		list.add("samir");
		
	return list;	
	}
}
