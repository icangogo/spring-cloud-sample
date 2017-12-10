package com.aixuexi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aixuexi.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	private HelloService helloservice;
	@RequestMapping("/hi")
	public String hi(String name) {
		return helloservice.hi(name+"from feign");
	}
}
