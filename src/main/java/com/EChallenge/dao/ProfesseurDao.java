package com.EChallenge.dao;

import com.EChallenge.model.Professeur;

public interface ProfesseurDao {
	
	void add(Professeur professeur);

	void update(Professeur professeur);

	void delete(Professeur professeur);

	Professeur findByProfesseurId(int professeurId);

}
