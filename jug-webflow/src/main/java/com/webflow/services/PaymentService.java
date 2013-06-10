package main.java.com.webflow.services;

import java.util.Date;

import main.java.com.webflow.model.CreditCardPayment;
import main.java.com.webflow.model.ElectronicCheckPayment;
import main.java.com.webflow.model.Order;
import main.java.com.webflow.model.Payment;

import org.springframework.stereotype.Service;

@Service("paymentService")
public class PaymentService {
	public CreditCardPayment generateCreditCardPayment(Order order) {
		CreditCardPayment payment = new CreditCardPayment(order.getOrderTotal());
		order.setPayment(payment);
		return payment;
	}

	public ElectronicCheckPayment generateElectronicCheckPayment(Order order) {
		ElectronicCheckPayment eCheckPayment = new ElectronicCheckPayment(
				order.getOrderTotal());
		eCheckPayment.setPayableTo("JUG's Pizzeria");
		eCheckPayment.setDate(new Date());
		order.setPayment(eCheckPayment);
		return eCheckPayment;
	}
}
