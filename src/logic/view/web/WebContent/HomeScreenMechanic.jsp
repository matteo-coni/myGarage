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

<html lang="">
  <head>
    <title>Home Page</title>
  </head>
  <body>
    <table style="border-collapse: collapse; width: 1667px; height: 954px;" border="1">
    <caption></caption>
	<th scope=""></th>
      <tbody>
        <tr style="height: 84px;">
          <td style="width: 51px; height: 43px; text-align: center; margin-left: 64px;">
            <a href="Settings.jsp"><img src="images_web/settings_71x71.png"

                alt="settings" title="settings"></a> </td>
          <td style="width: 31px; height: 43px; text-align: center; margin-left: 147px;">
            <a href="Help.html"><img src="images_web/help_71x71.png"

                alt="help" style="width: 71px; height: 71px;" title="help"></a>
          </td>
          <td style="width: 1596px; text-align: center; height: 86px; margin-left: -427px;"

            rowspan="1" colspan="1">
            <h1 style="text-align: center;"><strong>myGarage</strong> </h1>
          </td>
        </tr>
        <tr style="height: 85px;">
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="HomeScreen.jsp"><img

                src="images_web/M_71x71.png" alt="M" title="M"></a> </td>
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="LoginScreen.jsp"><img

                src="images_web/logout_71x71.png" alt="logout" title="logout"></a>
          </td>
          <td style="text-align: center;"> <input name="view_book" value="Visulizza Penotazioni Pendenti"

type="submit"> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 23px; text-align: center;" colspan="2">
            <a href="LifOfBookingMechanicPage.jsp"><img src="images_web/list.png" alt="listOfBooking"

                title="listOfBooking"></a> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 153px; text-align: center;" colspan="2">
            <a href="FindParkingPage.jsp"><img src="images_web/Parking_250x250.png"

                alt="bookParking" style="width: 255px; height: 255px;" title="bookParking"></a>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="height: 45px; width: 194px; text-align: center;" colspan="2">
            <a href="FindMechanicPage.jsp"><img src="images_web/BookMechanic_250x250.png"

                alt="bookMechanic" style="width: 255px; height: 256px;" title="bookMechanic"></a>
          </td>
        </tr>
      </tbody>
    </table>
  </body>
</html>