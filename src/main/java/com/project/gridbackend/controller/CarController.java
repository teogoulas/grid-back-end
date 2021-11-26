package com.project.gridbackend.controller;

import com.project.gridbackend.model.Car;
import com.project.gridbackend.model.CarRequest;
import com.project.gridbackend.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CarController {

	@Autowired
	CarService carService;

	@GetMapping("/list")
	public ResponseEntity<List<Car>> getAllTutorials(CarRequest request) {
		List<Car> list = carService.getCarList(request);

		return new ResponseEntity<List<Car>>(list, new HttpHeaders(), HttpStatus.OK);
	}

}
