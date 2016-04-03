package com.neko.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neko.model.Compte;

public class Gestionfilter implements Filter {

	private String LOGIN_ACTION_URI;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
		LOGIN_ACTION_URI = filterConfig.getInitParameter("");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException 
	{
		HttpServletRequest req = (HttpServletRequest)request;
		
		HttpSession  session = req.getSession();
		
		Compte user = (Compte) req.getAttribute("user");
		
		if (user == null && !LOGIN_ACTION_URI.equals(req.getRequestURI()))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
			return;
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
