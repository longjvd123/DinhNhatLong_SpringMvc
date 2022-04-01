package com.dinhlong.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.dinhlong.model.User;

@Component
public class UserValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		 
		return User.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if(user.getName() == null || user.getName().length() ==0) {
			errors.rejectValue("name", "field.required");
		}
		
		if(user.getPassword().length()<6 || user.getPassword().length()>12) {
			errors.rejectValue("password", "password.invalid");
		}
	}

}
