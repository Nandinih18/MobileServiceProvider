package dao;

import entities.*;
import exceptions.*;

import java.util.*;

public class CustomerDaoImpl implements ICustomerDao {
	private Map<String, Customer> store = new HashMap<>();

	@Override
	public void addCustomer(Customer c) {
		store.put(c.getMobileno(), c);
	}

	@Override
	public Customer findByMobileNo(String mobileno) {
		Customer c = store.get(mobileno);
		if (c == null) {
			throw new CustomerNotFoundException("customer not found for mobile number:" + mobileno);
		}
		return c;
	}

	@Override
	public Set<Customer> allCustomers() {
		Collection<Customer> customers = store.values();
		Set<Customer> customerSet = new HashSet<>(customers);
		return customerSet;
	}

}
