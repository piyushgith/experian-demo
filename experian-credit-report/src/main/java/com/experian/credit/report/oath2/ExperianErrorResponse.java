package com.experian.credit.report.oath2;

import java.io.Serializable;
import java.util.List;

public class ExperianErrorResponse implements Serializable {
	private static final long serialVersionUID = 5147704344329077409L;

	private List<Errors> errors;

	public void setErrors(List<Errors> errors) {
		this.errors = errors;
	}

	public List<Errors> getErrors() {
		return this.errors;
	}
}
