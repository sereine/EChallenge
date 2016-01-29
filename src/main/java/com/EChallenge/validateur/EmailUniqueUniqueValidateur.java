package com.EChallenge.validateur;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.EChallenge.service.ChallengerService;

public class EmailUniqueUniqueValidateur implements ConstraintValidator<EmailUnique, String> {

	@Autowired
	private ChallengerService challengerService;
	
	public void initialize(EmailUnique arg0) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String email, ConstraintValidatorContext context) {
		if(email == null) {
            return false;
        }
        
        
        if(challengerService != null)
	    	if(challengerService.emailExist(email) == true)
	    		return false;
	    	
	        return true;
	}

}