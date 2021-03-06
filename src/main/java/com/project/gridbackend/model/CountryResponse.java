package com.project.gridbackend.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collections;
import java.util.List;

public class CountryResponse implements Serializable {
	private Integer countryId;

	private String name;

	private BigDecimal area;

	private Date nationalDay;

	private String countryCode2;

	private String countryCode3;

	private Integer regionId;

	List<Language> languages;

	List<CountryStats> countryStats;

	private String continentName;

	private String regionName;

	public CountryResponse() {
	}

	public CountryResponse(Integer countryId, String name, BigDecimal area, Date nationalDay, String countryCode2,
	               String countryCode3, Integer regionId, List<Language> languages, List<CountryStats> countryStats,
                   String continentName, String regionName) {
		this.countryId = countryId;
		this.name = name;
		this.area = area;
		this.nationalDay = nationalDay;
		this.countryCode2 = countryCode2;
		this.countryCode3 = countryCode3;
		this.regionId = regionId;
		this.languages = languages;
		this.countryStats = countryStats;
		this.continentName = continentName;
		this.regionName = regionName;
	}

	public CountryResponse(Country country) {
		this.countryId = country.getCountryId();
		this.name = country.getName();
		this.area = country.getArea();
		this.nationalDay = country.getNationalDay();
		this.countryCode2 = country.getCountryCode2();
		this.countryCode3 = country.getCountryCode3();
		this.regionId = country.getRegionId();
	}

	public CountryResponse(GdpResponse gdpResponse) {
		this.countryId = gdpResponse.getCountryId();
		this.name = gdpResponse.getName();
		this.countryCode3 = gdpResponse.getCountryCode3();
		this.countryStats = Collections.singletonList(new CountryStats(gdpResponse.getCountryId(), gdpResponse.getYear(), gdpResponse.getPopulation(), gdpResponse.getGdp()));
	}

	public CountryResponse(CountryDetailsResponse countryDetailsResponse) {
		this.countryId = countryDetailsResponse.getCountryId();
		this.name = countryDetailsResponse.getCountryName();
		this.continentName = countryDetailsResponse.getContinentName();
		this.regionName = countryDetailsResponse.getRegionName();
		this.countryStats = Collections.singletonList(new CountryStats(countryDetailsResponse.getCountryId(), countryDetailsResponse.getYear(), countryDetailsResponse.getPopulation(), countryDetailsResponse.getGdp()));
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer id) {
		this.countryId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public Date getNationalDay() {
		return nationalDay;
	}

	public void setNationalDay(Date nationalDay) {
		this.nationalDay = nationalDay;
	}

	public String getCountryCode2() {
		return countryCode2;
	}

	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}

	public String getCountryCode3() {
		return countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<CountryStats> getCountryStats() {
		return countryStats;
	}

	public void setCountryStats(List<CountryStats> countryStats) {
		this.countryStats = countryStats;
	}

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		return "CountryResponse{" +
				"countryId=" + countryId +
				", name='" + name + '\'' +
				", area=" + area +
				", nationalDay=" + nationalDay +
				", countryCode2='" + countryCode2 + '\'' +
				", countryCode3='" + countryCode3 + '\'' +
				", regionId=" + regionId +
				", languages=" + languages +
				", countryStats=" + countryStats +
				", continentName='" + continentName + '\'' +
				", regionName='" + regionName + '\'' +
				'}';
	}
}
