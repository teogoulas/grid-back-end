package com.project.gridbackend.model;

import java.math.BigDecimal;
import java.sql.Date;

public class CountryRequest extends ListRequest {
	Integer countryId;
	private String name;
	private BigDecimal area;
	private Date nationalDay;
	private String countryCode2;
	private String countryCode3;
	private Integer regionId;

	public CountryRequest() {
	}

	public CountryRequest(Integer countryId, String name, BigDecimal area, Date nationalDay, String countryCode2,
	                      String countryCode3, Integer regionId) {
		this.countryId = countryId;
		this.name = name;
		this.area = area;
		this.nationalDay = nationalDay;
		this.countryCode2 = countryCode2;
		this.countryCode3 = countryCode3;
		this.regionId = regionId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
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

	@Override
	public String toString() {
		return "CountryRequest{" +
				"countryId=" + countryId +
				", name='" + name + '\'' +
				", area=" + area +
				", nationalDay=" + nationalDay +
				", countryCode2='" + countryCode2 + '\'' +
				", countryCode3='" + countryCode3 + '\'' +
				", regionId=" + regionId +
				'}';
	}
}
