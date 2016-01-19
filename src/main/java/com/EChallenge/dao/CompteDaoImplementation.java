package com.EChallenge.dao;


import com.EChallenge.model.Compte;

public class CompteDaoImplementation extends AbstractDao<Integer, Compte> implements CompteDao{

	public void add(Compte compte) {
		this.persist(compte);
		
	}

	public void update(Compte compte) {
		// TODO Auto-generated method stub
		this.modifier(compte);
	}

	public void delete(Compte compte) {
		// TODO Auto-generated method stub
		this.supprimer(compte);
	}

	public Compte findByCompteId(int compteId) {
		// TODO Auto-generated method stub
		return getByKey(compteId);
	}

}
