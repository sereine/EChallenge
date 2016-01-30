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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import com.EChallenge.validateur.EmailUnique;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "CHALLENGER")
public class Challenger {
	
	@Id
    @GeneratedValue( strategy= GenerationType.AUTO)
    @Column(name = "challengerId")
	private int challengerId;
	
	@NotNull
	@Size(min=1, message="nom doit étre rempli")
	@Column(name = "nom")
	private String nom;
	
	@NotNull
	@Column(name = "prenom")
	private String prenom;
	
	@NotNull
	@EmailUnique
	@Pattern(regexp="^[A-Za-z0-9._-]+@[A-Za-z0-9._-]{2,}\\.[a-z]{2,4}$" )
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Pattern(regexp="^((06)|(05))([0-9]){8}$" , message="coco")
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
