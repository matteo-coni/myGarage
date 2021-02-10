<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.*"  %>
<%@ page import="java.util.Locale" %>
<!-- dichiarazione e instanziazione di una variabile -->
<jsp:useBean id="vehiclebean" scope="request" class="logic.bean.VehicleBean"/>
<jsp:useBean id="controlViewVehicle" scope="request" class="logic.control.ControllerViewVehicle"/>
<!-- procedere con la dichiarazione di tutte le istanze utilizzate -->

<!-- mappa gli attributi di un oggetto sui campi della form -->
<!--  jsp:setProperty name="User" property="*" /> -->
<!-- procedere nel mappare ogni attributo di ogni classe -->

<%
//compilare in JAVA il corpo della pagina
	String ass = "";
	String rev = "";
	String bollo = "";
	String tagl = "";
	String targa = "";
	String marca = "";
	String cavalli = "";
	String cilindrata = "";
	String modello = "";
	
	if (request.getParameter("Load") != null){
	
		String targaCb = request.getParameter("Vehicle"); //"BB/636/CG";
		
		vehiclebean = controlViewVehicle.loadVehicle(targaCb);
		//System.out.println(vehiclebean.getMarcaVehicle());//TEST
		vehiclebean.setTargaVehicle(targaCb);
		System.out.println(session.getAttribute("username"));
		
		if(vehiclebean.getTargaVehicle()!=null){
			targa = vehiclebean.getTargaVehicle();
		}
		if(vehiclebean.getMarcaVehicle()!=null){
			marca = vehiclebean.getMarcaVehicle();
		}
		if(vehiclebean.getModelloVehicle()!=null){
			modello = vehiclebean.getModelloVehicle();
		}
		if(vehiclebean.getCilindrataVehicle()!=null){
			cilindrata = vehiclebean.getCilindrataVehicle();
		}
		if (vehiclebean.getCavalliVehicle()!=null){
			cavalli = vehiclebean.getCavalliVehicle();
		}
		
		if(vehiclebean.getScadAssicurazione()!=null && vehiclebean.getScadBollo()!=null && vehiclebean.getScadRevisione()!=null && vehiclebean.getScadTagliando()!=null){	
		
			DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy",Locale.ITALY);
			ass = sdf.format(vehiclebean.getScadAssicurazione());
			rev = sdf.format(vehiclebean.getScadRevisione());
			bollo = sdf.format(vehiclebean.getScadBollo());
			tagl = sdf.format(vehiclebean.getScadTagliando());
		}
	}
%> 	
		


		
    	
<!DOCTYPE html>
<html lang="">
  <head>
    <title>Home Page</title>
  </head>
  
  <form action="HomeScreenSelectedVehicle.jsp" name="myform" method="POST">
    <table style="border-collapse: collapse; width: 1667px; height: 954px;" border="1">
    <caption></caption>
		<th scope=""></th>
      <tbody>
        <tr style="height: 84px;">
          <td style="width: 51px; height: 43px; text-align: center; margin-left: 64px;">
            <a href="pippo.html"><img src="images_web/settings_71x71.png"

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

                src="images_web/M_71x71.png"

                alt="M" title="M"></a> </td>
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="LoginScreen.jsp"><img

                src="images_web/logout_71x71.png"

                alt="logout" title="logout"></a> </td>
          <td>
            <h4 style="text-align: center;">Seleziona il tuo Veicolo</h4>
            <div style="text-align: center;">
              <select name="Vehicle" id="select" size="1">
                <option selected="selected">Veicolo</option>
                
            	<%
                	List<String> listVehicle = new ArrayList<String>();
                	String username = (String)session.getAttribute("username");
                	listVehicle = controlViewVehicle.viewVehicle(username);
                	//System.out.println(session.getAttribute("username")); //TESTT
                	for(String targaVehicle: listVehicle){
                %>
                	<option> <%=targaVehicle%> </option>
                <% 		
                	} 
                %>
              </select>
              <button name="Load" >Visualizza Info</button> 
             	
             		
						
                 
            </div>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 23px; text-align: center;" colspan="2">
            <a href="InsertVehiclePage.jsp"><img src="images_web/InsertVehicle_250x250.png"

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
                    <label style="color: red"><%=targa %></label>
                    </h4>
                  
                  </td>
                  <td style="width: 288px; height: 23px;">
                    <h4 style="text-align: center;">
                     <label for="vehicleBrand">Marca</label></h4>
                    <h4 style="text-align: center;">
                    <label id="vehicleBrand"></label>
                    <label style="color: red"><%=marca %></label>
                    </h4>
                  </td>
                  <td style="width: 288px; height: 153px;">
                    <h4 style="text-align: center;">
                    <label for="vehicleModel">Modello</label></h4>
                    
                    <h4 style="text-align: center;">
                    <label id="vehicleModel"></label>
                    <label style="color: red"><%=modello %></label>
                    </h4>
                  </td>
                </tr>
              </tbody>
            </table>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 153px; text-align: center;" colspan="2">
            <a href="FindParkingPage.jsp"><img src="images_web/Parking_250x250.png"

                alt="bookParking" style="width: 255px; height: 255px;" title="bookParking"></a>
          </td>
          <td style="text-align: center; height: 261px;">
            <table style="text-align: center; margin-left: auto; margin-right: auto;"

              border="1">
              <tbody>
                <tr style="height: 18px;">
                  <td style="width: 302px; height: 153px;">
                    <h4 style="text-align: center;"> 
                    <label for="vehicleDisplacement">Cilindrata</label></h4>
                    <h4 style="text-align: center;">
                    <label style="color: red"><%=cilindrata %></label></h4>
                  </td>
                  <td style="width: 288px; height: 153px;">
                    <h4 style="text-align: center;">
                     <label for="vehiclePowertrains">Cavalli Motrici</label></h4>
                    <h4 style="text-align: center;">
                    <label style="color: red"><%=cavalli %></label></h4>
                  </td>
                </tr>
              </tbody>
            </table>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="height: 45px; width: 194px; text-align: center;" colspan="2">
            <a href="FindMechanicPage.jsp"><img src="images_web/BookMechanic_250x250.png"

                alt="bookMechanic" style="width: 255px; height: 256px;" title="bookMechanic"></a>
          </td>
          <td style="height: 260px;">
            <table style="width: 1416px; height: 1px;" border="1">
              <tbody>
                <tr style="height: 18px;">
                  <td style="width: 302px; height: 45px; text-align: center;">
                    <h4> <label for="vehicleInsurance">Data Assicurazione</label></h4>
                    <h4><label id="vehicleInsurance"></label></h4>
                    <h4><label style="color: red"><%=ass %></label></h4>
                  </td>
                  <td style="width: 288px; height: 45px; text-align: center;">
                    <h4><label for="vehicleTax">Data Bollo</label></h4>
                    <h4><label id="vehicleTax"></label>
                    <label style="color: red"><%=bollo %></label></h4>
                  </td>
                  <td style="width: 302px; height: 45px; text-align: center;">
                    <h4> <label for="vehicleReview">Data Revisione</label></h4>
                    <h4><label id="vehicleReview"></label></h4>
                   	<h4> <label style="color: red"><%=rev %></label></h4>
                  </td>
                  <td style="width: 288px; height: 45px; text-align: center;">
                    <h4> <label for="vehicleService">Data Tagliando</label></h4>
                    <h4 style="text-align: center;">
                    <label id="vehicleService"></label>
                    <label style="color: red"><%=bollo %></label></h4>
                  </td>
                </tr>
              </tbody>
            </table>
          </td>
        </tr>
      </tbody>
    </table>
    </form>
  </body>
</html>
                    
