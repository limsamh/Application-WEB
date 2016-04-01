package com.neko.controller;

import com.neko.model.Utilisateur;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neko.service.InscriptionService;
import javax.servlet.ServletException;
public class InscriptionServlet extends HttpServlet
{
	public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String login = req.getParameter("login");
		String motdepasse = req.getParameter("motdepasse");
		 PrintWriter out = res.getWriter();
		Utilisateur use = new Utilisateur(login, motdepasse);
		
		try
		{
			InscriptionService inscription = new InscriptionService();
			boolean rs = inscription.enregistrer(use);
			if(rs){
	             out.println("<h1 Bienvenue</h1>"+login);
	             out.println("Connectez-vous avec vos nouveau identifiant <a href=index.jsp>Click here</a>");
	         }else{
	             out.println("<h1>Registration Failed</h1>");
	             out.println("To try again<a href=inscription.jsp>Click here</a>");
		}
	
		}finally
		{
			out.close();
		}
}
}
