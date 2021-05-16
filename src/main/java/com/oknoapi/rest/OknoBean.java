package com.oknoapi.rest;

public class OknoBean {
	
	private String message;

	public OknoBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("OknoBean [message=%s]", message);
	}
}
