package com.EChallenge.validateur;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(value= RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NomUtilisateurUniqueValidator.class)
@Documented
public @interface NomUtilisateurUnique {
	
	String message() default "Ce nom d'utilisateur existe déja";
	 
	Class<?>[] groups() default {};
	
	 
	Class<? extends Payload>[] payload() default {};

}
