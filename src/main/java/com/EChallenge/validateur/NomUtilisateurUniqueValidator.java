package com.EChallenge.validateur;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.EChallenge.service.CompteService;

public class NomUtilisateurUniqueValidator implements ConstraintValidator<NomUtilisateurUnique, String>{

	@Autowired
	CompteService compteService;
	
	public void initialize(NomUtilisateurUnique arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(String nomUtilisateur, ConstraintValidatorContext constraintContext) {
		if(nomUtilisateur == null) {
            return false;
        }
        
		if(compteService.nomUtilisateurExiste(nomUtilisateur))
			return false;
		return true;
	}

}
