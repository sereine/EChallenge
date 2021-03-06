package com.EChallenge.dao;


import com.EChallenge.model.Competence;

public interface CompetenceDao {

	void add(Competence competence);

	void update(Competence competence);

	void delete(Competence competence);

	Competence findByCompetenceId(int competenceId);
}
