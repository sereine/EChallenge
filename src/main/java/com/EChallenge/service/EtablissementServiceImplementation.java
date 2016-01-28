package com.EChallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.EtablissementDao;
import com.EChallenge.model.Etablissement;

@Service
public class EtablissementServiceImplementation implements EtablissementService{

	@Autowired
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
