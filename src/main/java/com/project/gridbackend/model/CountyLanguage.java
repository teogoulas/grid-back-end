package com.project.gridbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "country_languages", schema = "nations")
@IdClass(LanguageId.class)
public class CountyLanguage {
	@Id
	@Column(name = "country_id")
	private Integer countryId;

	@Id
	@Column(name = "language_id")
	private Integer languageId;

	@Column(name = "official", columnDefinition = "bit")
	private Integer official;

	public CountyLanguage() {
	}

	public CountyLanguage(Integer countryId, Integer languageId, Integer official) {
		this.countryId = countryId;
		this.languageId = languageId;
		this.official = official;
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

	public Integer getOfficial() {
		return official;
	}

	public void setOfficial(Integer official) {
		this.official = official;
	}

	@Override
	public String toString() {
		return "CountyLanguage{" +
				"countryId=" + countryId +
				", languageId=" + languageId +
				", official=" + official +
				'}';
	}
}
