package com.project.gridbackend.service;

import com.project.gridbackend.model.Region;
import com.project.gridbackend.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
	@Autowired
	RegionRepository regionRepository;

	public List<Region> getRegionList() {
		return regionRepository.findAll(Sort.by("name"));
	}
}
