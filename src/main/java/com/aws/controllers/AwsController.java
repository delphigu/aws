package com.aws.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class AwsController {
	
	@GetMapping
	public ResponseEntity<String> teste() {
		return ResponseEntity.ok("ola aws vvvvvvvvvvvvv guguguuuuuu vai ffffffff dddddd vai1");
		
	}

}
