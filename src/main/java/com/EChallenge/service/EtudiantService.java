package com.EChallenge.service;

import com.EChallenge.model.Etudiant;

public interface EtudiantService {
	void add(Etudiant etudiant);

	void update(Etudiant etudiant);

	void delete(Etudiant etudiant);

	Etudiant findByEtudiantId(int etudiantId);

}
