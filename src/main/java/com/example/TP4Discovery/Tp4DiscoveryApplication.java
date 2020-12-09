package com.example.TP4Discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Tp4DiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp4DiscoveryApplication.class, args);
	}

}
