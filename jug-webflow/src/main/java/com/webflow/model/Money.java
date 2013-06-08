package main.java.com.webflow.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Money implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2071320351924070644L;
	private BigDecimal amount;
	
	public Money(long amountInPennies){
		amount = new BigDecimal(amountInPennies);
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
