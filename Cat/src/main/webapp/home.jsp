<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.neko.dao.ChatDaoImpl"%>
<%@page import="java.util.Date"%>
<%@page import="com.neko.model.Chat"%>
<%@page import="com.neko.model.Utilisateur"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style1.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script type="text/javascript" src="script/jquery.magnifier.js">
</script>

<title>Dashboard</title>
</head>

<body>

<ul>
    <li><a href="Acceuil.jsp">Accueil</a></li>
    
    <li><a href=#>Aide</a></li>
    <li><a href="login.jsp">Connexion</a></li>
</ul>
<center>
<div id="container">
        <p> 
             <%=new Date()%><br/>
             
             <%
                 Utilisateur user = (Utilisateur) session.getAttribute("user");
             %>   
               
             
            <b> Bienvenu <%=user.getLogin()%></b>
             <a href="logout.jsp">Logout</a>
      <p>

<h1 align="center"> Liste des Chats</h1>
	<table>
             <thead>
                 <tr>
                     <th>Image</th>
                     <th>Nom français</th>
                     <th>nom japonnais</th>
                     <th>niveau</th>
                     <th>description</th>
                     <th>caractere</th> 
                     <th></th>              
                 </tr>
             </thead>
             <tbody>
                 
                 <%
                 Chat c = new Chat();
                
                    List<Chat> list = c.lis();
                     for (Chat u : list) {
                  %>
                 
                 <tr>
                    <td>  <img src="<%=u.getImage()%> " class="magnify"/></td>
                    <td><%=u.getNomChat()%></td>
                    <td><%=u.getNomJaponnais()%></td>
                     <td><%=u.getNiveau()%></td>
                     <td><%=u.getCaractere()%></td>
                     <td><%=u.getDescription()%></td>
                     <td><a href=#>Details</a></td>
                 </tr>
                 	
                 <%}%>
             <tbody>
         </table> 
         </div>
    </center>
</body>
</html>