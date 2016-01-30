package com.EChallenge.validateur;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.EChallenge.service.ProfesseurService;

public class ReferenceExistValidateur implements ConstraintValidator<ReferenceExist, String> {

	@Autowired
	private ProfesseurService professeurService;

	public boolean isValid(String reference, ConstraintValidatorContext context) {
		if (reference == null) {
			return false;
		}
		 return !professeurService.referenceExist(reference);
	}

	public void initialize(ReferenceExist reference) {
		// TODO Auto-generated method stub

	}

}