package com.project.gridbackend.model;

public class CarRequest extends ListRequest {
	String model;
	String make;
	Long priceFrom;
	Long priceTo;

	public CarRequest() {
	}

	public CarRequest(String model, String make, Long priceFrom, Long priceTo) {
		this.model = model;
		this.make = make;
		this.priceFrom = priceFrom;
		this.priceTo = priceTo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Long getPriceFrom() {
		return priceFrom;
	}

	public void setPriceFrom(Long priceFrom) {
		this.priceFrom = priceFrom;
	}

	public Long getPriceTo() {
		return priceTo;
	}

	public void setPriceTo(Long priceTo) {
		this.priceTo = priceTo;
	}
}
