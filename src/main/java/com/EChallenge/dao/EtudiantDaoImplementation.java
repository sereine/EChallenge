package com.EChallenge.dao;

import com.EChallenge.model.Etudiant;

public class EtudiantDaoImplementation extends AbstractDao<Integer, Etudiant> implements EtudiantDao{

	public void add(Etudiant etudiant) {
        this.persist(etudiant);
	}

	public void update(Etudiant etudiant) {	
		this.modifier(etudiant);
	}

	public void delete(Etudiant etudiant) {
		this.supprimer(etudiant);
	}

	public Etudiant findByEtudiantId(int etudiantId) {

		return this.getByKey(etudiantId);
	}

}
