package com.impulse.coaching.customer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

	private static final List<Customer> CUSTOMERS = List.of(
			new  Customer(101,"Vishal", "Jain", "v@gmail.com"),
			new  Customer(102,"Vishal1", "Jain", "v2@gmail.com"),
			new  Customer(103,"Vishal2", "Jain", "v3@gmail.com"),
			new  Customer(104,"Vishal3", "Jain", "v4@gmail.com")
			);
	
	@GetMapping()
	public List<Customer> findAllCustomer(){
		return CUSTOMERS;
	}
}
