package com.project.gridbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "languages", schema = "nations")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer languageId;

	@Column(name = "language", columnDefinition = "nvarchar50")
	private String language;

	public Language() {
	}

	public Language(Integer languageId, String language) {
		this.languageId = languageId;
		this.language = language;
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

	@Override
	public String toString() {
		return "Language{" +
				"languageId=" + languageId +
				", language='" + language + '\'' +
				'}';
	}
}
