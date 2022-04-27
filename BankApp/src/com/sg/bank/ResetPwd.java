package com.sg.bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ResetPwd extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			String npswd = request.getParameter("npswd");
			HttpSession session = request.getSession();
			String toemail=(String)session.getAttribute("toemail");
			Model m = new Model();
			m.setEmail(toemail);
			m.setPswd(npswd);
			boolean status = m.forgotPswd();
			if(status==true)
			{
				response.sendRedirect("/BankApp/resetsuccessful.jsp");
			}
			else
			{
				response.sendRedirect("/BankApp/resetfail.jsp");
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
