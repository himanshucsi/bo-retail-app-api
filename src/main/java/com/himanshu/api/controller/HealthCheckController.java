package com.himanshu.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckController.class);

	@GetMapping("checkHealth")
	public ResponseDto testAppAndDBStatus() {

		LOGGER.info("Entered into HealthCheck Cotroller");
		healthCheckService.checkHealth();

		ResponseDto responseDto = responseBuilder.prepareHealthCheckResponse("Connected");

		LOGGER.info("Exiting From HealthCheck Cotroller");
		return responseDto;
	}

}
