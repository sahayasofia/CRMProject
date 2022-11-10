package com.faith.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faith.model.Customer;

@Service
public interface ICustomerService {
	
	
	
	//save the customers            CREATE  INSTERT
	
	public void saveCustomers(Customer customer);
	
	//list all the customers        RETRIVE SELECT
	
	
	public List<Customer> getCustomers();
		
	
	                               //UPDATE UPDATE
	
	
	//Search Customer
	
	public Customer getcustomer(int theId);
	
	//Delete customers              DELETE  DELETE
	public Customer deletecustomer(int theId);
	
	

}
