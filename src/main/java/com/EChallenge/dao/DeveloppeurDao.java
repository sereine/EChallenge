package com.EChallenge.dao;

import com.EChallenge.model.Developpeur;

public interface DeveloppeurDao {
	void add(Developpeur developpeur);

	void update(Developpeur developpeur);

	void delete(Developpeur developpeur);

	Developpeur findByDeveloppeurId(int developpeurId);

}
