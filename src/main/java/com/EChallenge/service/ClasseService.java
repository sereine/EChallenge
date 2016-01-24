package com.EChallenge.service;

import com.EChallenge.model.Classe;

public interface ClasseService {
	void add(Classe classe);

	void update(Classe classe);

	void delete(Classe classe);

	Classe findByClasseId(String classeId);

}
