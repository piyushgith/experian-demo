package com.experian.credit.report.model.response;

public class Ofac {

	private String messageNumber;

	private String messageText;

	public void setMessageNumber(String messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getMessageNumber() {
		return this.messageNumber;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getMessageText() {
		return this.messageText;
	}
}
