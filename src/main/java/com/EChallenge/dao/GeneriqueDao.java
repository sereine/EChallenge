package com.EChallenge.dao;

import java.io.Serializable;

public interface GeneriqueDao <T, PK extends Serializable>{
	
	PK create(T newInstance);

    T read(PK id);

    void update(T transientObject);
    
    void delete(T persistentObject);

}
