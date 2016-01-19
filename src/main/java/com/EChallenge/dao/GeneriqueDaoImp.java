package com.EChallenge.dao;

import java.io.Serializable;

public class GeneriqueDaoImp<T, PK extends Serializable>  
	implements GeneriqueDao<T, PK> {
	
	private Class<T> type;

    public GeneriqueDaoImp(Class<T> type) {
        this.type = type;
    }

	/*public PK create(T newInstance) {
		return (PK) getSession().save(o);
		
	}*/

	public T read(PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(T transientObject) {
		// TODO Auto-generated method stub
		
	}

	public void delete(T persistentObject) {
		// TODO Auto-generated method stub
		
	}

	public PK create(T newInstance) {
		// TODO Auto-generated method stub
		return null;
	}

}
