package com.EChallenge.dao;

import com.EChallenge.model.Challenger;

public interface ChallengerDao {

	void add(Challenger challenger);

	void update(Challenger challenger);

	void delete(Challenger challenger);

	Challenger findByChallengerId(int challengerId);

}
