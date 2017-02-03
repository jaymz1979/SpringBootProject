package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
