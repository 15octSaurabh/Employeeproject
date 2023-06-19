package com.amazon.mess.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController {

	@GetMapping("/listmanage")
	public List<String> getListManager(){
		List<String> list =new ArrayList<>();
		list.add("deepak");
		list.add("sagar");
		list.add("rushi");
		list.add("mayur");
		
		
		return list;
	}
	
}
