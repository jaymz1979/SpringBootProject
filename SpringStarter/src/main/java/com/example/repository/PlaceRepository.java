package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Place;

public interface PlaceRepository extends CrudRepository<Place, Long> {
	   Place findByShortName(String shortName);
	 
	}
