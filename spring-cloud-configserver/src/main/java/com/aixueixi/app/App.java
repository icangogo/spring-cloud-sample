package com.aixueixi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
@Configuration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
