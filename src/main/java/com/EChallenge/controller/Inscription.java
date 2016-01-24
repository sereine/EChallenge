package com.EChallenge.controller;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.EChallenge.dao.CompteDao;
import com.EChallenge.dao.EntrepriseDao;
import com.EChallenge.model.Classe;
import com.EChallenge.model.Compte;
import com.EChallenge.model.Developpeur;
import com.EChallenge.model.Entreprise;
import com.EChallenge.model.Etudiant;
import com.EChallenge.model.Professeur;


@Controller
public class Inscription {
	
	@RequestMapping(value = "/InscriptionDeveloppeur", method = RequestMethod.GET)
	public String inscriptionDeveloppeur(Model model) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      Developpeur developpeur = (Developpeur) context.getBean("Developpeur");
		model.addAttribute("Developpeur" , developpeur);
		
		return "InscriptionDeveloppeur";
	}
	
	@RequestMapping(value = "/InscriptionProfesseur", method = RequestMethod.GET)
	public String inscriptionProfesseur(Model model) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Professeur professeur = (Professeur) context.getBean("Professeur");
		model.addAttribute("Professeur" , professeur);
		
		return "InscriptionProfesseur";
	}
	
	@RequestMapping(value = "/InscriptionEtudiant", method = RequestMethod.GET)
	public String inscriptionEtudiant(Model model) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Etudiant etudiant = (Etudiant) context.getBean("Etudiant");
		model.addAttribute("Etudiant" , etudiant);
		
		return "InscriptionEtudiant";
	}
	
	@RequestMapping(value = "/InscriptionEntreprise", method = RequestMethod.GET)
	public String inscriptionEntreprise(Model model) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Entreprise entreprise = (Entreprise) context.getBean("Entreprise");
		model.addAttribute("Entreprise" , entreprise);
		
		return "InscriptionEntreprise";
	}
	
	
	
	
	
	@RequestMapping(value = "/AjouterClasse", method = RequestMethod.GET)
	public String AjouterClasse(Model model) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Classe classe = (Classe) context.getBean("Classe");
		model.addAttribute("Classe" , classe);
		
		return "AjouterClasse";
	}
	
	@RequestMapping(value = "/Authentification", method = RequestMethod.GET)
	public String Authentification(Model model) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Compte compte = (Compte) context.getBean("Compte");
		model.addAttribute("Compte" , compte);
		
		return "Authentification";
	}
	
	
}
