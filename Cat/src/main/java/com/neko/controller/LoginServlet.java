package com.neko.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neko.service.Crypto;
import com.neko.service.LoginService;
import com.neko.model.Compte;
import com.neko.model.Utilisateur;

import java.io.PrintWriter;
public class LoginServlet extends HttpServlet
{
	

	public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		 String message;
		 
		
 /*
     * Récupération des données saisies, envoyées en tant que paramètres de
     * la requête GET générée à la validation du formulaire
     */
		 
		String login = req.getParameter("login");
		String motdepasse = req.getParameter("motdepasse");
		LoginService loginService = new LoginService();
		PrintWriter out1 = res.getWriter();
		
	try {
			motdepasse = Crypto.encrypt(motdepasse);
			
	} catch (Exception e) {
		}
	
		
		try {
			boolean result = loginService.seconnecter(login, motdepasse);
		Compte user = loginService.recupererUtilisateur(login);
		
		if (result == true)
		{
			HttpSession session = req.getSession(true);
			session.setAttribute("user", user);
			
			
			req.getRequestDispatcher("home.jsp").forward(req, res);
			
//		this.getServletContext().getRequestDispatcher("/home.jsp").forward(req, res);
		}else
		{
			
			
			res.setContentType( "text/html" );
		  
		    out1.println("<div style='font-size:30px; color:red'>"
			          +"login et mot de passe incorrect "+"</div>");
			 RequestDispatcher view =
			    req.getRequestDispatcher("login.jsp");
			 view.include(req, res);
//			 throw new Exception( "Login ou mot de passe incorrect" );
	    }
		}
		catch(Exception e)
		{
			System.out.println("blallaalall"+e.getMessage());
		}finally 
		{
			out1.close();
		}
}
}
