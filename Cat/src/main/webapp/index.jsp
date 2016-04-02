<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form method="post" action="LoginServlet">
<div style="padding: 100px 0 0 250px;">
<div id="login-box">
<h2>Login Page</h2>
Please provide your credential to use this website
<br>
<br>
<div id="login-box-name" style="margin-top:20px;">User Id:</div>
<div id="login-box-field" style="margin-top:20px;">
<input name="login" class="form-login" title="login" value="" size="30" maxlength="50"  required=""/>
</div>
<div id="login-box-name">Password:</div>
<div id="login-box-field">
<input name="motdepasse" type="password" class="form-login" title="motdepasse" value="" size="30" maxlength="48"  required="" />
</div>
<br />
<span class="login-box-options">
New User?  <a href="inscription.jsp" style="margin-left:30px;">Register Here</a>
</span>
<br />
<br />
<input style="margin-left:100px;" type="submit" value="Login" />
</div>
</div>
</form>
</body>
</html>


