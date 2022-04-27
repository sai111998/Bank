package com.sg.bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		
		try
		{
			String custid = request.getParameter("custid");
			String pswd = request.getParameter("pswd");
			
			Model m = new Model();
			m.setCustid(custid);
			m.setPswd(pswd);
			boolean status = m.login();
			if(status==true)
			{
				String acctno = m.getAcctno();
				String name=m.getName();
				HttpSession session = request.getSession(true);
				session.setAttribute("acctno", acctno);
				session.setAttribute("name", name);
				response.sendRedirect("homee.jsp");
			}
			else
			{
				response.sendRedirect("loginfail.jsp");
			}
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
