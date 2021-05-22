package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entities.Mail;
import com.proyecto.services.MailServices;


@CrossOrigin()
@RestController
@RequestMapping("/Mail")
public class MailController {
 
	@Autowired
	private MailServices notificationService;
	
	@RequestMapping(value = "/proyecto/tutorias/correo", method=RequestMethod.GET)
	public String sendEmail(@RequestBody Mail mail){
		notificationService.sendEmail(mail);
		return "Email sent successfully";
	}
	
}