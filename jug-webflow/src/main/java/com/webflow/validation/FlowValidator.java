package main.java.com.webflow.validation;

import main.java.com.webflow.model.Address;
import main.java.com.webflow.model.Flow;

import org.springframework.binding.validation.ValidationContext;
import org.springframework.stereotype.Component;

@Component
public class FlowValidator {
	public void validateAddress(Flow flow, ValidationContext validationContext) {
		Address address = flow.getOrder().getCustomer().getAddress();
		if (ValidationUtils.isEmpty(address.getAddressLine1())) {
			ValidationUtils.messageBuilder(validationContext, "addrLine1",
					"Must enter a street address!");
		}
		if (ValidationUtils.isEmpty(address.getCity())) {
			ValidationUtils.messageBuilder(validationContext, "city",
					"Must enter a city!");
		}
		if (ValidationUtils.isEmpty(address.getState())) {
			ValidationUtils.messageBuilder(validationContext, "state",
					"Must select a state!");
		}
		if (ValidationUtils.isEmpty(address.getZip().getZip())) {
			ValidationUtils.messageBuilder(validationContext, "zip",
					"Must enter a zip code!");
		} else if (!ValidationUtils.isNumeric(address.getZip().getZip())) {
			ValidationUtils.messageBuilder(validationContext, "zip",
					"Zip code must be numeric!");
		} else if (!ValidationUtils.checkLength(address.getZip().getZip(), 5)) {
			ValidationUtils.messageBuilder(validationContext, "zip",
					"Invalid zip code!");
		}
		if (!ValidationUtils.isEmpty(address.getZip().getZip4())) {
			if (!ValidationUtils.isNumeric(address.getZip().getZip4())) {
				ValidationUtils.messageBuilder(validationContext, "zip4",
						"Zip4 code must be numeric!");
			} else if (!ValidationUtils.checkLength(address.getZip().getZip4(),
					4)) {
				ValidationUtils.messageBuilder(validationContext, "zip",
						"Invalid zip4 code!");
			}
		}
	}

	public void validateOrderPizza(Flow flow,
			ValidationContext validationContext) {
		if (flow.getOrder().getPizza().getSize() == null) {
			ValidationUtils.messageBuilder(validationContext, "Size",
					"Must select a pizza size!");
		}
	}
}
