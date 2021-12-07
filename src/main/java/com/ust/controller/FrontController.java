package com.ust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class FrontController {

	
	@GetMapping("/docker")
	public String getDocker() {
		return "CI/CD Jenkins to push image to Docker Hub";
	}
	
	@GetMapping("/aws")
	public String getDockermsg() {
		return "Deploy Spring Boot Application using Elatic Compute Cloud";
	}
}
