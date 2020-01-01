package ui;

import java.util.*;

import entities.*;
import service.*;
import dao.*;

public class CustomerUi {
	private ICustomerService service = new CustomerServiceImpl(new CustomerDaoImpl());

	public static void main(String[] args) {
		CustomerUi ui = new CustomerUi();
		ui.runUi();
	}

	public void runUi() {
		try {
			Customer c1 = new Customer("1234567890", 1000);
			Customer c2 = new Customer("9087654321", 2000);
			Customer c3 = new Customer("6543210987", 3000);
			service.addCustomer(c1);
			service.addCustomer(c2);
			Customer fetched1 = service.findByMobileno("1234567890");
			Customer fetched2 = service.findByMobileno("9087654321");
			System.out.println("Balance:" + fetched1.getBalance());
			System.out.println("Balance:" + fetched2.getBalance());
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("something went wrong");
		}
	}

}
