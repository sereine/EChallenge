package com.EChallenge.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.EChallenge.model.Developpeur;

@Repository
@Transactional
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
