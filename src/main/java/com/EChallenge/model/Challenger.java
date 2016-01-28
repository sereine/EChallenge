package com.EChallenge.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "CHALLENGER")
public class Challenger {
	
	@Id
    @GeneratedValue( strategy= GenerationType.AUTO)
    @Column(name = "challengerId")
	private int challengerId;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "tel")
	private String tel;
	
	
	@OneToMany
	@JoinColumn(name="competenceId")
	@Cascade(CascadeType.ALL)
	private Set<Competence> competences;
	
	
	@OneToOne
	@JoinColumn(name = "compteId")
	private Compte compte;
	
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
	public Set<Competence> getCompetences() {
		return competences;
	}
	public void setCompetences(Set<Competence> competences) {
		this.competences = competences;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	

}
