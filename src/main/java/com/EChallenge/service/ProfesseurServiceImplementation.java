package com.EChallenge.service;

import com.EChallenge.dao.ProfesseurDao;
import com.EChallenge.model.Professeur;

public class ProfesseurServiceImplementation implements ProfesseurService {

	private ProfesseurDao professeurdao;
	
	public void add(Professeur professeur) {
		professeurdao.add(professeur);
		
	}

	public void update(Professeur professeur) {
		professeurdao.update(professeur);
		
	}

	public void delete(Professeur professeur) {
		professeurdao.delete(professeur);
		
	}

	public Professeur findByProfesseurId(int professeurId) {
		return professeurdao.findByProfesseurId(professeurId);
	}

}
