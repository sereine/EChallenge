package com.EChallenge.service;

import com.EChallenge.dao.ChallengerDao;
import com.EChallenge.model.Challenger;

public class ChallengerServiceImplementation implements ChallengerService{

	private ChallengerDao challengerdao;
	
	public void add(Challenger challenger) {
		challengerdao.add(challenger);
	}

	public void update(Challenger challenger) {
		challengerdao.update(challenger);

	}

	public void delete(Challenger challenger) {
		challengerdao.delete(challenger);

	}

	public Challenger findByChallengerId(int challengeId) {
		return challengerdao.findByChallengerId(challengeId);
	}

}
