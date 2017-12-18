package com.binger.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ErpSvcEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpSvcEurekaApplication.class, args);
	}
}
