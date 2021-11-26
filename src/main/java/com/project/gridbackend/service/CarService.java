package com.project.gridbackend.service;

import com.project.gridbackend.model.Car;
import com.project.gridbackend.model.CarRequest;
import com.project.gridbackend.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;

	public List<Car> getCarList(CarRequest request) {
		Pageable paging = PageRequest.of(request.getPage(), request.getRowsPerPage(), request.isAsc() ? Sort.by(request.getBy()).ascending() : Sort.by(request.getBy()).descending());

		Page<Car> pagedResult = carRepository.findAllByMakeAndModelAndPriceBetween(request.getMake(), request.getModel(), request.getPriceFrom(), request.getPriceTo(), paging);

		if(pagedResult.hasContent()) {
			return pagedResult.getContent();
		} else {
			return new ArrayList<Car>();
		}
	}
}
