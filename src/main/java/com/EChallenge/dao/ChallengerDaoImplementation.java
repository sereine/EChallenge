package com.EChallenge.dao;

import com.EChallenge.model.Challenger;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.EChallenge.dao.AbstractDao;

@Repository
@Transactional
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

	public List<String> findEmails() {
	        Query query = getManager().createQuery("select email from CHALLENGER ");
	        List<String> emails = query.getResultList();
		    return emails;
	}

}
