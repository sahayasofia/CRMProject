package com.faith.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.faith.model.Customer;

@Repository
public class RepositoryImplement implements IRepository {

	@Autowired
	private SessionFactory session;

	
	@Override
	public void saveCustomers(Customer customer) {
		Session createsession = session.getCurrentSession();
		createsession.save(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		Session createsession = session.getCurrentSession();
		Query<Customer> query = createsession.createQuery("from customernew order by ", Customer.class);
		List<Customer> custoemr = query.getResultList();
		return custoemr;
	}

	@Override
	public Customer getcustomer(int theId) {
		Session createsession = session.getCurrentSession();
		Customer customer = createsession.get(Customer.class, theId);
		return customer;
	}

	@Override
	public void deletecustomer(int theId) {
		Session createsession = session.getCurrentSession();
		Customer customer = createsession.get(Customer.class, theId);
		Query query = createsession.createQuery("delete the customernew where id:=customerid");
		query.setParameter("customerid", theId);
		query.executeUpdate();
	}

}
