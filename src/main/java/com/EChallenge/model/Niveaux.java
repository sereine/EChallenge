package com.EChallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NIVEAUX")
public class Niveaux {
	
	
	@Id
    @GeneratedValue
	@Column(name = "niveauxId")
	private int niveauxId;
	
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
