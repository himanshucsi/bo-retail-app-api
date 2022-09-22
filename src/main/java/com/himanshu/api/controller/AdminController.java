package com.himanshu.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.api.builder.ResponseBuilder;
import com.himanshu.api.domain.Admin;
import com.himanshu.api.dto.ResponseDto;
import com.himanshu.api.service.AdminService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AdminController {
	
	@Autowired
	private ResponseBuilder responseBuilder;
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("admin")
	public ResponseEntity<ResponseDto> addAdmin(@RequestBody Admin admin) {
		
		ResponseDto responseDto = null;
		
		if(null != adminService.addAdmin(admin)) {
			responseDto = responseBuilder.prepareAddOrUpdateResponse();
		}
		
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.CREATED);
	}

}
