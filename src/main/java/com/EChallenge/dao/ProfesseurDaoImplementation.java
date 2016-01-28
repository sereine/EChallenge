package com.EChallenge.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.EChallenge.model.Professeur;

@Repository
@Transactional
public class ProfesseurDaoImplementation extends AbstractDao<Integer, Professeur> implements ProfesseurDao{

	public void add(Professeur professeur) {
		this.persist(professeur);
	}

	public void update(Professeur professeur) {
		this.modifier(professeur);
	}

	public void delete(Professeur professeur) {
		this.supprimer(professeur);
	}

	public Professeur findByProfesseurId(int professeurId) {
		
		return this.getByKey(professeurId);
	}

}
