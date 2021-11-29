package com.project.gridbackend.service;

import com.project.gridbackend.model.*;
import com.project.gridbackend.repository.CountryRepository;
import com.project.gridbackend.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;

	@Autowired
	LanguageRepository languageRepository;

	public ListResponse<Country> getCountriesList(CountryRequest request) {
		Pageable paging;
		if (request.getPage() == -1) {
			paging = PageRequest.of(0, Integer.MAX_VALUE);
		} else {
			paging = PageRequest.of(request.getPage(), request.getRowsPerPage(), request.isAsc() ? Sort.by(request.getBy()).ascending() : Sort.by(request.getBy()).descending());
		}

		Page<Country> pagedResult = countryRepository.findAll(paging);

		return new ListResponse<>(pagedResult.getNumber(), request.getRowsPerPage(),
				pagedResult.getNumberOfElements(), pagedResult.getTotalPages(), request.getBy(), request.isAsc(),
				pagedResult.hasContent() ? pagedResult.getContent() : new ArrayList<>());
	}

	public CountryResponse getCountryById(CountryRequest request) {
		Country country = countryRepository.findById(request.getCountryId()).orElse(new Country());
		CountryResponse response = new CountryResponse(country);

		List<Language> languages = languageRepository.findAllByCountryId(request.getCountryId(), Sort.by("languageId"));
		response.setLanguages(languages);
		return response;
	}

	public ListResponse<CountryResponse> getCountriesGDPList(CountryRequest request) {
		List<CountryResponse> result = countryRepository.findAllGDP().stream().
				map(CountryResponse::new).collect(Collectors.toList());

		return new ListResponse<>(request.getPage(), request.getRowsPerPage(), result.size(),
				result.size() / request.getRowsPerPage(), request.getBy(), request.isAsc(), result);
	}

	public ListResponse<CountryResponse> getCountriesDetailsList(CountryRequest request) {
		List<CountryResponse> result = countryRepository.findAllDetails(request.getYearFrom(), request.getYearTo(), request.getRegionName()).stream().
				map(CountryResponse::new).collect(Collectors.toList());

		return new ListResponse<>(request.getPage(), request.getRowsPerPage(), result.size(),
				result.size() / request.getRowsPerPage(), request.getBy(), request.isAsc(), result);
	}
}
