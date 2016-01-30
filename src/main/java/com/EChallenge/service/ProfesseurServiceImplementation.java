package com.EChallenge.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EChallenge.dao.ProfesseurDao;
import com.EChallenge.model.Professeur;

@Service

public class ProfesseurServiceImplementation implements ProfesseurService {
	@Autowired
	private ProfesseurDao professeurdao;
	
	public void add(Professeur professeur) {
		professeurdao.add(professeur);
		
	}

	public void update(Professeur professeur) {
		professeurdao.update(professeur);
		
	}

	public void delete(Professeur professeur) {
		professeurdao.delete(professeur);
		
	}

	public Professeur findByProfesseurId(int professeurId) {
		return professeurdao.findByProfesseurId(professeurId);
	}

	public Boolean referenceExist(String reference) {
		String fichier = "D://TroisiemeAnnee//Gestion de projet//Projet//Workspace//EChallenge//references.txt";
		// lecture du fichier texte
		
		System.out.println("****** service prof");
		try {
			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			while ((ligne = br.readLine()) != null) {
				//System.out.println("******************"+ligne);
				if (ligne.equals(reference) == true)
				{
					br.close();
					ipsr.close();
					ips.close();
					//System.out.println("****************existe");
					return true;
				}
					
			}
			br.close();
			ipsr.close();
			ips.close();
			return false;

		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

}
