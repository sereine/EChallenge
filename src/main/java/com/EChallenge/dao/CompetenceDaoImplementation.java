package com.EChallenge.dao;


import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.EChallenge.model.Competence;


@Repository
@Transactional
public class CompetenceDaoImplementation extends AbstractDao<Integer, Competence> implements CompetenceDao {

	public void add(Competence competence) {
		// TODO Auto-generated method stub
		persist(competence);
	}

	public void update(Competence competence) {
		// TODO Auto-generated method stub
		modifier(competence);
	}

	public void delete(Competence competence) {
		// TODO Auto-generated method stub
		supprimer(competence);
	}

	public Competence findByCompetenceId(int competenceId) {
		// TODO Auto-generated method stub
		return getByKey(competenceId);
	}

}
