package com.himanshu.api.service;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckServiceImpl implements HealthCheckService {

	@Override
	public String checkHealth() {
		// TODO Auto-generated method stub
		return "Connected to Database";
	}
}
