package com.himanshu.api.builder;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.himanshu.api.dto.ErrorDto;
import com.himanshu.api.dto.ResponseDto;

@Component
public class ResponseBuilder {

	@Autowired
	private ErrorDto errorDto;
	
	@Autowired
	private ResponseDto responseDto;
	
//	public ResponseDto prepareHealthCheckResponse(final String retrieveType, final String retrieveString) {
//		
//		Map<String, String> dataMap =  new HashMap<String, String>();
//		
//		dataMap.put(retrieveType, retrieveString);
//		
//		responseDto.setStatus("200");
//		responseDto.setData(dataMap);
//		errorDto.setErrorMessage("");;
//		responseDto.setError(errorDto);
//		return responseDto;
//	}
	
	public ResponseDto prepareHealthCheckResponse(final String retrieveString) {
		
		responseDto.setStatus("200");
		responseDto.setData(retrieveString);
		errorDto.setErrorMessage("");;
		responseDto.setError(errorDto);
		return responseDto;
	}
	
}
