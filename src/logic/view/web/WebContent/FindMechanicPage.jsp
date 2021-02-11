<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="logic.bean.MechanicBean" %>


<!-- dichiarazione e instanziazione di una variabile -->
<jsp:useBean id="controlBook" scope="request" class="logic.control.ControllerBookAppointment"/>
<jsp:useBean id="mechanicBean" scope="request" class="logic.bean.MechanicBean"/>
<!-- procedere con la dichiarazione di tutte le istanze utilizzate -->

<!-- mappa gli attributi di un oggetto sui campi della form -->

<!-- procedere nel mappare ogni attributo di ogni classe -->

<%
	//TEST System.out.println("prova");
	
	if( request.getParameter("cerca") != null){

		String nome = request.getParameter("name");
		String citta = request.getParameter("city");
		String zona = request.getParameter("zone");
		
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		
		
		if(request.getParameter("city")!=""){	
			
			listMechanicBean = controlBook.searchByAll(citta, zona, nome);
			
			String nomeprova = "ciao prova";
			Thread.sleep(500);
			
			if (listMechanicBean.size()==1){
				String nome1 = listMechanicBean.get(0).getOfficina();
				String indirizzo1 = listMechanicBean.get(0).getIndirizzo();
				String sconto1 = String.valueOf(listMechanicBean.get(0).getPercSconto())+"%";
				
				session.setAttribute("nome1", nome1);
				session.setAttribute("indirizzo1", indirizzo1);
				session.setAttribute("sconto1", sconto1);
			}
			
			if (listMechanicBean.size()==2){
				String nome1 = listMechanicBean.get(0).getOfficina();
				String indirizzo1 = listMechanicBean.get(0).getIndirizzo();
				String sconto1 = String.valueOf(listMechanicBean.get(0).getPercSconto())+"%";
				
				session.setAttribute("nome1", nome1);
				session.setAttribute("indirizzo1", indirizzo1);
				session.setAttribute("sconto1", sconto1);
				
				String nome2 = listMechanicBean.get(1).getOfficina();
				String indirizzo2 = listMechanicBean.get(1).getIndirizzo();
				String sconto2 = String.valueOf(listMechanicBean.get(1).getPercSconto())+"%";
				
				session.setAttribute("nome2", nome2);
				session.setAttribute("indirizzo2", indirizzo2);
				session.setAttribute("sconto2", sconto2);
				
			}
			
			if (listMechanicBean.size()==2){
				String nome1 = listMechanicBean.get(0).getOfficina();
				String indirizzo1 = listMechanicBean.get(0).getIndirizzo();
				String sconto1 = String.valueOf(listMechanicBean.get(0).getPercSconto())+"%";
				
				session.setAttribute("nome1", nome1);
				session.setAttribute("indirizzo1", indirizzo1);
				session.setAttribute("sconto1", sconto1);
				
				String nome2 = listMechanicBean.get(1).getOfficina();
				String indirizzo2 = listMechanicBean.get(1).getIndirizzo();
				String sconto2 = String.valueOf(listMechanicBean.get(1).getPercSconto())+"%";
				
				session.setAttribute("nome2", nome2);
				session.setAttribute("indirizzo2", indirizzo2);
				session.setAttribute("sconto2", sconto2);
				
				String nome3 = listMechanicBean.get(2).getOfficina();
				String indirizzo3 = listMechanicBean.get(2).getIndirizzo();
				String sconto3 = String.valueOf(listMechanicBean.get(2).getPercSconto())+"%";
				
				session.setAttribute("nome3", nome3);
				session.setAttribute("indirizzo3", indirizzo3);
				session.setAttribute("sconto3", sconto3);
				
			}
			%>
				<jsp:forward page="ListOfMechanic.jsp"/>
			<% 
		}
	}

	
%>

<!DOCTYPE html>
<html lang="">
	<head>
		<title>Find Mechanic Page</title>
	</head>
	<body>
	<form action="FindMechanicPage.jsp" name="myform" method="POST">
		<table style="border-collapse: collapse; width: 1667px; height: 702px;" border="1">
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
          <td style="width: 1518px; text-align: center; height: 86px; margin-left: -356px;"

            rowspan="2" colspan="6">
            <h1 style="text-align: center;"><strong>Find Mechanic</strong>
            </h1>
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
            <a href="InsertVehiclePage.jsp"><img src="images_web/InsertVehicle_250x250.png"

                alt="insertVehicle" title="insertVehicle"></a> </td>
          <td style="width: 302px; height: 23px;">
            <h2 style="text-align: left;">Cerca Meccanico per:</h2>
            <h4 style="text-align: left;">
            	<label for="city">Città*&nbsp;&nbsp;&nbsp;</label>
            	<input name="city" id="city" type="text">
            </h4>
            <h4 style="text-align: left;">
            	<label for="address">Nome</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
            	<input name="name" id="name" type="text">
            </h4>
            <h4 style="text-align: left;">
            	<label for="zone">Zona</label>&nbsp;&nbsp;&nbsp;
              	<input name="zone" id="zone" type="text">
            </h4>
            
            <p>
            	
    			<input name="cerca" value="cerca" type="submit">
            	
            </p>
            
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 153px; text-align: center;" colspan="2">
            <a href="FindParkingPage.jsp"><img src="images_web/Parking_250x250.png"

                alt="bookParking" style="width: 255px; height: 255px;" title="bookParking"></a>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="height: 45px; width: 194px; text-align: center;" colspan="2">
            <a href="FindMechanicPageSearched.jsp"><img src="images_web/BookMechanic_250x250_selected.png"

                alt="bookMechanic_selected" style="width: 255px; height: 256px;"

                title="bookMechanic_selected"></a> </td>
        </tr>
      </tbody>
      
    </table>
   </form>
  </body>
</html>