package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.entity.Place;
import com.example.repository.PlaceRepository;

@SpringBootApplication
public class SpringStarterApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterApplication.class, args);
	}
	
	
//	@Bean
//	public CommandLineRunner demo(PlaceRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//			repository.save(new Place(new Long(1), "aywa", "asdika", "waaaa"));
//
//			
//		};
//	}
}
