package main.java.com.webflow.model;

public enum PizzaSize {
	SMALL("Small", 500, "$5.00"), MEDIUM("Medium", 750, "$7.50"), LARGE(
			"Large", 1000, "$10.00");

	private String label;
	private Integer priceInPennies;
	private String formattedPrice;

	private PizzaSize(String label, Integer priceInPennies,
			String formattedPrice) {
		this.label = label;
		this.priceInPennies = priceInPennies;
		this.formattedPrice = formattedPrice;
	}

	public String getLabel() {
		return label;
	}

	public Integer getPriceInPennies() {
		return priceInPennies;
	}

	public String getFormattedPrice() {
		return formattedPrice;
	}
}
