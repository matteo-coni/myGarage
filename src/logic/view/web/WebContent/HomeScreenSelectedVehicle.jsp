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
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>insert_vehicle_page</title>
  </head>
  <body>
    <table style="border-collapse: collapse; width: 1678px; height: 1042px;" border="1">
      <tbody>
        <tr style="height: 84px;">
          <td style="width: 71px; height: 43px; text-align: center;"> <img src="?????"

              alt="help"> </td>
          <td style="width: 71px; height: 43px; text-align: center;"> <img src="file:///C:/Users/Utente/Desktop/Universit%C3%A0/Ingegneria%20Informatica/Ingegneria%20del%20Software%20e%20Progettazione%20Web/Progetto/myGarage_not_final/myGarage.git/trunk/images/help.png"

              alt="help" style="width: 71px; height: 71px;"> </td>
          <td style="width: 1596px; text-align: center; height: 86px; margin-left: -427px;"

            rowspan="1" colspan="1">
            <h1 style="text-align: center;"><strong>myGarage</strong> </h1>
          </td>
        </tr>
        <tr style="height: 85px;">
          <td style="width: 71px; height: 43px; text-align: center;"> <img src="?????"

              alt="help"> </td>
          <td style="width: 71px; height: 43px; text-align: center;"> <img src="?????"

              alt="help"> </td>
          <td>
            <h4 style="text-align: center;">Seleziona il tuo Veicolo</h4>
            <div style="text-align: center;">
              <select name="Vehicle" size="1">
                <option>Vehicle Number 1</option>
                <option>Vehicle Number 2</option>
              </select>
            </div>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 23px; text-align: center;" colspan="2">
            <img src="file:///C:/Users/Utente/Desktop/Universit%C3%A0/Ingegneria%20Informatica/Ingegneria%20del%20Software%20e%20Progettazione%20Web/Progetto/myGarage_not_final/myGarage.git/trunk/images/InsertVehicle.png"

              alt="insertVehicle"> </td>
          <td>
            <table style="width: 1416px; height: 1px;" border="1">
              <tbody>
                <tr style="height: 18px;">
                  <td style="width: 302px; height: 23px;">
                    <h4 style="text-align: center;">Immagine</h4>
                    <h4 style="text-align: center;"><input name="carica" value="Carica"

type="submit"></h4>
                  </td>
                  <td style="width: 288px; height: 23px;">
                    <h4 style="text-align: center;"><label for="license">Targa</label></h4>
                    <h4 style="text-align: center;"><label for="license"></label><input

                        name="license" type="text"></h4>
                  </td>
                  <td style="width: 288px; height: 23px;">
                    <h4 style="text-align: center;"> <label for="brand">Marca</label></h4>
                    <h4 style="text-align: center;"><label for="brand"></label><input

                        name="brand" type="text"></h4>
                  </td>
                  <td style="width: 288px; height: 153px;">
                    <h4 style="text-align: center;"><label for="model">Modello</label></h4>
                    <h4 style="text-align: center;"><label for="model"></label><label

                        for="model"></label><input name="model" type="text"></h4>
                  </td>
                </tr>
              </tbody>
            </table>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 261px; text-align: center;" colspan="2">
            <img src="file:///C:/Users/Utente/Desktop/Universit%C3%A0/Ingegneria%20Informatica/Ingegneria%20del%20Software%20e%20Progettazione%20Web/Progetto/myGarage_not_final/myGarage.git/trunk/images/Parking.png"

              alt="Parking" style="width: 255px; height: 244px;"> </td>
          <td style="text-align: center; height: 261px;">
            <table style="text-align: center; margin-left: auto; margin-right: auto;"

              border="1">
              <tbody>
                <tr style="height: 18px;">
                  <td style="width: 302px; height: 153px;">
                    <h4 style="text-align: center;"> <label for="cilindrata">Cilindrata</label></h4>
                    <h4 style="text-align: center;"><input name="cilindrata" type="text"></h4>
                  </td>
                  <td style="width: 288px; height: 153px;">
                    <h4 style="text-align: center;"> <label for="cv">Cavalli
                        Motrici</label></h4>
                    <h4 style="text-align: center;"><input name="cv" type="text"></h4>
                  </td>
                </tr>
              </tbody>
            </table>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="height: 260px; width: 194px; text-align: center;" colspan="2">
            <img src="file:///C:/Users/Utente/Desktop/Universit%C3%A0/Ingegneria%20Informatica/Ingegneria%20del%20Software%20e%20Progettazione%20Web/Progetto/myGarage_not_final/myGarage.git/trunk/images/BookMechanic.png"

              alt="bookMechanic" style="width: 255px; height: 256px;"> </td>
          <td style="height: 260px;">
            <table style="width: 1416px; height: 1px;" border="1">
              <tbody>
                <tr style="height: 18px;">
                  <td style="width: 302px; height: 45px; text-align: center;">
                    <h4> <label for="assicurazione">Data Assicurazione</label></h4>
                    <h4><label for="assicurazione"></label><input name="assicurazione"

                        type="text"></h4>
                  </td>
                  <td style="width: 288px; height: 45px; text-align: center;">
                    <h4><label for="bollo">Data Bollo</label></h4>
                    <h4><label for="bollo"></label><input name="bollo" type="text"></h4>
                  </td>
                  <td style="width: 302px; height: 45px; text-align: center;">
                    <h4> <label for="revisione">Data Revisione</label></h4>
                    <h4><label for="revisione"></label><input name="revisione" type="text"></h4>
                  </td>
                  <td style="width: 288px; height: 45px; text-align: center;">
                    <h4> <label for="tagliando">Data Tagliando</label></h4>
                    <h4 style="text-align: center;"><label for="tagliando"></label><input

                        name="tagliando" type="text"></h4>
                  </td>
                </tr>
              </tbody>
            </table>
          </td>
        </tr>
      </tbody>
    </table>
  </body>
</html>