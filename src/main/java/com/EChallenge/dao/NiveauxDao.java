package com.EChallenge.dao;

import com.EChallenge.model.Niveaux;

public interface NiveauxDao {
	void add(Niveaux niveaux);

	void update(Niveaux niveaux);

	void delete(Niveaux niveaux);

	Niveaux findByNiveauxId(int niveauxId);

}
