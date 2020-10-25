package com.experian.credit.report.model.response;

public class FraudShield {

	private String addressCount;

	private String addressDate;

	private String addressErrorCode;

	private FraudShieldIndicators fraudShieldIndicators;

	private String socialCount;

	private String socialDate;

	private String socialErrorCode;

	private String type;

	public void setAddressCount(String addressCount) {
		this.addressCount = addressCount;
	}

	public String getAddressCount() {
		return this.addressCount;
	}

	public void setAddressDate(String addressDate) {
		this.addressDate = addressDate;
	}

	public String getAddressDate() {
		return this.addressDate;
	}

	public void setAddressErrorCode(String addressErrorCode) {
		this.addressErrorCode = addressErrorCode;
	}

	public String getAddressErrorCode() {
		return this.addressErrorCode;
	}

	public void setFraudShieldIndicators(FraudShieldIndicators fraudShieldIndicators) {
		this.fraudShieldIndicators = fraudShieldIndicators;
	}

	public FraudShieldIndicators getFraudShieldIndicators() {
		return this.fraudShieldIndicators;
	}

	public void setSocialCount(String socialCount) {
		this.socialCount = socialCount;
	}

	public String getSocialCount() {
		return this.socialCount;
	}

	public void setSocialDate(String socialDate) {
		this.socialDate = socialDate;
	}

	public String getSocialDate() {
		return this.socialDate;
	}

	public void setSocialErrorCode(String socialErrorCode) {
		this.socialErrorCode = socialErrorCode;
	}

	public String getSocialErrorCode() {
		return this.socialErrorCode;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}
}
