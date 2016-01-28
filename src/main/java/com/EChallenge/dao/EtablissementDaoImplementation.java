package com.EChallenge.dao;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.EChallenge.model.Etablissement;


@Repository
@Transactional
public class EtablissementDaoImplementation extends AbstractDao<Integer, Etablissement> implements EtablissementDao{

	public void add(Etablissement etablissement) {
		// TODO Auto-generated method stub
		this.persist(etablissement);
	}

	public void update(Etablissement etablissement) {
		// TODO Auto-generated method stub
		this.modifier(etablissement);
	}

	public void delete(Etablissement etablissement) {
		// TODO Auto-generated method stub
		this.supprimer(etablissement);
	}

	public Etablissement findByEtablissementId(int etablissementId) {
		// TODO Auto-generated method stub
		return this.getByKey(etablissementId);
	}

}
