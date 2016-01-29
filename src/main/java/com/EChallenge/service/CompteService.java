package com.EChallenge.service;

import com.EChallenge.model.Compte;

public interface CompteService {
	void add(Compte compte);

	void update(Compte compte);

	void delete(Compte compte);

	Compte findByCompteId(int compteId);
	
	boolean nomUtilisateurExiste(String nomUtilisateur); 

}
