package com.EChallenge.dao;

import com.EChallenge.model.Challenger;
import com.EChallenge.dao.AbstractDao;


public class ChallengerDaoImplementation extends AbstractDao<Integer, Challenger> implements ChallengerDao {

	public void add(Challenger challenger) {
		this.persist(challenger);
	}

	public void update(Challenger challenger) {
		this.modifier(challenger);

	}

	public void delete(Challenger challenger) {
		this.supprimer(challenger);

	}

	public Challenger findByChallengerId(int challengerId) {
		return this.getByKey(challengerId);
	}

}
