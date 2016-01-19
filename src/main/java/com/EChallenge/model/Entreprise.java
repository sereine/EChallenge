package com.EChallenge.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

public class Entreprise {
	
	@Id
    @GeneratedValue
    @Column(name = "entrepriseId")
	private int entrepriseId;
	
    @Column(name = "nomEntreprise")
	private String nomEntreprise;
    
    @Column(name = "taille")
	private Integer taille;
    
    @Column(name = "adresse")
	private String adresse;
    
    @Column(name = "description")
	private String description;
    
    @Column(name = "tel")
	private String tel;
    
    @Column(name = "email")
	private String email;
    
    @OneToOne
	@JoinColumn(name = "compteId")
    private Compte compte;
    
    @OneToMany
    @JoinColumn(name = "developpeurId")
	@Cascade(CascadeType.ALL)
    private Set<Developpeur> developpeur;
    
    
	public int getEntrepriseId() {
		return entrepriseId;
	}
	public void setEntrepriseId(int entrepriseId) {
		this.entrepriseId = entrepriseId;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public Integer getTaille() {
		return taille;
	}
	public void setTaille(Integer taille) {
		this.taille = taille;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	public Set<Developpeur> getDeveloppeur() {
		return developpeur;
	}
	public void setDeveloppeur(Set<Developpeur> developpeur) {
		this.developpeur = developpeur;
	}
	

	
}
