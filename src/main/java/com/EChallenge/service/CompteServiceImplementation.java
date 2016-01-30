package com.EChallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.CompteDao;
import com.EChallenge.model.Compte;

@Service
public class CompteServiceImplementation implements CompteService {

	@Autowired
	private CompteDao comptedao;

	public void add(Compte compte) {
		// TODO Auto-generated method stub
		System.out.println("service   " + compte.getNomUtilisateur());
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		// comptedao = (CompteDao) context.getBean("CompteDaoImplementation");
		comptedao.add(compte);
	}

	public void update(Compte compte) {
		// TODO Auto-generated method stub
		comptedao.update(compte);
	}

	public void delete(Compte compte) {
		// TODO Auto-generated method stub
		comptedao.delete(compte);
	}

	public Compte findByCompteId(int compteId) {
		// TODO Auto-generated method stub
		return comptedao.findByCompteId(compteId);
	}

	public boolean nomUtilisateurExiste(String nomUtilisateur) {


		System.out.println("***********servicee");
		
		if (comptedao.finfByUserName(nomUtilisateur) == null){
			
			System.out.println("***********after ");
			return false;
		}
			
		return true;
	}

}
