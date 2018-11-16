package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaServer注解，来开启服务注册中心
@EnableEurekaClient
@SpringBootApplication
public class DemoBApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBApplication.class, args);
	}
}
