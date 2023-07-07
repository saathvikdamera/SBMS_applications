package com.damera.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient( name = "Greet-Api")
public interface MsgFeignClient {

	@GetMapping("/greet")
	public String getGreetMsg();
}
