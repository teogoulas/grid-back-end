package com.project.gridbackend.service;

import com.project.gridbackend.model.Country;
import com.project.gridbackend.model.CountryRequest;
import com.project.gridbackend.model.ListResponse;
import com.project.gridbackend.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;

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
}
