package main.java.com.webflow.controller;

import org.springframework.stereotype.Service;

import main.java.com.webflow.model.Flow;
import main.java.com.webflow.model.PizzaSize;

@Service("flowService")
public class FlowService {
	public Flow newFlow(){
		return new Flow();
	}
	
	public PizzaSize[] getPizzaSizes(){
		return PizzaSize.values();
	}
}
