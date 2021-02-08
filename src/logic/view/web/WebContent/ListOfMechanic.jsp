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
    <title>Find Mechanic Page</title>
  </head>
  <body>
    <table style="border-collapse: collapse; width: 1667px; height: 702px;" border="1">
      <tbody>
        <tr style="height: 84px;">
          <td style="width: 51px; height: 43px; text-align: center; margin-left: 64px;">
            <a href="pippo.html"><img src="images_web/settings_71x71.png"

                alt="settings" title="settings"></a> </td>
          <td style="width: 31px; height: 43px; text-align: center; margin-left: 147px;">
            <a href="pippo.html"><img src="images_web/help_71x71.png"

                alt="help" style="width: 71px; height: 71px;" title="help"></a>
          </td>
          <td style="width: 1518px; text-align: center; height: 86px; margin-left: -356px;"

            rowspan="2" colspan="6">
            <h1 style="text-align: center;"><b><strong>Find Mechanic</strong></b>
            </h1>
          </td>
        </tr>
        <tr style="height: 85px;">
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="pippo.html"><img

                src="images_web/M_71x71.png"

                alt="M" title="M"></a> </td>
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="pippo.html"><img

                src="images_web/logout_71x71.png"

                alt="logout" title="logout"></a> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 23px; text-align: center;" colspan="2">
            <a href="pippo.html"><img src="images_web/"

                alt="insertVehicle" title="insertVehicle"></a> </td>
          <td style="text-align: center;">
            <h4>Nome:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <input name="name"

                id="name" readonly="readonly" type="text"></h4>
            <h4>Indirizzo: &nbsp; <input name="address" id="address" readonly="readonly"

                type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Sconto:&nbsp; <input name="name" id="name" readonly="readonly"

                type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Inserisci qui i problemi del veicolo:</h4>
            <div><textarea id="problems" name="problems" rows="4" cols="50"></textarea></div>
          </td>
          <td style="text-align: center;">
            <h4>Prenota:</h4>
            <input name="dateBook" id="dateBook" type="date"> <br>
            <br>
            <input type="submit"> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 153px; text-align: center;" colspan="2">
            <a href="pippo.html"><img src="images_web/Parking_250x250.png"

                alt="bookParking" style="width: 255px; height: 255px;" title="bookParking"></a>
          </td>
          <td style="text-align: center;">
            <h4>Nome:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <input name="name"

                id="name" readonly="readonly" type="text"></h4>
            <h4>Indirizzo: &nbsp; <input name="address" id="address" readonly="readonly"

                type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Sconto:&nbsp; <input name="name" id="name" readonly="readonly"

                type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Inserisci qui i problemi del veicolo:</h4>
            <div><textarea id="problems" name="problems" rows="4" cols="50"></textarea></div>
          </td>
          <td style="text-align: center;">
            <h4>Prenota:</h4>
            <input name="dateBook" id="dateBook" type="date"> <br>
            <br>
            <input type="submit"> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="height: 45px; width: 194px; text-align: center;" colspan="2">
            <a href="pippo.html"><img src="images_web/BookMechanic_250x250_selected.png"

                alt="bookMechanic_selected" style="width: 255px; height: 256px;"

                title="bookMechanic_selected"></a> </td>
          <td style="text-align: center;">
            <h4>Nome:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <input name="name"

                id="name" readonly="readonly" type="text"></h4>
            <h4>Indirizzo: &nbsp; <input name="address" id="address" readonly="readonly"

                type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Sconto:&nbsp; <input name="name" id="name" readonly="readonly"

                type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Inserisci qui i problemi del veicolo:</h4>
            <div><textarea id="problems" name="problems" rows="4" cols="50"></textarea></div>
          </td>
          <td style="text-align: center;">
            <h4>Prenota:</h4>
            <input name="dateBook" id="dateBook" type="date"> <br>
            <br>
            <input type="submit"> </td>
        </tr>
      </tbody>
    </table>
  </body>
</html>