package com.EChallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.NiveauxDao;
import com.EChallenge.model.Niveaux;

@Service
public class NiveauxServiceImplementation implements NiveauxService{

	@Autowired
	private NiveauxDao niveauxdao;
	
	public void add(Niveaux niveaux) {
		
		System.out.println("Service  "+niveaux.getNiveauxId()+"  "+niveaux.getNiveau());
		niveauxdao.add(niveaux);
		
	}

	public void update(Niveaux niveaux) {
		niveauxdao.update(niveaux);
		
	}

	public void delete(Niveaux niveaux) {
		niveauxdao.delete(niveaux);
		
	}

	public Niveaux findByNiveauxId(int niveauxId) {
		// TODO Auto-generated method stub
		return niveauxdao.findByNiveauxId(niveauxId);
	}

}
