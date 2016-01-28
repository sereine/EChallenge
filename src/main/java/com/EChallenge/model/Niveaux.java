package com.EChallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NIVEAUX")
public class Niveaux {
	
	
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO)
	@Column(name = "niveauxId")
	private int niveauxId;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "niveau")
	private EnumNiveaux niveau;

	public int getNiveauxId() {
		return niveauxId;
	}

	public void setNiveauxId(int niveauxId) {
		this.niveauxId = niveauxId;
	}

	public EnumNiveaux getNiveau() {
		return niveau;
	}

	public void setNiveau(EnumNiveaux niveau) {
		this.niveau = niveau;
	}

}
