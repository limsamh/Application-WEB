<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Connexion</title>
<!-- CSS -->

<link rel="stylesheet" href="css/reset.css">
	<link rel="stylesheet" href="css/supersized.css">
		<link rel="stylesheet" href="css/style2.css">

			<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
			<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
</head>


<body>
	<ul>
		<li><a href="Acceuil.jsp">Accueil</a></li>

		<li><a href=#>Aide</a></li>
		<li><a href="login.jsp">Connexion</a></li>
	</ul>


	<div class="page-container">
		<h1>Authentification</h1>
		<form action="LoginServlet" method="post">
			<input type="text" name="login" class="username"
				placeholder="Username"> <input type="password"
				name="motdepasse" class="password" placeholder="Password">
			<button type="submit">Submit</button>
			<div class="error">
				<span>+</span>
			</div>
			<br /> <span> Nouvel utilisateur?  <a href="inscription.jsp"
				style="margin-left: 30px;">Inscrivez-vous ici ?</a></span>
		</form>

	</div>

<!-- 
	<form method="post" action="LoginServlet">
		<div style="padding: 100px 0 0 250px;">
			<div id="login-box">
				<h2>Authentification</h2>
				<div id="login-box-name" style="margin-top: 20px;">Login:</div>
				<div id="login-box-field" style="margin-top: 20px;">
					<input name="login" class="form-login" title="login" value=""
						size="30" maxlength="50" required="" />
				</div>
				<div id="login-box-name">Password:</div>
				<div id="login-box-field">
					<input name="motdepasse" type="password" class="form-login"
						title="motdepasse" value="" size="30" maxlength="48" required="" />
				</div>
				<br /> <span class="login-box-options"> Nouvel utilisateur? 
					<a href="inscription.jsp" style="margin-left: 30px;">Inscrivez-vous
						ici ?</a>
				</span> <br /> <br /> <input style="margin-left: 100px;" type="submit"
					value="Valider" />
			</div>
		</div>
	</form>
-->

	<!-- Javascript -->
	<script src="js/jquery-1.8.2.min.js"></script>
	<script src="js/supersized.3.2.7.min.js"></script>
	<script src="js/supersized-init.js"></script>
	<script src="js/scripts.js"></script>
</body>
</html>