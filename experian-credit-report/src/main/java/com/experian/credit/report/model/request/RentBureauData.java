package com.experian.credit.report.model.request;

public class RentBureauData {

	private String primaryApplRentBureauFreezePin;

	private String secondaryApplRentBureauFreezePin;

	public void setPrimaryApplRentBureauFreezePin(String primaryApplRentBureauFreezePin) {
		this.primaryApplRentBureauFreezePin = primaryApplRentBureauFreezePin;
	}

	public String getPrimaryApplRentBureauFreezePin() {
		return this.primaryApplRentBureauFreezePin;
	}

	public void setSecondaryApplRentBureauFreezePin(String secondaryApplRentBureauFreezePin) {
		this.secondaryApplRentBureauFreezePin = secondaryApplRentBureauFreezePin;
	}

	public String getSecondaryApplRentBureauFreezePin() {
		return this.secondaryApplRentBureauFreezePin;
	}
}
