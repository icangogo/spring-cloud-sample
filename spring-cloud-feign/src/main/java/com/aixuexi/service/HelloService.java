package com.aixuexi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "SERVICE-HI", fallback = SchedualServiceHiHystric.class)
public interface HelloService {
	@RequestMapping("/hi")
	public String hi(String name);
}
