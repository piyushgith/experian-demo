package com.experian.credit.report.model.response;

import java.util.List;

public class Summaries {

	private String summaryType;

	private List<Attributes> attributes;

	public void setSummaryType(String summaryType) {
		this.summaryType = summaryType;
	}

	public String getSummaryType() {
		return this.summaryType;
	}

	public void setAttributes(List<Attributes> attributes) {
		this.attributes = attributes;
	}

	public List<Attributes> getAttributes() {
		return this.attributes;
	}
}
