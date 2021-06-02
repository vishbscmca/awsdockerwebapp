package com.awsdocker.awsdockerwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ApplicationController {

	
	@GetMapping("/info")
	public String getAppInfo() {
		return "Spring application in Java + AWS + Git + Docker";
	}

	
}
