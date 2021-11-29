package com.project.gridbackend.repository;

import com.project.gridbackend.model.Country;
import com.project.gridbackend.model.CountryDetailsResponse;
import com.project.gridbackend.model.GdpResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CountryRepository extends PagingAndSortingRepository<Country, Integer> {
	@Query(value = "SELECT c.country_id as countryId, c.name, c.country_code3 as countryCode3, cs.year, cs.population, cs.gdp FROM countries c INNER JOIN country_stats cs ON c.country_id=cs.country_id " +
			"INNER JOIN (SELECT country_id, MAX(gdp) as gdp FROM country_stats GROUP BY country_id) X ON X.country_id = cs.country_id and X.gdp = cs.gdp  ORDER BY c.country_id", nativeQuery = true)
	List<GdpResponse> findAllGDP();

	@Query(value = "SELECT c.country_id as countryId, c.name as countryName, cs.year, cs.population, cs.gdp, c2.name as continentName, r.name as regionName FROM countries c INNER JOIN country_stats cs ON c.country_id = cs.country_id " +
			"INNER JOIN regions r ON c.region_id = r.region_id INNER JOIN continents c2 ON r.continent_id = c2.continent_id " +
			"WHERE (:yearFrom IS NULL OR cs.year >= :yearFrom) " +
			"AND (:yearTo IS NULL OR cs.year <= :yearTo) " +
			"AND (:regionName IS NULL OR r.name = :regionName) " +
			"ORDER BY c.country_id", nativeQuery = true)
	List<CountryDetailsResponse> findAllDetails(Integer yearFrom, Integer yearTo, String regionName);
}
