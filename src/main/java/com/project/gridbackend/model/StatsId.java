package com.project.gridbackend.model;

import java.io.Serializable;
import java.util.Objects;

public class StatsId implements Serializable {
	private Integer countryId;

	private Integer year;

	public StatsId() {
	}

	public StatsId(Integer countryId, Integer year) {
		this.countryId = countryId;
		this.year = year;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "StatsId{" +
				"countryId=" + countryId +
				", year=" + year +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		StatsId statsId = (StatsId) o;
		return countryId.equals(statsId.countryId) && year.equals(statsId.year);
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryId, year);
	}
}
