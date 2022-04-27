package com.sg.bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HLoan extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
    {
		try
		{
			
			HttpSession session = request.getSession();
			String acctno=(String) session.getAttribute("acctno");
			Model m = new Model();
			m.setAcctno(acctno);
			boolean status = m.hLoan();
			if(status==true)
			{
				String name = m.getName();
				session.setAttribute("name", name);
				response.sendRedirect("hloansuccess.jsp");
			}
			else
			{
				response.sendRedirect("hloanfail.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
