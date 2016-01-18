package com.EChallenge.model;

public class Compte {
	
	private int compteId;
	private String nomUtilisateur;
	private String password;
		
	public int getId() {
		return compteId;
	}

	public void setId(int id) {
		this.compteId = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
