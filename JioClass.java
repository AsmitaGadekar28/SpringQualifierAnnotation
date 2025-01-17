package com.spring;

import org.springframework.stereotype.Component;

@Component("jio")
public class JioClass implements Sim{

	@Override
	public String Calling() {
		
		return "U r calling from Jio";
	}

	
}
