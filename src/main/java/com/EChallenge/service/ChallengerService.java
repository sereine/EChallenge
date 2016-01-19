package com.EChallenge.service;

import com.EChallenge.model.Challenger;

public interface ChallengerService {

	void add(Challenger challenger);

	void update(Challenger challenger);

	void delete(Challenger challenger);

	Challenger findByChallengerId(int challengeId);
}
