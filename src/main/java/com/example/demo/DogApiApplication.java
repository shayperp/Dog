package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"controller"})
@EnableMongoRepositories(basePackages = "repository")

public class DogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogApiApplication.class, args);
	}

}
