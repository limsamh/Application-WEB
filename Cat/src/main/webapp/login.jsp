<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US"><head>
    <meta charset="utf-8">
    <title>Connexion</title>
    <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

    <!--[if lt IE 9]><script src="https://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
    <link rel="stylesheet" href="css/style1.css" media="screen">
    <!--[if lte IE 7]><link rel="stylesheet" href="css/style.ie7.css" media="screen" /><![endif]-->
    <link rel="stylesheet" href="css/style.responsive.css" media="all">
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Arvo|PT+Sans&amp;subset=latin">

    <script src="jquery.js"></script>
    <script src="script.js"></script>
    <script src="script.responsive.js"></script>
<meta name="description" content="Description">
<meta name="keywords" content="Keywords">



</head>
<body>
<form method="post" action="LoginServlet">
<div style="padding: 100px 0 0 250px;">
<div id="login-box">
<h2>Authentification</h2>
<div id="login-box-name" style="margin-top:20px;">Login:</div>
<div id="login-box-field" style="margin-top:20px;">
<input name="login" class="form-login" title="login" value="" size="30" maxlength="50"  required=""/>
</div>
<div id="login-box-name">Password:</div>
<div id="login-box-field">
<input name="motdepasse" type="password" class="form-login" title="motdepasse" value="" size="30" maxlength="48"  required="" />
</div>
<br />
<span class="login-box-options">
Nouvel utilisateur?  <a href="inscription.jsp" style="margin-left:30px;">Inscrivez-vous ici ?</a>
</span>
<br />
<br />
<input style="margin-left:100px;" type="submit" value="Login" />
</div>
</div>
</form>
</body>
</html>