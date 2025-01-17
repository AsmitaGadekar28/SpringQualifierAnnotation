package com.spring;

import org.springframework.stereotype.Component;

@Component("airtel")
public class AirtelClass implements Sim {

	@Override
	public String Calling() {
	
		return "U r calling from Airtel";
	}

}
