package com.EChallenge.validateur;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(value= RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NomUtilisateurUniqueValidator.class)
@Documented
public @interface NomUtilisateurUnique {
	
	String message() default "Ce nom d'utilisateur existe déja";
	 
	Class<?>[] groups() default {};
	
	 
	Class<? extends Payload>[] payload() default {};

}
