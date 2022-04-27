package com.sg.bank;

import java.io.IOException; 
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.servlet.ServletException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Mail extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	{
		try
		{
		System.out.println("control in servlet");   
		String mail=request.getParameter("email"); 
		System.out.println(mail); 
		HttpSession session=request.getSession(true);
		session.setAttribute("toemail", mail);
		
		String fromEmail="saigopal418@gmail.com"; //sender's mail id. 
		String pwd="sai111998"; //sender's mail pwd. 
		String toEmail=mail;//reciever's mail id.   
		
		String subject="Link to reset password"; // mail subject line
		String msg="http://localhost:9090/BankApp/resetpwd.jsp"; //mail body    
		
		//Creating Session Object   
		Properties prop = new Properties(); 
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");   
		prop.put("mail.smtp.port", 587); 
		prop.put("mail.smtp.auth", "true");   
		prop.put("mail.smtp.starttls.enable", "true");
		Session session1 = Session.getDefaultInstance(prop, new javax.mail.Authenticator()  
		{    
			   protected javax.mail.PasswordAuthentication getPasswordAuthentication()   
			   {
			        //sender's mail id and pwd is encapsulated inside "SendersCredentials.java" 
				    return new PasswordAuthentication(fromEmail, pwd);  
			   }  	
		});
		//Composing the Mail 
		
		MimeMessage mesg = new MimeMessage(session1);  
		mesg.setFrom(new InternetAddress(fromEmail)); 
		mesg.addRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));   
		mesg.setSubject(subject);     
		mesg.setText(msg);       
		
		//Sending the Mail  
		Transport.send(mesg); 
		System.out.println("Mail Sent!!");  
		response.sendRedirect("/BankApp/mailsent.jsp ");  
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
