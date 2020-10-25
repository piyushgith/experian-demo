package com.experian.credit.report.model.request;

public class PrimaryApplicant {
	private Name name;

	private Dob dob;

	private Ssn ssn;

	private CurrentAddress currentAddress;

	public void setName(Name name) {
		this.name = name;
	}

	public Name getName() {
		return this.name;
	}

	public void setDob(Dob dob) {
		this.dob = dob;
	}

	public Dob getDob() {
		return this.dob;
	}

	public void setSsn(Ssn ssn) {
		this.ssn = ssn;
	}

	public Ssn getSsn() {
		return this.ssn;
	}

	public void setCurrentAddress(CurrentAddress currentAddress) {
		this.currentAddress = currentAddress;
	}

	public CurrentAddress getCurrentAddress() {
		return this.currentAddress;
	}
}
