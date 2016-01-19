package com.EChallenge.service;

import com.EChallenge.dao.EtudiantDao;
import com.EChallenge.model.Etudiant;

public class EtudiantServiceImplementation implements  EtudiantService{

	private EtudiantDao etudiantdao;
	
	public void add(Etudiant etudiant) {
		etudiantdao.add(etudiant);
		
	}

	public void update(Etudiant etudiant) {
		etudiantdao.update(etudiant);
		
	}

	public void delete(Etudiant etudiant) {
		etudiantdao.delete(etudiant);
		
	}

	public Etudiant findByEtudiantId(int etudiantId) {
		return etudiantdao.findByEtudiantId(etudiantId);
	}

}
