package com.EChallenge.service;

import com.EChallenge.model.Professeur;

public interface ProfesseurService {
	void add(Professeur professeur);

	void update(Professeur professeur);

	void delete(Professeur professeur);

	Professeur findByProfesseurId(int professeurId);

}
