package com.project.gridbackend.repository;

import com.project.gridbackend.model.CountryStats;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryStatsRepository extends PagingAndSortingRepository<CountryStats, Integer> {
}
