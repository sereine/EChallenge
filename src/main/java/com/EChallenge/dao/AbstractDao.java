package com.EChallenge.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@PersistenceContext
    private EntityManager manager;

	

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		
		return (T) manager.find(persistentClass, key);
	}

	public void persist(T entity) {
		manager.persist(entity);
	}

	public void supprimer(T entity) {
		manager.remove(entity);
	}
	
	public void modifier(T entity) {
		manager.merge(entity);
	}
	
}
