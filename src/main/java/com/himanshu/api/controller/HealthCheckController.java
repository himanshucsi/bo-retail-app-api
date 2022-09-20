package com.himanshu.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.api.builder.ResponseBuilder;
import com.himanshu.api.dto.ResponseDto;
import com.himanshu.api.service.HealthCheckService;

@RestController
public class HealthCheckController {
	
	@Autowired
	private HealthCheckService healthCheckService;
	
	@Autowired
	private ResponseBuilder responseBuilder;

	@GetMapping("checkHealth")
	public ResponseDto testAppAndDBStatus() {
		
		healthCheckService.checkHealth();
		
		ResponseDto responseDto = responseBuilder.prepareHealthCheckResponse("Connected");
		
		
		return responseDto;
	}
	
}
