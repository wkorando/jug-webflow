package main.java.com.webflow.model;

import java.io.Serializable;

public class CreditCardPayment implements Serializable, Payment {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1893781042312552739L;
	private Money amount;
	public CreditCardPayment(Money amount){
		this.amount = amount;
	}
	@Override
	public PaymentType getPaymentType() {
		return PaymentType.CREDIT_CARD;
	}

	@Override
	public Money getAmount() {
		return amount;
	}

}
