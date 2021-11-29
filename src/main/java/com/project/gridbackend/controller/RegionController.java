package com.project.gridbackend.controller;

import com.project.gridbackend.model.CountryRequest;
import com.project.gridbackend.model.Region;
import com.project.gridbackend.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/region")
public class RegionController {

	@Autowired
	RegionService regionService;

	@GetMapping("/list")
	public ResponseEntity<List<Region>> getCountriesList(CountryRequest request) {
		return new ResponseEntity<>(regionService.getRegionList(), new HttpHeaders(), HttpStatus.OK);
	}
}
