package com.experian.credit.report.model.request;

import java.util.List;

public class RiskModels {

	private List<String> modelIndicator;

	private String scorePercentile;

	public void setModelIndicator(List<String> modelIndicator) {
		this.modelIndicator = modelIndicator;
	}

	public List<String> getModelIndicator() {
		return this.modelIndicator;
	}

	public void setScorePercentile(String scorePercentile) {
		this.scorePercentile = scorePercentile;
	}

	public String getScorePercentile() {
		return this.scorePercentile;
	}
}
