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
		<title>Find Parking Page</title>
	</head>
	<body>
		<table style="border-collapse: collapse; width: 1678px; height: 1042px;" border="1">
			<tbody>
				<tr style="height: 84px;">
					<td style="width: 71px; height: 43px; text-align: center;">
						<img src="?????" alt="help">
					</td>
					<td style="width: 71px; height: 43px; text-align: center;">
						<img src="file:///C:/Users/Utente/Desktop/Universit%C3%A0/Ingegneria%20Informatica/Ingegneria%20del%20Software%20e%20Progettazione%20Web/Progetto/myGarage_not_final/myGarage.git/trunk/images/help.png" alt="help" style="width: 71px; height: 71px;">
					</td>
					<td style="width: 593px; text-align: center; height: 86px;" rowspan="2" colspan="6">
						<h1 style="text-align: center;">
							<strong>Find Parking</strong>
						</h1>
					</td>
				</tr>
				<tr style="height: 85px;">
					<td style="width: 71px; height: 43px; text-align: center;">
						<img src="?????" alt="help">
					</td>
					<td style="width: 71px; height: 43px; text-align: center;">
						<img src="?????" alt="help">
					</td>
				</tr>
				<tr style="height: 18px;">
					<td style="width: 194px; height: 23px; text-align: center;" colspan="2">
						<img src="file:///C:/Users/Utente/Desktop/Universit%C3%A0/Ingegneria%20Informatica/Ingegneria%20del%20Software%20e%20Progettazione%20Web/Progetto/myGarage_not_final/myGarage.git/trunk/images/InsertVehicle.png" alt="insertVehicle">
					</td>
					<td style="width: 302px; height: 23px;">
						<h2 style="text-align: left;">Cerca Meccanico per:</h2>
						<h4 style="text-align: left;">
							<label for="city">Città&nbsp;&nbsp;&nbsp;</label>
							<input name="city" type="text">
							<label for="address"></label>
						</h4>
						<h4 style="text-align: left;">
							<label for="address">Via</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input name="address" type="text">
							<label for="zone"></label>
						</h4>
						<h4 style="text-align: left;">
							<label for="zone">Zona</label>&nbsp;&nbsp;&nbsp;
							<input name="zone" type="text">
						</h4>
					</td>
				</tr>
				<tr style="height: 18px;">
					<td style="width: 194px; height: 153px; text-align: center;" colspan="2">
						<img src="file:///C:/Users/Utente/Desktop/Universit%C3%A0/Ingegneria%20Informatica/Ingegneria%20del%20Software%20e%20Progettazione%20Web/Progetto/myGarage_not_final/myGarage.git/trunk/images/Parking.png" alt="Parking" style="width: 255px; height: 255px;">
					</td>
				</tr>
				<tr style="height: 18px;">
					<td style="height: 45px; width: 194px; text-align: center;" colspan="2">
						<img src="file:///C:/Users/Utente/Desktop/Universit%C3%A0/Ingegneria%20Informatica/Ingegneria%20del%20Software%20e%20Progettazione%20Web/Progetto/myGarage_not_final/myGarage.git/trunk/images/BookMechanic.png" alt="bookMechanic" style="width: 255px; height: 256px;">
					</td>
				</tr>
			</tbody>
		</table>
	</body>
</html>