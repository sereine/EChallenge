package com.EChallenge.dao;


import com.EChallenge.model.Compte;

public interface CompteDao {
	void add(Compte compte);

	void update(Compte compte);

	void delete(Compte compte);

	Compte findByCompteId(int compteId);	
}