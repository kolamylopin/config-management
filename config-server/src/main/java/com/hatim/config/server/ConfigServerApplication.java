package com.hatim.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.logging.Logger;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {
	private final static Logger logger = Logger.getLogger(ConfigServerApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
