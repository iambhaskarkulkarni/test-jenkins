package com.sixdee.emailsender.dto;

import org.springframework.http.HttpStatus;

public class EmailDTO {

	private String keyword;

	private HttpStatus status;

	private String message;
	
	private String test;

	public String getKeyword() {
		return keyword;
	}

	public EmailDTO() {

	}

	public EmailDTO(String keyword, HttpStatus status, String message) {
		super();
		this.keyword = keyword;
		this.status = status;
		this.message = message;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
