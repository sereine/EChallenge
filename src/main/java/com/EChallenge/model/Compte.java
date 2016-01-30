package com.EChallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.EChallenge.validateur.NomUtilisateurUnique;


@Entity
@Table(name = "COMPTE")
public class Compte {
	
	
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO)
    @Column(name = "compteId")
	private int compteId;
	
	//@Min(8)
	@NotNull
	@Column(name = "motDePasse")
	private String motDePasse;

	@NotNull
	@NomUtilisateurUnique
	@Column(name = "nomUtilisateur")
	private String nomUtilisateur;

	
	public int getCompteId() {
		return compteId;
	}

	public void setCompteId(int compteId) {
		this.compteId = compteId;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}


}

