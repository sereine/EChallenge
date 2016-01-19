package com.EChallenge.dao;

import com.EChallenge.model.Classe;

public interface ClasseDao {
	void add(Classe classe);

	void update(Classe classe);

	void delete(Classe classe);

	Classe findByClasseId(int classeId);

}
