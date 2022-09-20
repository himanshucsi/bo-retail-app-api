package com.himanshu.api.dto;

import org.springframework.stereotype.Component;

@Component
public class ResponseDto {

	private String status;
	private Object data;
	private ErrorDto error;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ErrorDto getError() {
		return error;
	}

	public void setError(ErrorDto error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "ResponseDto [status=" + status + ", data=" + data + ", error=" + error + "]";
	}

}
