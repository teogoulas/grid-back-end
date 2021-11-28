package com.project.gridbackend.model;

import java.math.BigDecimal;

public interface GdpResponse {
	Integer getCountryId();
	String getName();
	String getCountryCode3();
	Integer getYear();
	Integer getPopulation();
	BigDecimal getGdp();
}
