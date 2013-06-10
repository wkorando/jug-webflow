package main.java.com.webflow.model;

import org.junit.Assert;

import org.junit.Test;

public class TestMoney {
	@Test
	public void testMoney() {
		Money money = new Money(5.00);
		Assert.assertEquals("$5.00", money.toString());
	}
}
