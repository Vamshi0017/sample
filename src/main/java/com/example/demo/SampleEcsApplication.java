package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleEcsApplication {
	
	@RequestMapping("/")
	public String kk() {
		return " hello world by ecs";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleEcsApplication.class, args);
	}

}
