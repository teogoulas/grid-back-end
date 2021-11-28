package com.project.gridbackend.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "country_stats", schema = "nations")
@IdClass(StatsId.class)
public class CountryStats {
	@Id
	@Column(name = "country_id")
	private Integer countryId;

	@Id
	@Column(name = "year")
	private Integer year;

	@Column(name = "population")
	private Integer population;

	@Column(name = "gdp", precision=15)
	private BigDecimal gdp;

	public CountryStats() {
	}

	public CountryStats(Integer countryId, Integer year, Integer population, BigDecimal gdp) {
		this.countryId = countryId;
		this.year = year;
		this.population = population;
		this.gdp = gdp;
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

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public BigDecimal getGdp() {
		return gdp;
	}

	public void setGdp(BigDecimal gdp) {
		this.gdp = gdp;
	}

	@Override
	public String toString() {
		return "CountryStats{" +
				"countryId=" + countryId +
				", year=" + year +
				", population=" + population +
				", gdp=" + gdp +
				'}';
	}
}
