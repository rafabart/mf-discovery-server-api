package com.mfdiscoveryserverapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MfDiscoveryServerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfDiscoveryServerApiApplication.class, args);
	}

}
