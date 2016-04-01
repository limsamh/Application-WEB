<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
     <link rel="stylesheet" type="text/css" href="css/style.css">
     <title>logout Page</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style1.css" rel="stylesheet" type="text/css" />
</head>
<body>
<ul>
    <li><a href="Acceuil.jsp">Accueil</a></li>
    
    <li><a href=#>Aide</a></li>
    <li><a href="login.jsp">Connexion</a></li>
</ul>



     <%     
         session.removeAttribute("userId");
         session.removeAttribute("password");
         session.invalidate();
     %>
<center>
     <h1>You have successfully logged out</h1>
     To login again <a href="login.jsp">click here</a>.
</center>
</body>
</html>