package com.sg.bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Change extends HttpServlet {	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	{
		try
		{
			String npswd = request.getParameter("npswd");
			HttpSession session = request.getSession();
			String acctno = (String)session.getAttribute("acctno");
			Model m = new Model();
			m.setAcctno(acctno);
			m.setPswd(npswd);
			boolean status = m.changePswd();
			if(status==true)
			{
				response.sendRedirect("changesuccess.jsp");
			}
			else
			{
				response.sendRedirect("changefail");
			}
			
		}
		catch(Exception e)
		{
			
		}
	}
}
