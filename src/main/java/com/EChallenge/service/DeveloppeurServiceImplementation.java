package com.EChallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.DeveloppeurDao;
import com.EChallenge.model.Developpeur;

@Service
public class DeveloppeurServiceImplementation implements DeveloppeurService {
	
	@Autowired
	private DeveloppeurDao developpeurdao;
	
	public void add(Developpeur developpeur) {
		developpeurdao.add(developpeur);
		
	}

	public void update(Developpeur developpeur) {
		developpeurdao.update(developpeur);
		
	}

	public void delete(Developpeur developpeur) {
		developpeurdao.delete(developpeur);
		
	}

	public Developpeur findByDeveloppeurId(int developpeurId) {
		return developpeurdao.findByDeveloppeurId(developpeurId);
	}

}
