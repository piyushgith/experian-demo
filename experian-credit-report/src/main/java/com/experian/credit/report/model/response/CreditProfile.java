package com.experian.credit.report.model.response;

import java.util.List;

import com.experian.credit.report.model.request.Ssn;

public class CreditProfile {

	private List<AddressInformation> addressInformation;

	private ConsumerIdentity consumerIdentity;

	private List<FraudShield> fraudShield;

	private List<InformationalMessage> informationalMessage;

	private List<Inquiry> inquiry;

	private Ofac ofac;

	private List<Summaries> summaries;

	private List<PublicRecord> publicRecord;

	private List<RiskModel> riskModel;

	private List<Ssn> ssn;

	private List<Tradeline> tradeline;

	public void setAddressInformation(List<AddressInformation> addressInformation) {
		this.addressInformation = addressInformation;
	}

	public List<AddressInformation> getAddressInformation() {
		return this.addressInformation;
	}

	public void setConsumerIdentity(ConsumerIdentity consumerIdentity) {
		this.consumerIdentity = consumerIdentity;
	}

	public ConsumerIdentity getConsumerIdentity() {
		return this.consumerIdentity;
	}

	public void setFraudShield(List<FraudShield> fraudShield) {
		this.fraudShield = fraudShield;
	}

	public List<FraudShield> getFraudShield() {
		return this.fraudShield;
	}

	public void setInformationalMessage(List<InformationalMessage> informationalMessage) {
		this.informationalMessage = informationalMessage;
	}

	public List<InformationalMessage> getInformationalMessage() {
		return this.informationalMessage;
	}

	public void setInquiry(List<Inquiry> inquiry) {
		this.inquiry = inquiry;
	}

	public List<Inquiry> getInquiry() {
		return this.inquiry;
	}

	public void setOfac(Ofac ofac) {
		this.ofac = ofac;
	}

	public Ofac getOfac() {
		return this.ofac;
	}

	public void setSummaries(List<Summaries> summaries) {
		this.summaries = summaries;
	}

	public List<Summaries> getSummaries() {
		return this.summaries;
	}

	public void setPublicRecord(List<PublicRecord> publicRecord) {
		this.publicRecord = publicRecord;
	}

	public List<PublicRecord> getPublicRecord() {
		return this.publicRecord;
	}

	public void setRiskModel(List<RiskModel> riskModel) {
		this.riskModel = riskModel;
	}

	public List<RiskModel> getRiskModel() {
		return this.riskModel;
	}

	public void setSsn(List<Ssn> ssn) {
		this.ssn = ssn;
	}

	public List<Ssn> getSsn() {
		return this.ssn;
	}

	public void setTradeline(List<Tradeline> tradeline) {
		this.tradeline = tradeline;
	}

	public List<Tradeline> getTradeline() {
		return this.tradeline;
	}
}
