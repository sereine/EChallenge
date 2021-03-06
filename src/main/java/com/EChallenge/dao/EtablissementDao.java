package com.EChallenge.dao;

import com.EChallenge.model.Etablissement;

public interface EtablissementDao {
	void add(Etablissement etablissement);

	void update(Etablissement etablissement);

	void delete(Etablissement etablissement);

	Etablissement findByEtablissementId(int etablissementId);

}
