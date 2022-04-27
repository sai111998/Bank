package com.sg.bank;

import java.io.IOException;
import java.util.*;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class PswdFilter
 */
public class PswdFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PswdFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String npswd = request.getParameter("npswd");
		String cnpswd = request.getParameter("cnpswd");
		if(npswd.equals(cnpswd))
		{
			chain.doFilter(request, response);
		}
		else {
			((HttpServletResponse) response).sendRedirect("changefail.jsp");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
