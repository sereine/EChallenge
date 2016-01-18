package com.EChallenge.controller;

import java.util.Locale;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.EChallenge.model.Developpeur;


@Controller
public class Inscription {
	
	@RequestMapping(value = "/InscriptionDeveloppeur", method = RequestMethod.GET)
	public String inscriptionDeveloppeur(Model model) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      Developpeur developpeur = (Developpeur) context.getBean("Developpeur");
		model.addAttribute("Developpeur" , developpeur);
		
		return "InscriptionDeveloppeur";
	}
	
	

}
