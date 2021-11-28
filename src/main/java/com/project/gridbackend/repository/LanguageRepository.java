package com.project.gridbackend.repository;

import com.project.gridbackend.model.Language;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface LanguageRepository extends PagingAndSortingRepository<Language, Integer> {
	@Query(value = "SELECT l FROM Language l INNER JOIN CountyLanguage cl ON l.languageId = cl.languageId WHERE cl.countryId = :countryId")
	List<Language> findAllByCountryId(Integer countryId, Sort sort);
}
