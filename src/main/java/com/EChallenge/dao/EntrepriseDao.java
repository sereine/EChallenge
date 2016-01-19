package com.EChallenge.dao;

import com.EChallenge.model.Entreprise;

public interface EntrepriseDao {

	void add(Entreprise entreprise);

	void update(Entreprise entreprise);

	void delete(Entreprise entreprise);

	Entreprise findByEntrepriseId(int entrepriseId);
}