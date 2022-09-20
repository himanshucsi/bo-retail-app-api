package com.himanshu.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@GetMapping("checkHealth")
	public String testAppAndDBStatus() {
		return "Running successfully with version 1";
	}
	
}
