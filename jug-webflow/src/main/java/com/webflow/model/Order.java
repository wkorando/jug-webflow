package main.java.com.webflow.model;

import java.io.Serializable;

public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 364494932099939245L;
	private Pizza pizza;
	private Customer customer;
	private Payment payment;

	public Pizza getPizza() {
		if (pizza == null) {
			pizza = new Pizza();
		}
		return pizza;
	}

	public void setPizzas(Pizza pizza) {
		this.pizza = pizza;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}
