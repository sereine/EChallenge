package com.EChallenge.dao;


import com.EChallenge.model.Classe;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.EChallenge.dao.AbstractDao;

@Repository
@Transactional
public class ClasseDaoImplementation extends AbstractDao<String, Classe> implements ClasseDao{

	public void add(Classe classe) {
		persist(classe);
	}

	public void update(Classe classe) {
		modifier(classe);
	}

	public void delete(Classe classe) {
		supprimer(classe);
	}

	public Classe findByClasseId(String classeId) {
		
		return this.getByKey(classeId);
	}

}
