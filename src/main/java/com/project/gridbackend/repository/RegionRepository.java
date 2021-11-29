package com.project.gridbackend.repository;

import com.project.gridbackend.model.Region;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RegionRepository extends PagingAndSortingRepository<Region, Integer> {
	List<Region> findAll(Sort sort);
}
