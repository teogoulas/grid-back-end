package com.project.gridbackend.model;

import java.io.Serializable;
import java.util.Objects;

public class LanguageId implements Serializable {
	private Integer countryId;

	private Integer languageId;

	public LanguageId() {
	}

	public LanguageId(Integer countryId, Integer languageId) {
		this.countryId = countryId;
		this.languageId = languageId;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	@Override
	public String toString() {
		return "StatsId{" +
				"countryId=" + countryId +
				", year=" + languageId +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LanguageId that = (LanguageId) o;
		return countryId.equals(that.countryId) && languageId.equals(that.languageId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryId, languageId);
	}
}
