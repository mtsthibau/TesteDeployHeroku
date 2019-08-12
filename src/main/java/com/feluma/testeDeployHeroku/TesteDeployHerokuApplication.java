package com.feluma.testeDeployHeroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TesteDeployHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteDeployHerokuApplication.class, args);
	}
	
	@RestController
	class HelloCtrl {

		@CrossOrigin(maxAge = 10, origins = {"http://127.0.0.1:5500"})
		@RequestMapping("/hello/")
	    String hello() {
	        return "Hello, Motherfucker";
	    }
	}

}
