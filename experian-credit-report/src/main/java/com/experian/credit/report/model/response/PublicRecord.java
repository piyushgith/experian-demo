package com.experian.credit.report.model.response;

public class PublicRecord {

	private String amount;

	private String bookPageSequence;

	private String courtCode;

	private String courtName;

	private String ecoa;

	private String evaluation;

	private String filingDate;

	private String status;

	private String statusDate;

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setBookPageSequence(String bookPageSequence) {
		this.bookPageSequence = bookPageSequence;
	}

	public String getBookPageSequence() {
		return this.bookPageSequence;
	}

	public void setCourtCode(String courtCode) {
		this.courtCode = courtCode;
	}

	public String getCourtCode() {
		return this.courtCode;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public String getCourtName() {
		return this.courtName;
	}

	public void setEcoa(String ecoa) {
		this.ecoa = ecoa;
	}

	public String getEcoa() {
		return this.ecoa;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	public String getEvaluation() {
		return this.evaluation;
	}

	public void setFilingDate(String filingDate) {
		this.filingDate = filingDate;
	}

	public String getFilingDate() {
		return this.filingDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}

	public String getStatusDate() {
		return this.statusDate;
	}
}
