package com.sg.bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Transfer extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			HttpSession session = request.getSession();
			String acctno = (String) session.getAttribute("acctno");
			String tacctno = request.getParameter("tacctno");
			String tamt = request.getParameter("amt");
			Model m = new Model();
			m.setAcctno(acctno);
			m.setAmt(tamt);
			m.setTacctno(tacctno);
			boolean status = m.transfer();
			if(status==true)
			{
				response.sendRedirect("transfersuccess.jsp");
			}
			else {
				response.sendRedirect("transferfail.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
