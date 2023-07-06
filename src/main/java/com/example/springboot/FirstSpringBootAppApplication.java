package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstSpringBootAppApplication {
	@GetMapping("/")
	public String message() {
		return "This is a springboot app";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootAppApplication.class, args);
	}

}
