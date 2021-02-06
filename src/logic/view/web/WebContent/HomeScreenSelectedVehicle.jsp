<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!-- dichiarazione e instanziazione di una variabile -->
<jsp:useBean id="vehiclebean" scope="request" class="logic.bean.VehicleBean"/>
<jsp:useBean id="controlViewVehicle" scope="request" class="logic.control.ControllerViewVehicle"/>
<!-- procedere con la dichiarazione di tutte le istanze utilizzate -->

<!-- mappa gli attributi di un oggetto sui campi della form -->
<jsp:setProperty name="User" property="*" />
<!-- procedere nel mappare ogni attributo di ogni classe -->

<%
//compilare in JAVA il corpo della pagina
	if (request.getParameter("")!=null){
		
		String targaCb = "BB/636/CG";//request.getParameter("Vehicle");
		//ControllerViewVehicle controlViewVehicle = new ControllerViewVehicle();
		vehiclebean = controlViewVehicle.loadVehicle(targaCb);
		//System.out.println(vehiclebean.getMarcaVehicle());
		vehiclebean.setTargaVehicle(targaCb);
%>		
		
<% 		
	}
%>

<html>
  <head>
    <title>Home Page</title>
  </head>
  <body>
    <table style="border-collapse: collapse; width: 1667px; height: 954px;" border="1">
      <tbody>
        <tr style="height: 84px;">
          <td style="width: 51px; height: 43px; text-align: center; margin-left: 64px;">
            <a href="pippo.html"><img src="/trunk/images/settings_71x71.png"

                alt="settings" title="settings"></a> </td>
          <td style="width: 31px; height: 43px; text-align: center; margin-left: 147px;">
            <a href="Help.html"><img src="/trunk/images/help_71x71.png"

                alt="help" style="width: 71px; height: 71px;" title="help"></a>
          </td>
          <td style="width: 1596px; text-align: center; height: 86px; margin-left: -427px;"

            rowspan="1" colspan="1">
            <h1 style="text-align: center;"><strong>myGarage</strong> </h1>
          </td>
        </tr>
        <tr style="height: 85px;">
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="HomeScreen.jsp"><img

                src="/trunk/images/M_71x71.png"

                alt="M" title="M"></a> </td>
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="LoginScreen.jsp"><img

                src="/trunk/images/logout_71x71.png"

                alt="logout" title="logout"></a> </td>
          <td>
            <h4 style="text-align: center;">Seleziona il tuo Veicolo</h4>
            <div style="text-align: center;">
              <select name="Vehicle" id="select" size="1">
                <option disabled="disabled" selected="selected">Veicolo</option>
                <option>Vehicle Number 1</option>
                <option>Vehicle Number 2</option>
                <%
                	List<String> listVehicle = new ArrayList<String>();
                	listVehicle = controlViewVehicle.viewVehicle("admin");
                %>
              </select>
              <button id="load" name="Load" value="Visualizza" type="button" onClick="fnc('<%=vehiclebean.getTargaVehicle()%>')">Visualizza Info</button> 
             		
             		<script type="text/javascript"> 
						
                    	function fnc(prova)
						{
							//AGGIUNGERE I VARI SET TEXT
						
				
		   				 document.getElementById("licensePlate").textContent = prova; 
		   				 document.getElementById("vehicleBrand").textContent = prova; 
		   					 
						}
					</script>
            </div>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 23px; text-align: center;" colspan="2">
            <a href="InsertVehiclePage.jsp"><img src="/trunk/images/InsertVehicle_250x250.png"

                alt="insertVehicle" title="insertVehicle"></a> </td>
          <td>
            <table style="width: 1416px; height: 1px;" border="1">
              <tbody>
                <tr style="height: 18px;">
                  <td style="width: 302px; height: 23px;">
                    <h4 style="text-align: center;">Immagine</h4>
                    <h4 style="text-align: center;">
                    <button id="carica" name="carica" value="Carica" type="button">Carica</button> </h4>
                   
                  </td>
                  <td style="width: 288px; height: 23px;">
                    <h4 style="text-align: center;">
                    <label for="licensePlate">Targa</label></h4>
                    <h4 style="text-align: center;">
                    <label id="licensePlate"></label>
                    
                    </h4>
                  
                  </td>
                  <td style="width: 288px; height: 23px;">
                    <h4 style="text-align: center;">
                     <label for="vehicleBrand">Marca</label></h4>
                    <h4 style="text-align: center;">
                    <label id="vehicleBrand"></label><input

                        name="vehicleBrand" id="vehicleBrand" readonly="readonly"

                        type="text"></h4>
                  </td>
                  <td style="width: 288px; height: 153px;">
                    <h4 style="text-align: center;">
                    <label for="vehicleModel">Modello</label></h4>
                    
                    <h4 style="text-align: center;">
                    <label for="vehicleModel"></label>
                    <label for="vehicleModel"></label><input name="vehicleModel" id="vehicleModel"

                        readonly="readonly" type="text"></h4>
                  </td>
                </tr>
              </tbody>
            </table>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 153px; text-align: center;" colspan="2">
            <a href="FindParkingPage.jsp"><img src="/trunk/images/Parking_250x250.png"

                alt="bookParking" style="width: 255px; height: 255px;" title="bookParking"></a>
          </td>
          <td style="text-align: center; height: 261px;">
            <table style="text-align: center; margin-left: auto; margin-right: auto;"

              border="1">
              <tbody>
                <tr style="height: 18px;">
                  <td style="width: 302px; height: 153px;">
                    <h4 style="text-align: center;"> <label for="vehicleDisplacement">Cilindrata</label></h4>
                    <h4 style="text-align: center;"><input name="vehicleDisplacement"

                        id="vehicleDisplacement" readonly="readonly" type="text"></h4>
                  </td>
                  <td style="width: 288px; height: 153px;">
                    <h4 style="text-align: center;"> <label for="vehiclePowertrains">Cavalli
                        Motrici</label></h4>
                    <h4 style="text-align: center;"><input name="vehiclePowertrains"

                        id="vehiclePowertrains" readonly="readonly" type="text"></h4>
                  </td>
                </tr>
              </tbody>
            </table>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="height: 45px; width: 194px; text-align: center;" colspan="2">
            <a href="FindMechanicPage.jsp"><img src="/trunk/images/BookMechanic_250x250.png"

                alt="bookMechanic" style="width: 255px; height: 256px;" title="bookMechanic"></a>
          </td>
          <td style="height: 260px;">
            <table style="width: 1416px; height: 1px;" border="1">
              <tbody>
                <tr style="height: 18px;">
                  <td style="width: 302px; height: 45px; text-align: center;">
                    <h4> <label for="vehicleInsurance">Data Assicurazione</label></h4>
                    <h4><label for="vehicleInsurance"></label><input name="vehicleInsurance"

                        id="vehicleInsurance" readonly="readonly" type="text"></h4>
                  </td>
                  <td style="width: 288px; height: 45px; text-align: center;">
                    <h4><label for="vehicleTax">Data Bollo</label></h4>
                    <h4><label for="vehicleTax"></label><input name="vehicleTax" id="vehicleTax"

                        readonly="readonly" type="text"></h4>
                  </td>
                  <td style="width: 302px; height: 45px; text-align: center;">
                    <h4> <label for="vehicleReview">Data Revisione</label></h4>
                    <h4><label for="vehicleReview"></label><input name="vehicleReview"

                        id="vehicleReview" readonly="readonly" type="text"></h4>
                  </td>
                  <td style="width: 288px; height: 45px; text-align: center;">
                    <h4> <label for="vehicleService">Data Tagliando</label></h4>
                    <h4 style="text-align: center;"><label for="vehicleService"></label><input

                        name="vehicleService" id="vehicleService" readonly="readonly"

                        type="text"></h4>
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
