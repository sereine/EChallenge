package com.EChallenge.validateur;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = EmailUniqueUniqueValidateur.class)
@Documented
public @interface EmailUnique {
	
	String message() default "Adresse e-mail invalide";
	Class<String>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
