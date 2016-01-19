package com.EChallenge.service;

import com.EChallenge.model.Developpeur;

public interface DeveloppeurService {
	void add(Developpeur developpeur);

	void update(Developpeur developpeur);

	void delete(Developpeur developpeur);

	Developpeur findByDeveloppeurId(int developpeurId);

}
