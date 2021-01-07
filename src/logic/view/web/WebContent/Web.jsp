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
<body>
	<div class="container">
		<form action="Web.jsp" name="myform" method="POST">
			<div class="row">
				<label for="username">Username</label>
				<input type="text" id="username" name="username">
			</div>
			<div class="row">
				<label for="password">Password</label>
				<input type="text" id="password" name="password">
			</div>
			<div class="row">
				<input type="submit" name="login" value="LogIn">
			</div>
		</form>
	</div>
</body>
</html>