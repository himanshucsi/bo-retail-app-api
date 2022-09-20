package com.himanshu.api.dto;

import org.springframework.stereotype.Component;

@Component
public class ErrorDto {

	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ErrorDto [errorMessage=" + errorMessage + "]";
	}

}
