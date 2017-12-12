package com.aixuexi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@Value("${from}")
	private String from;
	@RequestMapping("/from")
    public String from(){
		return this.from;
	}
}
