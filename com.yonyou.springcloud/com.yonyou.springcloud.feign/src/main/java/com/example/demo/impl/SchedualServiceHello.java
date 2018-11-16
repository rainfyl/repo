package com.example.demo.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-demoA",fallback=SchedualServiceHiHystric.class)
public interface SchedualServiceHello {
	@RequestMapping(value = "/helloA",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);

}
