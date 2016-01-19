package com.EChallenge.service;

import com.EChallenge.model.Entreprise;

public interface EntrepriseService {
	
	void add(Entreprise entreprise);

	void update(Entreprise entreprise);

	void delete(Entreprise entreprise);

	Entreprise findByEntrepriseId(int entrepriseId);
}
