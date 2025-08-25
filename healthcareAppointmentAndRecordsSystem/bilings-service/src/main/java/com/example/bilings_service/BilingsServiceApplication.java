package com.example.bilings_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.bilings_service.feign")
public class BilingsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BilingsServiceApplication.class, args);
	}

}
