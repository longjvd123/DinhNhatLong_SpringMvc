package com.dinhlong.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.dinhlong.model.Customer;

@Component
public class CustomerValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Customer.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Customer customer = (Customer) target;
		
		if(customer.getLastname() == null ||  customer.getLastname().length()==0) {
			errors.rejectValue("lastname", "lastname.fieldrequired");
		}
		if(customer.getFirstname() == null ||  customer.getFirstname().length()==0) {
			errors.rejectValue("firstname", "firstname.fieldrequired");
		}
		if(customer.getEmail() == null ||  customer.getEmail().length()==0) {
			errors.rejectValue("email", "email.fieldrequired");
		}
		if(customer.getPhone()== null ||  customer.getPhone().length()==0) {
			errors.rejectValue("phone", "phone.fieldrequired");
		}
		if(customer.getAddress() == null ||  customer.getAddress().length()==0) {
			errors.rejectValue("address", "address.fieldrequired");
		}
		
	}
	
}
