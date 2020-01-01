package dao;

import java.util.Set;

import entities.*;

public interface ICustomerDao {

	public void addCustomer(Customer c);

	public Customer findByMobileNo(String mobileno);

	Set<Customer> allCustomers();

}
