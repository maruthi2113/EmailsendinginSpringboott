package com.Decodenow.mailDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Decodenow.mailDemo.Model.MailStructure;
import com.Decodenow.mailDemo.Service.MailService;

@RestController
@RequestMapping("/mail")
public class MailController {
	
	
	@Autowired
	private MailService mailservice;
	
	
	@PostMapping("/send")
	public String sendEmail(@RequestBody MailStructure mailstructure)
	{
		
		
		String s=this.mailservice.sendMail(mailstructure);
		return s;
		
	}

}
