package com.faith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.model.Customer;
import com.faith.repository.ICustomerDAO;

@Service
public class CustomerClassImplementation implements ICustomerService {
	
	//need to inject customer DAO
	@Autowired
	private ICustomerDAO customerDAO;
	@Override
	@Transactional 
	public void saveCustomers(Customer customer) {
		
		customerDAO.saveCustomers(customer);

	}
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public Customer getcustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDAO.getcustomer(theId);
	}

	@Override
	@Transactional
	public Customer deletecustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDAO.deletecustomer(theId);
	}

}
