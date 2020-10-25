package com.experian.credit.report.model.request;

public class ClarityData {
	private String clarityAccountId;

	private String clarityLocationId;

	private String clarityControlFileName;

	private String clarityControlFileVersion;

	public void setClarityAccountId(String clarityAccountId) {
		this.clarityAccountId = clarityAccountId;
	}

	public String getClarityAccountId() {
		return this.clarityAccountId;
	}

	public void setClarityLocationId(String clarityLocationId) {
		this.clarityLocationId = clarityLocationId;
	}

	public String getClarityLocationId() {
		return this.clarityLocationId;
	}

	public void setClarityControlFileName(String clarityControlFileName) {
		this.clarityControlFileName = clarityControlFileName;
	}

	public String getClarityControlFileName() {
		return this.clarityControlFileName;
	}

	public void setClarityControlFileVersion(String clarityControlFileVersion) {
		this.clarityControlFileVersion = clarityControlFileVersion;
	}

	public String getClarityControlFileVersion() {
		return this.clarityControlFileVersion;
	}
}
