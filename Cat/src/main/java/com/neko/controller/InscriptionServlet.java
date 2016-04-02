package com.neko.controller;
import com.neko.service.Crypto;
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
		Crypto c = new Crypto();
		String login = req.getParameter("login");
		String motdepasse = req.getParameter("motdepasse");
		try 
		{
			motdepasse =c.encrypt(motdepasse);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		 PrintWriter out = res.getWriter();
		Utilisateur use = new Utilisateur(login, motdepasse);
		
		try
		{
			InscriptionService inscription = new InscriptionService();
			boolean rs = inscription.enregistrer(use);
			if(rs){
	             out.println("<h1> Bienvenue</h1> "+ login );
	             out.println("<br/>Connectez-vous avec vos nouveaux identifiants <br/>"
	             		+ "<a href=login.jsp>Connexion</a>");
	         }else{
	             out.println("<h2>Echec Inscription Donn�es invalides </h2>"
	             		+ "<br/>");
	             out.println("<a href=inscription.jsp>Retour</a>");
		}
	
		}finally
		{
			out.close();
		}
}
}
