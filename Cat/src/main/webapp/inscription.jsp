<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Inscription</title>
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
       <li><a href="About.jsp">A propos</a></li>
       <li><a href="login.jsp">Connexion</a></li>
      </ul>
    </div>
  </header>
<!-- Fin barre de navigation -->

  <!-- Formulaire d'inscription -->
  	<div class="page-container">
		<h1>Inscription</h1>
		<form action="InscriptionServlet" method="POST">
			<input type="text" name="login" class="username"
				placeholder="Username"> <input type="password"
				name="motdepasse" class="password" placeholder="Password">
				<input placeholder="email" id="email" name="email" data-ideal="required email" type="email"/>
			<div class="insc"><button type="submit">Valider</button></div>
			<div class="insc1"><button id="reset" type="button">Reset</button></div>
			<div class="error">
				<span>+</span>
			</div>
		</form>

	</div>
	<!-- Javascript -->
	<script src="js/jquery-1.8.2.min.js"></script>
	<script src="js/supersized.3.2.7.min.js"></script>
	<script src="js/supersized-init.js"></script>
	<script src="js/scripts.js"></script>

</body>
</html>