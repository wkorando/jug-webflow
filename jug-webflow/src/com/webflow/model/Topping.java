package com.webflow.model;

import java.io.Serializable;

public class Topping implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3576483271442346677L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
