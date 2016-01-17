package com.EChallenge.model;

public class Professeur extends Challenger{

	private int professeurId;
	private String reference;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getProfesseurId() {
		return professeurId;
	}

	public void setProfesseurId(int professeurId) {
		this.professeurId = professeurId;
	}
	
}
