package com.faith.repository;

import java.util.List;

import com.faith.model.Customer;

public interface IRepository {

	
	//save the customers            CREATE  INSTERT
	
	public void saveCustomers(Customer customer);
	
	//list all the customers        RETRIVE SELECT
	
	
	public List<Customer> getCustomers();
		
	
	                               //UPDATE UPDATE
	
	
	//Search Customer
	
	public Customer getcustomer(int theId);
	
	//Delete customers              DELETE  DELETE
	public void deletecustomer(int theId);
}
