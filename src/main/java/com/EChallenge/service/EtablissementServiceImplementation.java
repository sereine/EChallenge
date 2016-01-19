package com.EChallenge.service;

import com.EChallenge.dao.EtablissementDao;
import com.EChallenge.model.Etablissement;

public class EtablissementServiceImplementation implements EtablissementService{

	private EtablissementDao etablissementdao;
	
	public void add(Etablissement etablissement) {
		etablissementdao.add(etablissement);
		
	}

	public void update(Etablissement etablissement) {
		etablissementdao.update(etablissement);
		
	}

	public void delete(Etablissement etablissement) {
		etablissementdao.delete(etablissement);
		
	}

	public Etablissement findByEtablissementId(int etablissementId) {
		// TODO Auto-generated method stub
		return etablissementdao.findByEtablissementId(etablissementId);
	}

}
