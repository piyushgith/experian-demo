package com.experian.credit.report.model.request;

public class ConsumerPii {
	private PrimaryApplicant primaryApplicant;

	public void setPrimaryApplicant(PrimaryApplicant primaryApplicant) {
		this.primaryApplicant = primaryApplicant;
	}

	public PrimaryApplicant getPrimaryApplicant() {
		return this.primaryApplicant;
	}
}
