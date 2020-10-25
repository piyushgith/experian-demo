package com.experian.credit.report.model.response;

import java.io.Serializable;
import java.util.List;

public class ExperianCreditReportResponseDTO implements Serializable {

	private List<CreditProfile> creditProfile;

	public void setCreditProfile(List<CreditProfile> creditProfile) {
		this.creditProfile = creditProfile;
	}

	public List<CreditProfile> getCreditProfile() {
		return this.creditProfile;
	}
}
