package com.example.multipledatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MultipledatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipledatabaseApplication.class, args);
	}

}
