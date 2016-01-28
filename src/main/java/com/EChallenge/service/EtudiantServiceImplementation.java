package com.EChallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.EtudiantDao;
import com.EChallenge.model.Etudiant;

@Service

public class EtudiantServiceImplementation implements  EtudiantService{
	@Autowired
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
