package main.java.com.webflow.model;

import java.util.Date;

import org.springframework.binding.validation.ValidationContext;

public class ElectronicCheckPayment implements Payment {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7452194510107947520L;

	private Money amount;
	private String signature;
	private String routingNumber;
	private String accountNumber;
	private String checkNumber;
	private Date date;
	private String payableTo;

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getSecuredAccountNumber() {

		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPayableTo() {
		return payableTo;
	}

	public void setPayableTo(String payableTo) {
		this.payableTo = payableTo;
	}

	public ElectronicCheckPayment(Money money) {
		amount = money;
	}

	@Override
	public PaymentType getPaymentType() {
		return PaymentType.E_CHECK;
	}

	@Override
	public Money getAmount() {
		return amount;
	}

	public void validateECheckPayment(ValidationContext validationContext) {

	}
}