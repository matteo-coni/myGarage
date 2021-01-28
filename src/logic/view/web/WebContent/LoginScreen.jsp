<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>

<!-- dichiarazione e instanziazione di una variabile -->
<jsp:useBean id="User" scope="request" class="logic.model.User"/>
<!-- procedere con la dichiarazione di tutte le istanze utilizzate -->

<!-- mappa gli attributi di un oggetto sui campi della form -->
<jsp:setProperty name="User" property="*" />
<!-- procedere nel mappare ogni attributo di ogni classe -->

<%
//compilare in JAVA il corpo della pagina
%>

<html>
	<head>
		<title>myGarage Login Page</title>
	</head>
	  <body style="background-image: url(/trunk/images/BackgroundFerrari.jpg)">
	  	<div>
			<form action="LoginScreen.jsp" name="myform" method="POST">
				<div style="text-align: center;"> </div>
				<h1 style="text-align: center;">
					<br>
				</h1>
				<h1 style="text-align: center;">
					<br>
				</h1>
				<h1 style="text-align: center;">
					<br>
				</h1>
				<h1 style="text-align: center;">myGarage</h1>
				<div style="text-align: center;"> </div>
				<h4 style="text-align: center;">
					<label for="username">Username</label>
					<input type="text" id="username" name="username" placeholder="username" required>
				</h4>
				<h4 style="text-align: center;">
					<label for="password">Password</label>
					<input type="text" id="password" name="password" placeholder="password" required>
				</h4>
				<div style="text-align: center;"> </div>
				<div style="text-align: center;">
					<input name="login" value="Login" type="submit">
				</div>
			</form>
		</div>
	</body>
</html>