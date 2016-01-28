package com.EChallenge.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		
		return (T) getManager().find(persistentClass, key);
	}

	
	public void persist(T entity) {
		System.out.println("AbsDAO  ");
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//manager = (EntityManager) context.getBean("myEmf");
		getManager().persist(entity);
	}

	public void supprimer(T entity) {
		getManager().remove(entity);
	}
	
	public void modifier(T entity) {
		getManager().merge(entity);
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
}
