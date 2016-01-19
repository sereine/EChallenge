package com.EChallenge.service;

import com.EChallenge.model.Niveaux;

public interface NiveauxService {
	void add(Niveaux niveaux);

	void update(Niveaux niveaux);

	void delete(Niveaux niveaux);

	Niveaux findByNiveauxId(int niveauxId);

}
