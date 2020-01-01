package service;

import java.util.*;

import entities.*;
import dao.*;

public interface ICustomerService {

	public void addCustomer(Customer c);

	public Customer findByMobileno(String mobileno);

	Set<Customer> allCustomers();

}
