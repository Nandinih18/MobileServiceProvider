package service;

import java.util.*;

import entities.*;
import dao.*;

public interface ICustomerService {

	public Customer findByMobileno(String mobileno);

	public void rechargeAccount(Customer c, double amount);

	public Customer createAccount(String mobileno, double balance, String name);

	Set<Customer> allCustomers();

}
