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
<title>Insert title here</title>
</head>

<body>
<center>
<div id="container">
        <p> 
             <%=new Date()%><br/>
             
             <%
                 Utilisateur cp = (Utilisateur) session.getAttribute("user");
             %>   
               
             <b> Bienvenue <%= cp.getLogin() %></b>
            
             <a href="logout.jsp">Logout</a>
      <p>

<h1 align="center"> liste de tous les Chats</h1>
	<table>
             <thead>
                 <tr>
                     <th>Image</th>
                     <th>Nom français</th>
                     <th>nom japonnais</th>
                     <th>niveau</th>
                     <th>description</th>
                     <th>caractere</th>                
                 </tr>
             </thead>
             <tbody>
                 
                 <%
                 Chat c = new Chat();
                
                    List<Chat> list = c.lis();
                     for (Chat u : list) {
                  %>
                 
                 <tr>
                    <td>  <img src="/<%=u.getImage()%>"/></td>
                    <td><%=u.getNomChat()%></td>
                    <td><%=u.getNomJaponnais()%></td>
                     <td><%=u.getNiveau()%></td>
                     <td><%=u.getCaractere()%></td>
                     <td><%=u.getDescription()%></td>
                 </tr>
                 	
                 <%}%>
             <tbody>
         </table> 
         </div>
    </center>
</body>
</html>