package com.EChallenge.dao;


import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.EChallenge.model.Compte;


@Repository
@Transactional
public class CompteDaoImplementation extends AbstractDao<Integer, Compte> implements CompteDao{

	public void add(Compte compte) {
		System.out.println("dao   "+compte.getNomUtilisateur());
		this.persist(compte);
		
	}

	public void update(Compte compte) {
		// TODO Auto-generated method stub
		this.modifier(compte);
	}

	public void delete(Compte compte) {
		// TODO Auto-generated method stub
		this.supprimer(compte);
	}

	public Compte findByCompteId(int compteId) {
		// TODO Auto-generated method stub
		return getByKey(compteId);
	}
	
	public Compte finfByUserName(String nomUtilisateur) {
		System.out.println("***********dao");
		String hql = "FROM Compte C WHERE C.nomUtilisateur= " + nomUtilisateur;
		System.out.println("***********"+this.getManager().createQuery(hql, Compte.class).getSingleResult().getNomUtilisateur());
		return this.getManager().createQuery(hql, Compte.class).getSingleResult();
	    
	}

}
