package com.experian.credit.report.model.response;

import java.util.List;

public class RiskModel {

	private String evaluation;

	private String modelIndicator;

	private String score;

	private List<ScoreFactors> scoreFactors;

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	public String getEvaluation() {
		return this.evaluation;
	}

	public void setModelIndicator(String modelIndicator) {
		this.modelIndicator = modelIndicator;
	}

	public String getModelIndicator() {
		return this.modelIndicator;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getScore() {
		return this.score;
	}

	public void setScoreFactors(List<ScoreFactors> scoreFactors) {
		this.scoreFactors = scoreFactors;
	}

	public List<ScoreFactors> getScoreFactors() {
		return this.scoreFactors;
	}
}
