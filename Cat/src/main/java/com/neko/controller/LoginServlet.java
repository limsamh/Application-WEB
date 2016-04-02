package com.neko.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
		 PrintWriter out = res.getWriter();
		 
 /*
     * Récupération des données saisies, envoyées en tant que paramètres de
     * la requête GET générée à la validation du formulaire
     */
		 
		String login = req.getParameter("login");
		String motdepasse = req.getParameter("motdepasse");
		LoginService loginService = new LoginService();
		
	try {
			motdepasse = Crypto.encrypt(motdepasse);
			
	} catch (Exception e) {
		}
		
		
		try {
			boolean result = loginService.seconnecter(login, motdepasse);
		Compte user = loginService.recupererUtilisateur(login);
		
		if (result == true)
		{
		req.getSession().setAttribute("user", user);
			res.sendRedirect("home.jsp");
			
//			this.getServletContext().getRequestDispatcher("/home.jsp").forward(req, res);
		}else
		{
			message = "Informations non valides";
	    }
		}
		catch(Exception e)
		{
			System.out.println("blallaalall"+e.getMessage());
		}
}
}
