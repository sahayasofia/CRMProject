package com.faith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.faith.model.Customer;
import com.faith.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	//need to injuct Service
	
	@GetMapping("/list")   //@GetMapping
	public String listCustomers(Model themodel) {
		
		//get customers from the service -> dao
		List<Customer> theCustomers = customerService.getCustomers();
		themodel.addAttribute("customers",theCustomers);
		
		return "list-customers";
		
	}

}
