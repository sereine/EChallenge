package com.EChallenge.service;

import com.EChallenge.dao.CompteDao;
import com.EChallenge.model.Compte;

public class CompteServiceImplementation implements CompteService {

	private CompteDao comptedao;
	
	public void add(Compte compte) {
		// TODO Auto-generated method stub
		comptedao.add(compte);
	}

	public void update(Compte compte) {
		// TODO Auto-generated method stub
		comptedao.update(compte);
	}

	public void delete(Compte compte) {
		// TODO Auto-generated method stub
		comptedao.delete(compte);
	}

	public Compte findByCompteId(int compteId) {
		// TODO Auto-generated method stub
		return 		comptedao.findByCompteId(compteId);
	}

}
