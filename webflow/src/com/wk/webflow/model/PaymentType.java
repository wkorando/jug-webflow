package com.wk.webflow.model;

import java.io.Serializable;

public enum PaymentType implements Serializable {
	CREDIT_CARD("Credit Card");
	private String displayName;

	private PaymentType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public String toString() {
		return displayName;
	}
}
