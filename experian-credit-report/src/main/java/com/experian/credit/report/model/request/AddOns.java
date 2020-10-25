package com.experian.credit.report.model.request;

public class AddOns {

	private String directCheck;

	private String demographics;

	private String clarityEarlyRiskScore;

	private ClarityData clarityData;

	private String renterRiskScore;

	private RentBureauData rentBureauData;

	private RiskModels riskModels;

	private Summaries summaries;

	private String fraudShield;

	private String mla;

	private String ofacmsg;

	private ConsumerIdentCheck consumerIdentCheck;

	private String joint;

	private String paymentHistory84;

	private String syntheticId;

	private String taxRefundLoan;

	public void setDirectCheck(String directCheck) {
		this.directCheck = directCheck;
	}

	public String getDirectCheck() {
		return this.directCheck;
	}

	public void setDemographics(String demographics) {
		this.demographics = demographics;
	}

	public String getDemographics() {
		return this.demographics;
	}

	public void setClarityEarlyRiskScore(String clarityEarlyRiskScore) {
		this.clarityEarlyRiskScore = clarityEarlyRiskScore;
	}

	public String getClarityEarlyRiskScore() {
		return this.clarityEarlyRiskScore;
	}

	public void setClarityData(ClarityData clarityData) {
		this.clarityData = clarityData;
	}

	public ClarityData getClarityData() {
		return this.clarityData;
	}

	public void setRenterRiskScore(String renterRiskScore) {
		this.renterRiskScore = renterRiskScore;
	}

	public String getRenterRiskScore() {
		return this.renterRiskScore;
	}

	public void setRentBureauData(RentBureauData rentBureauData) {
		this.rentBureauData = rentBureauData;
	}

	public RentBureauData getRentBureauData() {
		return this.rentBureauData;
	}

	public void setRiskModels(RiskModels riskModels) {
		this.riskModels = riskModels;
	}

	public RiskModels getRiskModels() {
		return this.riskModels;
	}

	public void setSummaries(Summaries summaries) {
		this.summaries = summaries;
	}

	public Summaries getSummaries() {
		return this.summaries;
	}

	public void setFraudShield(String fraudShield) {
		this.fraudShield = fraudShield;
	}

	public String getFraudShield() {
		return this.fraudShield;
	}

	public void setMla(String mla) {
		this.mla = mla;
	}

	public String getMla() {
		return this.mla;
	}

	public void setOfacmsg(String ofacmsg) {
		this.ofacmsg = ofacmsg;
	}

	public String getOfacmsg() {
		return this.ofacmsg;
	}

	public void setConsumerIdentCheck(ConsumerIdentCheck consumerIdentCheck) {
		this.consumerIdentCheck = consumerIdentCheck;
	}

	public ConsumerIdentCheck getConsumerIdentCheck() {
		return this.consumerIdentCheck;
	}

	public void setJoint(String joint) {
		this.joint = joint;
	}

	public String getJoint() {
		return this.joint;
	}

	public void setPaymentHistory84(String paymentHistory84) {
		this.paymentHistory84 = paymentHistory84;
	}

	public String getPaymentHistory84() {
		return this.paymentHistory84;
	}

	public void setSyntheticId(String syntheticId) {
		this.syntheticId = syntheticId;
	}

	public String getSyntheticId() {
		return this.syntheticId;
	}

	public void setTaxRefundLoan(String taxRefundLoan) {
		this.taxRefundLoan = taxRefundLoan;
	}

	public String getTaxRefundLoan() {
		return this.taxRefundLoan;
	}
}
