package com.EChallenge.dao;
import com.EChallenge.model.Etablissement;

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
