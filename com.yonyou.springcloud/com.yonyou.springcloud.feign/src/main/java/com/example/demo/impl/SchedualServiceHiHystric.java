package com.example.demo.impl;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHello{

	@Override
	public String sayHelloFromClientOne(String name) {
		return "sorry,"+name;
	}

}
