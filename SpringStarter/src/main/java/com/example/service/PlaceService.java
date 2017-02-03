package com.example.service;

import java.util.Collection;

import com.example.entity.Place;

public interface PlaceService {

	Collection<Place> getAllPlaces();

	Place getPlaceById(Long id);

	Place createPlace(Place place);

	Place updatePlace(Place place);

	void deletePlace(Long id);

	Place getPlaceByShortName(String shortName);
}
