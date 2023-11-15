package com.Decodenow.mailDemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.Decodenow.mailDemo.Model.MailStructure;

@Service
public class MailService {

	
	@Autowired
	private JavaMailSender mailsender;
	
	
	@Value("${spring.mail.username}")
	private String frommail;
	
	public String sendMail(MailStructure mail)
	{ 
		SimpleMailMessage mailmessage= new SimpleMailMessage();
		mailmessage.setFrom(frommail);
		mailmessage.setTo(mail.getTomail());
		mailmessage.setSubject(mail.getSubject());
		mailmessage.setText(mail.getMessage());
		  mailsender.send(mailmessage);
		return "checkmail";
		//return "from:"+frommail+",To:"+mail.getTomail()+",message:"+mail.getMessage()+",subject:"+mail.getSubject();
	}
	
	
}
