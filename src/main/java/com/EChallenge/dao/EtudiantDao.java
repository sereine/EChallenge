package com.EChallenge.dao;

import com.EChallenge.model.Etudiant;

public interface EtudiantDao {
	void add(Etudiant etudiant);

	void update(Etudiant etudiant);

	void delete(Etudiant etudiant);

	Etudiant findByEtudiantId(int etudiantId);

}
