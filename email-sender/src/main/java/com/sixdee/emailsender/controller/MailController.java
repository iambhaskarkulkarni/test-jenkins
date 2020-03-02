package com.sixdee.emailsender.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.emailsender.dto.EmailDTO;

@RestController
public class MailController {

	@GetMapping("/send-email-notifications")
	public EmailDTO sendEmail() {
		return new EmailDTO("send-email-notification-test", HttpStatus.ACCEPTED, "Email Sent From Instance 2");
	}
}
