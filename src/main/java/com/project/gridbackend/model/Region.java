package com.project.gridbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "regions", schema = "nations")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "region_id")
	private Integer regionId;

	@Column(name = "name", columnDefinition = "nvarchar100")
	private String name;

	@Column(name = "continent_id")
	private Integer continentId;

	public Region() {
	}

	public Region(Integer regionId, String name, Integer continentId) {
		this.regionId = regionId;
		this.name = name;
		this.continentId = continentId;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getContinentId() {
		return continentId;
	}

	public void setContinentId(Integer continentId) {
		this.continentId = continentId;
	}

	@Override
	public String toString() {
		return "Region{" +
				"regionId=" + regionId +
				", name='" + name + '\'' +
				", continentId=" + continentId +
				'}';
	}
}
