package com.EChallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.ClasseDao;
import com.EChallenge.model.Classe;

@Service

public class ClasseServiceImplementation implements ClasseService{

	@Autowired
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
