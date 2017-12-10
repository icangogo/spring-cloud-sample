package com.aixuexi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	@Autowired
	private RestTemplate resttemplate;
	@RequestMapping("/hi")
	@HystrixCommand(fallbackMethod = "error")
	public String hi(String name) {
		return resttemplate.getForObject("http://service-hi/hi?name="+name, String.class);
	}
	public String error(String name){
		 return "参数为:"+name+",调用SERVICE-HI 失败啦!";
	}
}
