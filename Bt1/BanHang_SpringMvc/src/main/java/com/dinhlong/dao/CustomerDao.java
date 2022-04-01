package com.dinhlong.dao;

import java.util.List;

import com.dinhlong.model.Customer;

public interface CustomerDao {
	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);
	public Customer getCustomerById(int id);
	public List<Customer> getAllCustomers();
}
