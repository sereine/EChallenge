package com.EChallenge.validateur;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.EChallenge.service.CompteService;

public class NomUtilisateurUniqueValidator implements ConstraintValidator<NomUtilisateurUnique, String>{

	@Autowired
	private CompteService compteService;
	
	public void initialize(NomUtilisateurUnique arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(String nomUtilisateur, ConstraintValidatorContext constraintContext) {
		
		System.out.println("***********annotation    "+nomUtilisateur);
		if(nomUtilisateur == null) {
            return false;
        }
		
		
		//if(compteService == null) System.out.println("***********annotation");
        if(compteService != null)
        if(compteService.nomUtilisateurExiste(nomUtilisateur))
			return false;
		return true;
	}

}
