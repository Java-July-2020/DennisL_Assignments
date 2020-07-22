package com.dennislee.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;on.*;

@SpringBootApplication
@RestController
public class StringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		System.out.println("Hello Client! How are you doing?");
	}
	
}
