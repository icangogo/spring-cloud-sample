package com.aixuexi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@EnableHystrixDashboard
@SpringBootApplication
@ComponentScan(basePackages="com.aixuexi.controller")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
