package com.project.gridbackend.controller;

import com.project.gridbackend.model.Country;
import com.project.gridbackend.model.CountryRequest;
import com.project.gridbackend.model.CountryResponse;
import com.project.gridbackend.model.ListResponse;
import com.project.gridbackend.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/country")
public class CountryController {

	@Autowired
	CountryService countryService;

	@GetMapping("/list")
	public ResponseEntity<ListResponse<Country>> getCountriesList(CountryRequest request) {
		return new ResponseEntity<>(countryService.getCountriesList(request), new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/find/by/id")
	public ResponseEntity<CountryResponse> getCountryById(CountryRequest request) {
		return new ResponseEntity<>(countryService.getCountryById(request), new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/gdp")
	public ResponseEntity<ListResponse<CountryResponse>> getCountriesGDPList(CountryRequest request) {
		return new ResponseEntity<>(countryService.getCountriesGDPList(request), new HttpHeaders(), HttpStatus.OK);
	}

}
