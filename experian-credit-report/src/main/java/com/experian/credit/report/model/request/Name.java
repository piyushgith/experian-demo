package com.experian.credit.report.model.request;

/**
 * @author Ironman
 *
 */
public class Name {
	
	private String lastName;

	private String firstName;

	private String middleName;

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMiddleName() {
		return this.middleName;
	}
}
