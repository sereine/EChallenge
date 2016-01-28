package com.EChallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.EntrepriseDao;
import com.EChallenge.model.Entreprise;

@Service
public class EntrepriseServiceImplementation implements EntrepriseService{

	@Autowired
	private EntrepriseDao entreprisedao;
	
	
	public void add(Entreprise entreprise) {
		// TODO Auto-generated method stub
		entreprisedao.add(entreprise);
	}

	public void update(Entreprise entreprise) {
		// TODO Auto-generated method stub
		entreprisedao.update(entreprise);
	}

	public void delete(Entreprise entreprise) {
		// TODO Auto-generated method stub
		entreprisedao.delete(entreprise);
	}

	public Entreprise findByEntrepriseId(int entrepriseId) {
		return entreprisedao.findByEntrepriseId(entrepriseId);
		
	}

}
