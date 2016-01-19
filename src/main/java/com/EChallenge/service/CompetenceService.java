package com.EChallenge.service;

import com.EChallenge.model.Competence;

public interface CompetenceService {
	void add(Competence competence);

	void update(Competence competence);

	void delete(Competence competence);

	Competence findByCompetenceId(int competenceId);

}
