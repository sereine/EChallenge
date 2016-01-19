package com.EChallenge.service;

import com.EChallenge.model.Etablissement;

public interface EtablissementService {
	void add(Etablissement etablissement);

	void update(Etablissement etablissement);

	void delete(Etablissement etablissement);

	Etablissement findByEtablissementId(int etablissementId);

}
