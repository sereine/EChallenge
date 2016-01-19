package com.EChallenge.service;

import com.EChallenge.dao.NiveauxDao;
import com.EChallenge.model.Niveaux;

public class NiveauxServiceImplementation implements NiveauxService{

	private NiveauxDao niveauxdao;
	
	public void add(Niveaux niveaux) {
		niveauxdao.add(niveaux);
		
	}

	public void update(Niveaux niveaux) {
		niveauxdao.update(niveaux);
		
	}

	public void delete(Niveaux niveaux) {
		niveauxdao.delete(niveaux);
		
	}

	public Niveaux findByNiveauxId(int niveauxId) {
		// TODO Auto-generated method stub
		return niveauxdao.findByNiveauxId(niveauxId);
	}

}
