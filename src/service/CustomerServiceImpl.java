package service;

import entities.*;
import dao.*;
import exceptions.*;

import java.util.*;

public class CustomerServiceImpl implements ICustomerService {
	private ICustomerDao dao;

	public CustomerServiceImpl(ICustomerDao dao) {
		this.dao = dao;
	}

	@Override
	public void addCustomer(Customer c) {
		dao.addCustomer(c);
	}

	@Override
	public Customer findByMobileno(String mobileno) {
		if (mobileno.length() != 10) {
			throw new IncorrectMobNoException("Mobile number is incorrect");
		}

		Customer c = dao.findByMobileNo(mobileno);
		return c;
	}

	@Override
	public Set<Customer> allCustomers() {
		Set<Customer> customers = dao.allCustomers();
		return customers;
	}

}
