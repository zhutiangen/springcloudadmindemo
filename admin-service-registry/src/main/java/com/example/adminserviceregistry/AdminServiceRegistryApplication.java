package com.example.adminserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdminServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceRegistryApplication.class, args);
	}

}
