package com.aixuexi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${server.port}")
	private String port;
	@RequestMapping("/hi")
	public String hi(String name) {
		return name + ",hi from " + port;
	}
}
