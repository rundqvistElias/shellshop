package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  ShellshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShellshopApplication.class, args);

		System.out.println("Spring started!");
	}

}
