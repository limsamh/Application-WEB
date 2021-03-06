<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.neko.dao.ChatDaoImpl"%>
<%@page import="java.util.Date"%>
<%@page import="com.neko.model.Chat"%>
<%@page import="com.neko.model.Compte"%>
<%@page import="java.util.List"%>
<%@page import="com.neko.controller.LogoutServelet"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html dir="ltr" lang="en-US">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Definition des css necessaire pour la page -->
<link href="css/style3.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />

<!--Script pour agrandir l'image du chat -->
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.magnifier.js">
	
</script>

<title>Home</title>
</head>

<body>

	<!-- Barre de navigation  spécifique à l'acceuil utilisateur-->
	<header>
	<div class="nav">
		<ul>
			<li><a href="Acceuil.jsp">Accueil</a></li>
			<li><a class="active" href=#>Chats</a></li>
			<li class="dropdown"><a href="#">Astuces</a>
				<div class="dropdown-content">
					<ul>
						<li><a href=#>Ajouter</a></li>
						<li><a href=#>Afficher</a></li>
					</ul>
				</div></li>
			</li>

			<li><a href="About.jsp">A propos</a></li>
			<li class="dropdown"><a href="#">Profil</a>
				<div class="dropdown-content">
					<ul>
						<li><a href=#>Modifier</a></li>
						<li><a href="LogoutServelet">Deconnexion</a></li>
					</ul>
				</div></li>

		</ul>
	</div>
	</header>

	<center>
		<div id="container">
			<p>
				<%=new Date()%><br />

				<%
					Compte user = (Compte) session.getAttribute("user");
				%>


				<b> Bienvenu <%=user.getLogin()%></b>
			<form action=# method="POST">
				Rechercher chat <input type="text" name="rechercheChat"
					class="rechercheChat" placeholder="Nom du chat">
				<button type="submit">Valider</button>

			</form>



			<h1 align="center">Liste des chats</h1>
			<table>
				<thead>
					<tr>
						<th>Image</th>
						<th>Nom français</th>
						<th>nom japonais</th>
						<th>niveau</th>
						<th>description</th>
						<th>caractere</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<!-- Permettant d'afficher la liste de tous les chats disponibles -->
					<%
						Chat c = new Chat();
						List<Chat> list = c.lis();
						for (Chat u : list) {
					%>

					<tr>
						<td><img src="<%=u.getImage()%> " class="magnify" /></td>
						<td><%=u.getNomChat()%></td>
						<td><%=u.getNomJaponais()%></td>
						<td><%=u.getNiveau()%></td>
						<td><%=u.getCaractere()%></td>
						<td><%=u.getDescription()%></td>
						<td><a href=#>Details</a></td>
					</tr>

					<%
						}
					%>
				
				<tbody>
			</table>
		</div>
	</center>


</body>
</html>