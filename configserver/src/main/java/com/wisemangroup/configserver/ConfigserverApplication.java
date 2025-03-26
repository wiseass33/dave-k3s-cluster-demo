package com.wisemangroup.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
@EnableConfigServer
public class ConfigserverApplication {

	@Value("${spring.application.name}")
	private String appName;
	@Value("${spring.profile.active:default}")
	private String profile;
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}
	
	@PostConstruct
	public void logStartupInfo() {
		log.info("Configserver Application started: name = {}, profile = {}.", appName, profile);
	}

}
