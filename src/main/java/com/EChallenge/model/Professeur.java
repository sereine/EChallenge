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
@Table(name = "PROFESSEUR")
public class Professeur extends Challenger{

	@Id
    @GeneratedValue
	@Column(name = "professeurId")
	private int professeurId;
	
	
	@Column(name = "reference")
	private String reference;

	@OneToMany
	@JoinColumn(name="classeId")
	@Cascade(CascadeType.ALL)
	private Set<Classe> classes;
	
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

	public Set<Classe> getClasses() {
		return classes;
	}

	public void setClasses(Set<Classe> classes) {
		this.classes = classes;
	}
	
}
