package entities;

public class Customer {
	private String mobileno;
	private double balance;

	public Customer() {
	}

	public Customer(String mobileno, double balance) {
		this.mobileno = mobileno;
		this.balance = balance;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || !(obj instanceof Customer)) {
			return false;
		}

		Customer c = (Customer) obj;
		return c.mobileno.equals(this.mobileno);
	}

	@Override
	public int hashCode() {
		return mobileno.hashCode();
	}

}
