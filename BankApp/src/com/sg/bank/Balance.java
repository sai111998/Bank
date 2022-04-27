package com.sg.bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Balance extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
	{		
		try
		{
			HttpSession session = request.getSession();
			String  acctno= (String)session.getAttribute("acctno");
			Model m = new Model();
			m.setAcctno(acctno);
			boolean status = m.checkBalance();
			if(status==true)
			{
				String balance=m.getBalance();
				session.setAttribute("balance", balance);
				response.sendRedirect("balance.jsp");
			}
			else
			{
				response.sendRedirect("balancefail.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
