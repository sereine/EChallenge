package com.EChallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;






@Entity
@Table(name = "CHALLENGER")
public class Challenger {
	
	@Id
    @GeneratedValue
    @Column(name = "challengerId")
	private int challengerId;
	
	@Column(name = "challengerId")
	private String nom;
	
	@Column(name = "challengerId")
	private String prenom;
	
	@Column(name = "challengerId")
	private String email;
	
	@Column(name = "challengerId")
	private String tel;
	
	
	
	public int getChallengerId() {
		return challengerId;
	}
	public void setChallengerId(int challengerId) {
		this.challengerId = challengerId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
