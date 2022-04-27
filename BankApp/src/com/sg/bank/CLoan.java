package com.sg.bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.ws.wsdl.writer.document.Service;


public class CLoan extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			HttpSession session = request.getSession();
			String acctno=(String)session.getAttribute("acctno");
			Model m = new Model();
			m.setAcctno(acctno);
			boolean status = m.cLoan();
			if(status==true)
			{
				String name = m.getName();
				session.setAttribute("name", name);
				response.sendRedirect("cloansuccessful.jsp");
			}
			else {
				response.sendRedirect("cloanfail.jsp");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
