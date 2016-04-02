<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<!--[if IE 8 ]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9 ]> <html lang="en" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en"> <!--<![endif]-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription</title>
<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<![endif]-->

<link href="css/style3.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />


<link href="css/reset.css" rel="stylesheet" type="text/css" />
<link href="css/supersized.css" rel="stylesheet" type="text/css" />
<link href="css/style2.css" rel="stylesheet" type="text/css" />




</head>
<body>
<!-- Barre de navigation  -->
<header>
    <div class="nav">
      <ul>
        <li><a href="Acceuil.jsp">Accueil</a></li>
       <li><a href="#">Aide</a></li>
       <li><a href="login.jsp">Connexion</a></li>
      </ul>
    </div>
  </header>
<!-- Fin barre de navigation -->


<div class="row">

  <div class="eightcol last">

    <!-- Formulaire d'inscription -->

    <form action="InscriptionServlet" method="POST">

        <section name="Inscription">

          <div><label>Username:</label><input id="username" name="login" type="text" required=""/></div>
          <div><label>Password:</label><input id="pass1" name="motdepasse" type="password" required=""/></div>
          <div><label>E-mail:</label><input id="email" name="email" data-ideal="required email" type="email"/></div>
        </section>

      <div><hr/></div>

      <div>
        <button type="submit">Submit</button>
        <button id="reset" type="button">Reset</button>
      </div>

    </form>

    <!-- End Form -->

  </div>

</div>

 <!-- Scripts  -->

<script type="text/javascript">
var options = {

	onFail: function(){
		alert( $myform.getInvalid().length +' invalid fields.' )
	},

	inputs: {
		'password': {
			filters: 'required pass',
		},
		'username': {
			filters: 'required username',
			data: {
			//ajax: { url:'validate.php' }
			}
		},
		
	}
	
};

var $myform = $('#my-form').idealforms(options).data('idealforms');

$('#reset').click(function(){
	$myform.reset().fresh().focusFirst()
});

$myform.focusFirst();
</script>

</body>
</html>