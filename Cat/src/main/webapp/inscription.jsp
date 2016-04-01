<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>



<form action="InscriptionServlet" method="POST">
<div style="padding: 100px 0 0 250px;">
            <fieldset>
                <legend>Inscription</legend>
                <table border="0">
                    <tr>
                       
                        <td>Pseudo</td>
                        <td><input type="text" name="login" value="" required=""/></td>
                        <td>*</td>
                    </tr>
                    <tr>
                        
                    </tr>
                    <tr>
                        <td>Mot de passe</td>
                        <td><input id="pass1" type="password"  name="motdepasse" value="" required=""/ /></td>
                        <td>*</td>
                    </tr>
                   
                    
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Valider" /><input type="reset" value="Cancel" /></td>
                        <td></td>
                    </tr>
 
                </table>
            </fieldset>
            </div>
        </form>
 


</body>
</html>