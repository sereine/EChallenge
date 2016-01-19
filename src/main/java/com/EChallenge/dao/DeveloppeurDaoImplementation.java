package com.EChallenge.dao;

import com.EChallenge.model.Developpeur;

public class DeveloppeurDaoImplementation extends AbstractDao<Integer, Developpeur> implements DeveloppeurDao{

	public void add(Developpeur developpeur) {
		this.persist(developpeur);
	}

	public void update(Developpeur developpeur) {
		this.modifier(developpeur);
	}

	public void delete(Developpeur developpeur) {
		this.supprimer(developpeur);
	}

	public Developpeur findByDeveloppeurId(int developpeurId) {
		return this.getByKey(developpeurId);
	}

}
