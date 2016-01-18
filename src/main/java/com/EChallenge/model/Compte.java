package com.EChallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "COMPTE")
public class Compte {
	
	
	@Id
    @GeneratedValue
    @Column(name = "compteId")
	private int compteId;
	
	@Column(name = "motDePasse")
	private String motDePasse;

	@Column(name = "nomUtilisateur")
	private String nomUtilisateur;

	public int getId() {
		return compteId;
	}

	public void setId(int id) {
		this.compteId = id;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getCompteId() {
		return compteId;
	}

	public void setCompteId(int compteId) {
		this.compteId = compteId;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}


}

