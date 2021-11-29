package com.project.gridbackend.model;

import java.math.BigDecimal;

public interface CountryDetailsResponse {
	Integer getCountryId();
	String getCountryName();
	Integer getYear();
	Integer getPopulation();
	BigDecimal getGdp();
	String getRegionName();
	String getContinentName();
}
