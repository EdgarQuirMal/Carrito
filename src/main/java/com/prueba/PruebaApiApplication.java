package com.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApiApplication.class, args);
		
		System.out.println("Hola");
	}

}