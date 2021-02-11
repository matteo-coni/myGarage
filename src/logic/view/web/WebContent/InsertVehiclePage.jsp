<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ page import="java.text.*" %>
<%@ page import="java.util.Date" %>
<%@ page import="logic.exception.EmptyLicensePlateFieldException" %>
<!-- dichiarazione e instanziazione di una variabile -->
<jsp:useBean id="vehiclebean" scope="request" class="logic.bean.VehicleBean"/>
<jsp:useBean id="controlInsertVehicle" scope="request" class="logic.control.ControllerInsertVehicleInfo"/>
<!-- procedere con la dichiarazione di tutte le istanze utilizzate -->

<!-- mappa gli attributi di un oggetto sui campi della form -->

<!-- procedere nel mappare ogni attributo di ogni classe -->

<%
//compilare in JAVA il corpo della pagina
	String err="";

	if(request.getParameter("Insert")!=null){
		
		String username = (String)session.getAttribute("username");
		vehiclebean.setUsername(username);
		vehiclebean.setTargaVehicle(request.getParameter("licensePlate"));
		vehiclebean.setMarcaVehicle(request.getParameter("vehicleBrand"));
		vehiclebean.setModelloVehicle(request.getParameter("vehicleModel"));
		vehiclebean.setCilindrataVehicle(request.getParameter("vehicleDisplacement"));
		vehiclebean.setCavalliVehicle(request.getParameter("vehiclePowertrains"));
		
	
		
		try{
		
			if (request.getParameter("VehicleInsurance") != ""){
				Date dateAss=new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("vehicleInsurance"));
       			vehiclebean.setScadAssicurazione(dateAss);
			}
			if (request.getParameter("VehicleReview") != ""){
				Date dateRev=new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("vehicleReview"));
        		vehiclebean.setScadRevisione(dateRev);
			}
			if (request.getParameter("VehicleTax") != ""){
        		Date dateBollo=new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("vehicleTax"));
        		vehiclebean.setScadBollo(dateBollo);
			}
			if (request.getParameter("VehicleService") != ""){
        		Date dateTagl=new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("vehicleService"));
        		vehiclebean.setScadTagliando(dateTagl);
			}
		
			
			
			if(controlInsertVehicle.saveVehicle(vehiclebean)){
		
			} else {
			
				err = "Dati errati";
			}
		
		} catch (ParseException e){ 
			
		//	<!--   <p  style="color: red">Dati errati</p>> -->
			err = "Inserire tutte le date!";
			 
		} catch (EmptyLicensePlateFieldException emptyLicense){
			
			err = "Inserire la targa!";
		}
	}
%>

<!DOCTYPE html>
<html lang="">
  <head>
    <title>Insert Vehicle Page</title>
  </head>
  <body>
  <form action="InsertVehiclePage.jsp" name="myform" method="POST">
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
          <td style="width: 1477px; text-align: center; height: 86px; margin-left: -70px;"

            rowspan="2" colspan="6">
            <h1 style="text-align: center;"><strong>Insert Vehicle Information</strong></h1>
            <h1><button name="Insert" >Inserisci veicolo</button></h1>
            <h1><%=err %></h1>
          </td>
        </tr>
        <tr style="height: 85px;">
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="HomeScreen.jsp"><img

                src="images_web/M_71x71.png"

                alt="M" title="M"></a> </td>
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="LoginScreen.jsp"><img

                src="images_web/logout_71x71.png"

                alt="logout" title="logout"></a> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 23px; text-align: center;" colspan="2">
            <a href="InsertVehiclePage.jsp"><img src="images_web/InsertVehicle_250x250_selected.png"

                alt="insertVehicle_selected" title="insertVehicle_selected"></a>
          </td>
          <td style="width: 302px; height: 23px;">
            <h4 style="text-align: center;">Inserisci Immagine</h4>
            <h4 style="text-align: center;"><input name=foto id=foto type="file"></h4>
          </td>
          <td style="width: 288px; height: 23px;">
            <h4 style="text-align: center;"><label for="licensePlate">Inserisci Targa</label></h4>
            <h4 style="text-align: center;"><label for="licensePlate"></label><input

                name="licensePlate" id="licensePlate" type="text"></h4>
                
          </td>
          <td style="width: 288px; height: 23px;">
            <h4 style="text-align: center;"> <label for="vehicleBrand">Inserisci Marca</label></h4>
            <h4 style="text-align: center;"><label for="vehicleBrand"></label><input name="vehicleBrand"

                id="vehicleBrand" type="text"></h4>
          </td>
          <td style="width: 288px; height: 153px;">
            <h4 style="text-align: center;"><label for="vehicleModel">Inserisci Modello</label></h4>
            <h4 style="text-align: center;"><label for="vehicleModel"></label><label for="vehicleModel"></label><input

                name="vehicleModel" id="vehicleModel" type="text"></h4>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 153px; text-align: center;" colspan="2">
            <a href="FindParkingPage.jsp"><img src="images_web/Parking_250x250.png"

                alt="bookParking" style="width: 255px; height: 255px;" title="bookParking"></a>
          </td>
          <td style="margin-left: -128px;"> <br>
          </td>
          <td style="width: 302px; height: 153px;">
            <h4 style="text-align: center;"> <label for="vehicleDisplacement">Inserisci
                Cilindrata</label></h4>
            <h4 style="text-align: center;"><input name="vehicleDisplacement" id="vehicleDisplacement"

                type="text"></h4>
          </td>
          <td style="width: 288px; height: 153px;">
            <h4 style="text-align: center;"> <label for="vehiclePowertrains">Inserisci Cavalli
                Motrici</label></h4>
            <h4 style="text-align: center;"><input name="vehiclePowertrains" id="vehiclePowertrains"

                type="text"></h4>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="height: 45px; width: 194px; text-align: center;" colspan="2">
            <a href="FindMechanicPage.jsp"><img src="images_web/BookMechanic_250x250.png"

                alt="bookMechanic" style="width: 255px; height: 256px;" title="bookMechanic"></a>
          </td>
          <td style="width: 302px; height: 45px;">
            <h4 style="text-align: center;"> <label for="vehicleInsurance">Inserisci
                Data Assicurazione</label></h4>
            <h4 style="text-align: center;"><label for="vehicleInsurance"></label><input

                name="vehicleInsurance" id="vehicleInsurance" type="date"></h4>
          </td>
          <td style="width: 288px; height: 45px;">
            <h4 style="text-align: center;"><label for="vehicleTax">Inserisci Data
                Bollo</label></h4>
            <h4 style="text-align: center;"><label for="vehicleTax"></label><input name="vehicleTax"

                id="vehicleTax" type="date"></h4>
          </td>
          <td style="width: 302px; height: 45px;">
            <h4 style="text-align: center;"> <label for="vehicleReview">Inserisci
                Data Revisione</label></h4>
            <h4 style="text-align: center;"><label for="vehicleReview"></label><input

                name="vehicleReview" id="vehicleReview" type="date"></h4>
          </td>
          <td style="width: 288px; height: 45px;">
            <h4 style="text-align: center;"> <label for="vehicleService">Inserisci
                Data Tagliando</label></h4>
            <h4 style="text-align: center;"><label for="vehicleService"></label><input

                name="vehicleService" id="vehicleService" type="date"></h4>
          </td>
        </tr>
      </tbody>
    </table>
    </form>
  </body>
</html>
