package com.nagarro.APIcustomer.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.APIcustomer.models.Customer;

@RestController
@RequestMapping("/")
public class CustomerResource {

	@RequestMapping("/customers")
	public List<Customer> getCustomers(){
		return Collections.singletonList(
				new Customer(1,1,"John","Punjab","0992836483")
			);
	}
}

