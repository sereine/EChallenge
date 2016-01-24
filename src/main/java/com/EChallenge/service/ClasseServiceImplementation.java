package com.EChallenge.service;

import com.EChallenge.dao.ClasseDao;
import com.EChallenge.model.Classe;

public class ClasseServiceImplementation implements ClasseService{

	private ClasseDao classedao;
	
	public void add(Classe classe) {
		classedao.add(classe);
		
	}

	public void update(Classe classe) {
		classedao.update(classe);
		
	}

	public void delete(Classe classe) {
		classedao.delete(classe);
		
	}

	public Classe findByClasseId(String classeId) {
		return classedao.findByClasseId(classeId);
		
	}

}
