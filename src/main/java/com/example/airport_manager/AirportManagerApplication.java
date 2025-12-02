package com.example.airport_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirportManagerApplication {

	public static void main(String[] args) {
		System.setProperty("spring.data.mongodb.uri", "mongodb://localhost:27017/airport_db");
		SpringApplication.run(AirportManagerApplication.class, args);
	}

}
