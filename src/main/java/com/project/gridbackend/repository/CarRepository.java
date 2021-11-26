package com.project.gridbackend.repository;

import com.project.gridbackend.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CarRepository extends PagingAndSortingRepository<Car, Long> {
	@Query("SELECT c.* FROM Cars c WHERE (:make is null or c.make = :make) and (:model is null"
			+ " or c.model = :model) and (:priceFrom is null or priceFrom <= c.price) and (:priceTo is null or priceTo >= c.price)")
	Page<Car> findAllByMakeAndModelAndPriceBetween(String make, String model, Long priceFrom, Long priceTo, Pageable pageable);
}
