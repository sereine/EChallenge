package com.EChallenge.validateur;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.EChallenge.service.ChallengerService;
import com.EChallenge.service.ProfesseurService;

public class ReferenceExistValidateur implements ConstraintValidator<ReferenceExist, String> {

	@Autowired
	private ProfesseurService professeurService;

	public boolean isValid(String reference, ConstraintValidatorContext context) {
		if (reference == null) {
			return false;
		}
		 if(professeurService != null)
		    	if(professeurService.referenceExist(reference) == true)
		    		return true;
		return false;
	}

	public void initialize(ReferenceExist reference) {
		// TODO Auto-generated method stub

	}

}