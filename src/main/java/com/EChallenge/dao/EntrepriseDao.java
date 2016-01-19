package com.EChallenge.dao;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.EChallenge.model.Entreprise;

public class EntrepriseDao {

	private SessionFactory sessionFactory;
	Session session;
	Transaction tx;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("deprecation")
	public void save(Entreprise entreprise) throws NullPointerException, SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = (Transaction) session.beginTransaction();
			session.saveOrUpdate(entreprise);
			tx.commit();
		} catch (NullPointerException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			session.close();
		}

	}
}