package main.java.com.webflow.controller;

import org.springframework.stereotype.Service;

import main.java.com.webflow.model.Flow;

@Service("flowHandler")
public class FlowHandler {
	public Flow newFlow(){
		return new Flow();
	}
}
