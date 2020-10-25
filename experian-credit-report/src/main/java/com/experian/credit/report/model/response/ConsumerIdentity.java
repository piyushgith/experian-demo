package com.experian.credit.report.model.response;

import java.util.List;

public class ConsumerIdentity {

	private Dob dob;

	private List<Name> name;

	private List<Phone> phone;

	public void setDob(Dob dob) {
		this.dob = dob;
	}

	public Dob getDob() {
		return this.dob;
	}

	public void setName(List<Name> name) {
		this.name = name;
	}

	public List<Name> getName() {
		return this.name;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	public List<Phone> getPhone() {
		return this.phone;
	}
}
