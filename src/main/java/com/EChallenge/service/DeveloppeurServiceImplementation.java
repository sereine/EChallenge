package com.EChallenge.service;

import com.EChallenge.dao.DeveloppeurDao;
import com.EChallenge.model.Developpeur;

public class DeveloppeurServiceImplementation implements DeveloppeurService {

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
