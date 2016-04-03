<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Connexion</title>
<!-- CSS -->

<link href="css/style3.css" rel="stylesheet" type="text/css" />
<link href="css/reset.css" rel="stylesheet" type="text/css" />
<link href="css/supersized.css" rel="stylesheet" type="text/css" />
<link href="css/style2.css" rel="stylesheet" type="text/css" />


<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

</head>


<body>
	<!-- Barre de navigation  -->
	<header>
		<div class="nav">
			<ul>
				<li><a href="Acceuil.jsp">Accueil</a></li>
				<li><a href="#">Aide</a></li>
				<li><a class="active" href="login.jsp">Connexion</a></li>
			</ul>
		</div>
	</header>
	<!-- Fin barre de navigation -->

	<div class="page-container">
		<h1>Authentification</h1>
		<form action="LoginServlet" method="post">
			<input type="text" name="login" class="username"
				placeholder="Username"> <input type="password"
				name="motdepasse" class="password" placeholder="Password">
			<button type="submit">Valider</button>
			<div class="error">
				<span>+</span>
			</div>
			<br /> <span> Nouvel utilisateur?  <a href="inscription.jsp"
				style="margin-left: 30px;">Inscription</a></span>
		</form>

	</div>

	

	<!-- Javascript -->
	<script src="js/jquery-1.8.2.min.js"></script>
	<script src="js/supersized.3.2.7.min.js"></script>
	<script src="js/supersized-init.js"></script>
	<script src="js/scripts.js"></script>
</body>
</html>