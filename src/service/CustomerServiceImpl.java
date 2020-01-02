package service;

import entities.*;
import dao.*;
import exceptions.*;

import java.util.*;

public class CustomerServiceImpl implements ICustomerService {
	private ICustomerDao dao;

	public ICustomerDao getDao() {
		return dao;
	}

	public void setDao(ICustomerDao dao) {
		this.dao = dao;
	}

	public CustomerServiceImpl(ICustomerDao dao) {
		this.dao = dao;
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
	public void rechargeAccount(Customer c, double amount) {
		dao.rechargeAccount(c, amount);
	}

	@Override
	public Customer createAccount(String mobileno, double balance, String name) {
		if (mobileno == null || mobileno.length() != 10) {
			throw new IncorrectMobNoException("Mobile number is incorrect");
		}
		Customer c = dao.createAccount(mobileno, balance, name);
		return c;
	}

	@Override
	public Set<Customer> allCustomers() {
		Set<Customer> customers = dao.allCustomers();
		return customers;
	}

}
