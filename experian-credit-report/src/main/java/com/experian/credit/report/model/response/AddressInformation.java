package com.experian.credit.report.model.response;

public class AddressInformation {

	private String city;

	private String dwellingType;

	private String firstReportedDate;

	private String lastReportingSubscriberCode;

	private String lastUpdatedDate;

	private String source;

	private String state;

	private String streetName;

	private String streetPrefix;

	private String streetSuffix;

	private String timesReported;

	private String zipCode;

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setDwellingType(String dwellingType) {
		this.dwellingType = dwellingType;
	}

	public String getDwellingType() {
		return this.dwellingType;
	}

	public void setFirstReportedDate(String firstReportedDate) {
		this.firstReportedDate = firstReportedDate;
	}

	public String getFirstReportedDate() {
		return this.firstReportedDate;
	}

	public void setLastReportingSubscriberCode(String lastReportingSubscriberCode) {
		this.lastReportingSubscriberCode = lastReportingSubscriberCode;
	}

	public String getLastReportingSubscriberCode() {
		return this.lastReportingSubscriberCode;
	}

	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return this.source;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetPrefix(String streetPrefix) {
		this.streetPrefix = streetPrefix;
	}

	public String getStreetPrefix() {
		return this.streetPrefix;
	}

	public void setStreetSuffix(String streetSuffix) {
		this.streetSuffix = streetSuffix;
	}

	public String getStreetSuffix() {
		return this.streetSuffix;
	}

	public void setTimesReported(String timesReported) {
		this.timesReported = timesReported;
	}

	public String getTimesReported() {
		return this.timesReported;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipCode() {
		return this.zipCode;
	}
}
