package com.EChallenge.service;

import com.EChallenge.dao.CompetenceDao;
import com.EChallenge.model.Competence;

public class CompetenceServiceImplementation implements CompetenceService{

	
	private CompetenceDao competencedao;
	
	
	public void add(Competence competence) {
		competencedao.add(competence);
		
	}

	public void update(Competence competence) {
		competencedao.update(competence);
		
	}

	public void delete(Competence competence) {
		competencedao.delete(competence);
	}

	public Competence findByCompetenceId(int competenceId) {
		
		return competencedao.findByCompetenceId(competenceId);
	}

}
