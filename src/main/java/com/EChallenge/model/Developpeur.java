package com.EChallenge.model;

public class Developpeur extends Challenger{
	
	private int developpeurId;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDeveloppeurId() {
		return developpeurId;
	}

	public void setDeveloppeurId(int developpeurId) {
		this.developpeurId = developpeurId;
	}
}
