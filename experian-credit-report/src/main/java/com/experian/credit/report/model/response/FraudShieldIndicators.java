package com.experian.credit.report.model.response;

import java.util.List;

public class FraudShieldIndicators {

	private List<String> indicator;

	public void setIndicator(List<String> indicator) {
		this.indicator = indicator;
	}

	public List<String> getIndicator() {
		return this.indicator;
	}
}
