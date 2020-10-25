package com.experian.credit.report.model.request;

import java.util.List;

public class Summaries {
	private List<String> summaryType;

	public void setSummaryType(List<String> summaryType) {
		this.summaryType = summaryType;
	}

	public List<String> getSummaryType() {
		return this.summaryType;
	}
}
