package com.udacity.pricingserviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PricingServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricingServiceEurekaApplication.class, args);
	}

}
