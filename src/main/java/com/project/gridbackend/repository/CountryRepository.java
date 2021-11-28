package com.project.gridbackend.repository;

import com.project.gridbackend.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends PagingAndSortingRepository<Country, Integer> {
}
