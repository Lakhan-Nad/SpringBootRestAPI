package com.example.samsung_prism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SamsungPrismApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamsungPrismApplication.class, args);
	}

	@RequestMapping
	public String getHello() {
		return "Welcome to The API.";
	}
}
