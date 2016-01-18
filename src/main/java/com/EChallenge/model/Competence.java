package com.EChallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPETENCE")
public class Competence {
	

	@Id
    @GeneratedValue
    @Column(name = "competenceId")
	private int competenceId;
	
    @Column(name = "nom")
	private String nom;
    
	public int getCompetenceId() {
		return competenceId;
	}
	public void setCompetenceId(int competenceId) {
		this.competenceId = competenceId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
