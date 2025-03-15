package com.wisemangroup.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaserverApplication {
	
	private static final Logger startupLogger = LoggerFactory.getLogger("startup");

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
		startupLogger.info("Welcome:");
	}

}
