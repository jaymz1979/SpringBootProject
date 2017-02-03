package com.example.serviceimpl;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.stereotype.Service;

import com.example.entity.Place;
import com.example.repository.PlaceRepository;
import com.example.service.PlaceService;

@Service(value = "placeService")
public class PlaceServiceImpl implements PlaceService {
	@Resource
	private PlaceRepository placeRepository;

	@Override
	public Place getPlaceById(Long id) {
		return this.placeRepository.findOne(id);
	}

	@Override
	public Place createPlace(Place place) {
		return this.placeRepository.save(place);
	}

	@Override
	public Place updatePlace(Place place) {
		return this.placeRepository.save(place);
	}

	@Override
	public void deletePlace(Long id) {
		this.placeRepository.delete(id);
	}

	@Override
	public Place getPlaceByShortName(String shortName) {
		return this.placeRepository.findByShortName(shortName);
	}

	public PlaceRepository getPlaceRepository() {
		return placeRepository;
	}

	public void setPlaceRepository(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
	}

	@Override
	public Collection<Place> getAllPlaces() {
//		Place place = new Place(new Long(1), "nom", "shortname", "");
//		place.setId(new Long(1));
//		place.setName("nom");
//		place.setShortName("shortName");
//		ArrayList<Place> list = new ArrayList<Place>() {
//			{
//				add(place);
//			}
//		};
//		return list;
		return IteratorUtils.toList(this.placeRepository.findAll().iterator());
	}
}
