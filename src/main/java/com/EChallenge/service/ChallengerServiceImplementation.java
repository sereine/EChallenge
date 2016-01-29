package com.EChallenge.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.ChallengerDao;
import com.EChallenge.model.Challenger;

@Service

public class ChallengerServiceImplementation implements ChallengerService{

	@Autowired
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

	public Boolean emailExist(String email) {
		// TODO Auto-generated method stub
		List<String> emails=challengerdao.findEmails();
		 for(Iterator<String> it=emails.iterator(); it.hasNext();)
		 {
			 if(it.next().equals(email)==true)
				 return true;
		 }
		
		return false;
	}

}
