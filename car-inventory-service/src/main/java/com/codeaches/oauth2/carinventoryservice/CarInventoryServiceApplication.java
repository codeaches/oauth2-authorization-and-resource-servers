package com.codeaches.oauth2.carinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class CarInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarInventoryServiceApplication.class, args);
	}
}

