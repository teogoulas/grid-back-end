package com.project.gridbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "languages", schema = "nations")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer languageId;

	@Column(name = "language", columnDefinition = "nvarchar50")
	private String language;

	@ManyToMany(mappedBy = "languages")
	@JsonIgnore
	Set<Country> countries;

	public Language() {
	}

	public Language(Integer languageId, String language, Set<Country> countries) {
		this.languageId = languageId;
		this.language = language;
		this.countries = countries;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Language{" +
				"languageId=" + languageId +
				", language='" + language + '\'' +
				", countries=" + countries +
				'}';
	}
}
