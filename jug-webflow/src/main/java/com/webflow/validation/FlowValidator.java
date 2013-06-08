package main.java.com.webflow.validation;

import main.java.com.webflow.model.Flow;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.validation.ValidationContext;
import org.springframework.stereotype.Component;

@Component
public class FlowValidator {
	public void validateHome(ValidationContext validationContext){
	}
	public void validateAddress(ValidationContext validationContext){
	}
	public void validateOrderPizza(Flow flow, ValidationContext validationContext){
		if(flow.getOrder().getPizza().getSize() == null){
			validationContext.getMessageContext().addMessage(new MessageBuilder().error().source("Size").defaultText("Must select a pizza size!").build());
		}
	}
}
