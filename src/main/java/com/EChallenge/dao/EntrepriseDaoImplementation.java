package com.EChallenge.dao;

import com.EChallenge.model.Entreprise;

public class EntrepriseDaoImplementation extends AbstractDao<Integer, Entreprise> implements EntrepriseDao{

	public void add(Entreprise entreprise) {
		this.persist(entreprise);
		
	}

	public void update(Entreprise entreprise) {
		this.modifier(entreprise);
		
	}

	public void delete(Entreprise entreprise) {
		// TODO Auto-generated method stub
		this.supprimer(entreprise);
	}

	public Entreprise findByEntrepriseId(int entrepriseId) {
		// TODO Auto-generated method stub
		return this.getByKey(entrepriseId);
	}

}
