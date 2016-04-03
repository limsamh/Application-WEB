package com.neko.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServelet extends HttpServlet 
{

	
	protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		HttpSession session=req.getSession();  
		session.invalidate();  
		req.getRequestDispatcher("logout.jsp").include(req, res);  
		
		
	}

}
