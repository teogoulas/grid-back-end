package com.project.gridbackend.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "countries", schema = "nations")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer countryId;

	@Column(name = "name")
	private String name;

	@Column(name = "area", precision=10, scale=2)
	private BigDecimal area;

	@Column(name = "national_day")
	private Date nationalDay;

	@Column(name = "country_code2", columnDefinition = "char2")
	private String countryCode2;

	@Column(name = "country_code3", columnDefinition = "char3")
	private String countryCode3;

	@Column(name = "region_id")
	private Integer regionId;

	@ManyToMany
	@JoinTable(
			name = "country_languages",
			joinColumns = @JoinColumn(name = "country_id"),
			inverseJoinColumns = @JoinColumn(name = "language_id"))
	Set<Language> languages;

	public Country() {
	}

	public Country(Integer countryId, String name, BigDecimal area, Date nationalDay, String countryCode2,
	               String countryCode3, Integer regionId, Set<Language> languages) {
		this.countryId = countryId;
		this.name = name;
		this.area = area;
		this.nationalDay = nationalDay;
		this.countryCode2 = countryCode2;
		this.countryCode3 = countryCode3;
		this.regionId = regionId;
		this.languages = languages;
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

	public Set<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<Language> languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Country{" +
				"countryId=" + countryId +
				", name='" + name + '\'' +
				", area=" + area +
				", nationalDay=" + nationalDay +
				", countryCode2='" + countryCode2 + '\'' +
				", countryCode3='" + countryCode3 + '\'' +
				", regionId=" + regionId +
				", languages=" + languages +
				'}';
	}
}
