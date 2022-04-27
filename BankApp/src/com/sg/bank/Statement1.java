package com.sg.bank;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Statement1 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	{
		try
		{
			HttpSession session = request.getSession();
			String acctno=(String) session.getAttribute("acctno");
			Model m = new Model();
			m.setAcctno(acctno);
			ArrayList al =m.getStatement();
			
			if(al.isEmpty()==true) {
				response.sendRedirect("statementfailjsp.jsp");
			}
			else
			{
				session.setAttribute("al", m.al);
				session.setAttribute("al1", m.al1);
				session.setAttribute("al2", m.al2);
				response.sendRedirect("statement.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
