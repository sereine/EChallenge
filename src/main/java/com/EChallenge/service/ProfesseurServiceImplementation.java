package com.EChallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.ProfesseurDao;
import com.EChallenge.model.Professeur;

@Service

public class ProfesseurServiceImplementation implements ProfesseurService {
	@Autowired
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
