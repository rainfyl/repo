package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${server.port}")

	String port;

	@RequestMapping("/helloA")
	public String sayHello(@RequestParam(value = "name", defaultValue = "forezp") String name) {
		return "say hello A" + name + " ,i am from port:" + port;
	}
}
