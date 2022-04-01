package com.dinhlong.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dinhlong.model.Customer;
import com.dinhlong.service.CustomerService;
import com.dinhlong.validator.CustomerValidator;

@Controller
public class CustomerController {
	@Autowired
	CustomerValidator customerValidator;
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = {"/list-customer"},method = RequestMethod.GET)
	public String listCustomer(HttpServletRequest request) {
		List<Customer> customers = customerService.getAllCustomers();
		request.setAttribute("customers", customers);
		return "customer/listCustomer";
	}
	
	@RequestMapping(value = {"/detail-customer/{customerId}"},method = RequestMethod.GET)
	public String listCustomer(HttpServletRequest request,@PathVariable(name = "customerId")int customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		request.setAttribute("customer", customer);
		return "customer/detailCustomer";
	}
	
	@RequestMapping(value = {"/delete-customer/{customerId}"},method = RequestMethod.GET)
	public String deleteCustomer(HttpServletRequest request,@PathVariable(name = "customerId")int id) {
		customerService.deleteCustomer(id);
		return "redirect:/list-customer";
	}
	
	@RequestMapping(value = {"/add-customer"},method = RequestMethod.GET)
	public String addCustomer(HttpServletRequest request) {
		request.setAttribute("customer", new Customer());
		return "customer/addCustomer";
	}
	
	@RequestMapping(value = {"/add-customer"},method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer")Customer customer,HttpServletRequest request, BindingResult bindingResult
			,@RequestParam(name = "birthday")String birthday) {
		customerValidator.validate(customer, bindingResult);
		if(bindingResult.hasErrors()) {
			return "customer/addCustomer";
		}
		customerService.addCustomer(customer);
		return "redirect:/list-customer";
	}
	
	@RequestMapping(value = {"/update-customer/{customerId}"},method = RequestMethod.GET)
	public String updateCustomer(HttpServletRequest request,@PathVariable(name = "customerId")int id) {
		Customer customer = customerService.getCustomerById(id);
		request.setAttribute("customer", customer);
		return "customer/updateCustomer";
	}
	
	@RequestMapping(value = {"/update-customer"},method = RequestMethod.POST)
	public String updateCustomer(@ModelAttribute("customer")Customer customer,BindingResult bindingResult) {
		customerValidator.validate(customer, bindingResult);
		if(bindingResult.hasErrors()) {
			return "customer/updateCustomer";
		}
		customerService.updateCustomer(customer);
		return "redirect:/list-customer";
	}
	
	
}
