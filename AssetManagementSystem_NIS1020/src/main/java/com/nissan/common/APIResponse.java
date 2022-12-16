package com.nissan.common;

import org.springframework.http.HttpStatus;




public class APIResponse {

	private Integer status;		// 200, 401.....
	
	private Object data;			// emailId, roleId
	
	private Object error;		// error message
	
	public APIResponse() {
		status = HttpStatus.OK.value();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}
	
}
