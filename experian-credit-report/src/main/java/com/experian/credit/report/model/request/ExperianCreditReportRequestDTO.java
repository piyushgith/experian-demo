package com.experian.credit.report.model.request;

import java.io.Serializable;

public class ExperianCreditReportRequestDTO implements Serializable {

	private ConsumerPii consumerPii;

	private Requestor requestor;

	private PermissiblePurpose permissiblePurpose;

	private ResellerInfo resellerInfo;

	private AddOns addOns;

	private CustomOptions customOptions;

	public void setConsumerPii(ConsumerPii consumerPii) {
		this.consumerPii = consumerPii;
	}

	public ConsumerPii getConsumerPii() {
		return this.consumerPii;
	}

	public void setRequestor(Requestor requestor) {
		this.requestor = requestor;
	}

	public Requestor getRequestor() {
		return this.requestor;
	}

	public void setPermissiblePurpose(PermissiblePurpose permissiblePurpose) {
		this.permissiblePurpose = permissiblePurpose;
	}

	public PermissiblePurpose getPermissiblePurpose() {
		return this.permissiblePurpose;
	}

	public void setResellerInfo(ResellerInfo resellerInfo) {
		this.resellerInfo = resellerInfo;
	}

	public ResellerInfo getResellerInfo() {
		return this.resellerInfo;
	}

	public void setAddOns(AddOns addOns) {
		this.addOns = addOns;
	}

	public AddOns getAddOns() {
		return this.addOns;
	}

	public void setCustomOptions(CustomOptions customOptions) {
		this.customOptions = customOptions;
	}

	public CustomOptions getCustomOptions() {
		return this.customOptions;
	}
}
