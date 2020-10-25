package com.experian.credit.report.model.response;

public class InformationalMessage {

	private String messageNumber;

	private String messageNumberDetailed;

	private String messageText;

	public void setMessageNumber(String messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getMessageNumber() {
		return this.messageNumber;
	}

	public void setMessageNumberDetailed(String messageNumberDetailed) {
		this.messageNumberDetailed = messageNumberDetailed;
	}

	public String getMessageNumberDetailed() {
		return this.messageNumberDetailed;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getMessageText() {
		return this.messageText;
	}
}
