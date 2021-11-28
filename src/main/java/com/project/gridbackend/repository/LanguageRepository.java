package com.project.gridbackend.repository;

import com.project.gridbackend.model.Language;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LanguageRepository extends PagingAndSortingRepository<Language, Integer> {
}
