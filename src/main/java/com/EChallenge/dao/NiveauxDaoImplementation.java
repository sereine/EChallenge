package com.EChallenge.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.EChallenge.model.Niveaux;

@Repository
@Transactional
public class NiveauxDaoImplementation extends AbstractDao<Integer, Niveaux> implements NiveauxDao{

	
	
	public void add(Niveaux niveaux) {
		System.out.println("DAO  "+niveaux.getNiveauxId()+"  "+niveaux.getNiveau());
		this.persist(niveaux);
		
	}

	
	public void update(Niveaux niveaux) {
		// TODO Auto-generated method stub
		this.modifier(niveaux);
	}


	public void delete(Niveaux niveaux) {
		// TODO Auto-generated method stub
		this.supprimer(niveaux);
	}

	public Niveaux findByNiveauxId(int niveauxId) {
		// TODO Auto-generated method stub
		return this.getByKey(niveauxId);
	}

}
