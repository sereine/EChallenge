package com.EChallenge.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "ETABLISSEMENT")
public class Etablissement {
	
	@Id
    @GeneratedValue
	@Column(name = "etablissementId")
	private int etablissementId;
	
	@Column(name = "nom")
    private String nom;
	
	@Column(name = "adresse")
    private String adresse;
	
	@Column(name = "tel")
    private String tel;
	
	@OneToMany(mappedBy="etablissement")
	@Cascade(CascadeType.ALL)
	private Set<Classe> classes;
	
	
	public int getEtablissementId() {
		return etablissementId;
	}
	public void setEtablissmentId(int etablissementId) {
		this.etablissementId = etablissementId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Set<Classe> getClasses() {
		return classes;
	}
	public void setClasses(Set<Classe> classes) {
		this.classes = classes;
	}
    
	

}
