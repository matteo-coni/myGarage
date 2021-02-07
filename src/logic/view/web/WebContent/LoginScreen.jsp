<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ page import="logic.bean.*" %>


<!-- dichiarazione e instanziazione di una variabile -->
<jsp:useBean id="ControllerLogin" scope="request" class="logic.control.ControllerLogin"/>
<jsp:useBean id="loginBean" scope="request" class="logic.bean.LoginBean"/>
<!-- procedere con la dichiarazione di tutte le istanze utilizzate -->

<!-- mappa gli attributi di un oggetto sui campi della form -->
<jsp:setProperty name="loginBean" property="*" />
<!-- procedere nel mappare ogni attributo di ogni classe -->

<%
	
	
	if(request.getParameter("login")!=null){
		
		
		
		String username = request.getParameter("username");
		System.out.println(username);
		String password = request.getParameter("password");
		
		LoginBean loginBEAN = new LoginBean(username,password);
		
		
		if(ControllerLogin.isValidate(loginBEAN)){
%>
<%//Session("User") = username; 
 //localStorage.setItem("username", "admin");
 		session.setAttribute("username", username);
%>
			<jsp:forward page="HomeScreenSelectedVehicle.jsp"/>
<%		
		} else {
%>
			<p style="color: red">Dati errati</p>
<%
		}
	}
%>

<html>
	<head>
		<title>myGarage Login Page</title>
	</head>
	  <body style="background-image: url(/trunk/images/BackgroundFerrari_1024x768.jpg)">
    	<div>
    	;
      		<form action="LoginScreen.jsp" name="myform" method="POST">
        <div style="text-align: center;"> </div> 
        <h1 style="text-align: center;"><br>
        </h1>
        <h1 style="text-align: center;"><br>
        </h1>
        <h1 style="text-align: center;"><br>
        </h1>
        <h1 style="text-align: center;">myGarage </h1>
        <div style="text-align: center;"> </div>
        <h4 style="text-align: center;"> 
        	<label for="username"> Username </label>
          		<input name="username" placeholder="username" required id="username" type="text" autocomplete="off"> 
        </h4>
        <h4 style="text-align: center;"> 
        	<label for="password"> Password </label>
          		<input name="password" type= "password" placeholder="password" required id="password" autocomplete="off"> 
        </h4>
        <div style="text-align: center;"> </div>
        <div style="text-align: center;"> 
        		<input name="login" value="login" type="submit">
        </div>
      </form>
    </div>
  </body>
</html>