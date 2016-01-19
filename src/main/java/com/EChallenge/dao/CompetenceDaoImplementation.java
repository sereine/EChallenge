package com.EChallenge.dao;


import com.EChallenge.model.Competence;

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
