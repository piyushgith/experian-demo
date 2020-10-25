package com.experian.credit.report.model.request;

public class CurrentAddress {
	private String line1;

	private String city;

	private String state;

	private String zipCode;

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine1() {
		return this.line1;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipCode() {
		return this.zipCode;
	}
}
