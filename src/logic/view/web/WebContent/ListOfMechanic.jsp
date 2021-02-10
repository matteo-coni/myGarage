<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!-- dichiarazione e instanziazione di una variabile -->
<jsp:useBean id="controlViewVehicle" scope="request" class="logic.control.ControllerViewVehicle"/>
<jsp:useBean id="controlBook" scope="request" class="logic.control.ControllerBookAppointment"/>
<jsp:useBean id="bookingBean" scope="request" class="logic.bean.BookingBean"/>

<!-- procedere con la dichiarazione di tutte le istanze utilizzate -->

<!-- mappa gli attributi di un oggetto sui campi della form -->

<!-- procedere nel mappare ogni attributo di ogni classe -->

<%
//compilare in JAVA il corpo della pagina
	String nome1 = (String)session.getAttribute("nome1");
	String indirizzo1 = (String)session.getAttribute("indirizzo1");
	String sconto1 = (String)session.getAttribute("sconto1");
	
	String nome2 = "";
	if(session.getAttribute("nome2") != null){
		nome2 = (String)session.getAttribute("nome2");
	}
	String indirizzo2 = "";
	if(session.getAttribute("indirizzo2")!=null){
		indirizzo2 = (String)session.getAttribute("indirzzo2");
	}
	String sconto2="";
	if(session.getAttribute("sconto2")!=null){
		sconto2 = (String)session.getAttribute("sconto2");
	}
	
	String nome3 = "";
	if(session.getAttribute("nome3") != null){
		nome3 = (String)session.getAttribute("nome3");
	}
	String indirizzo3 = "";
	if(session.getAttribute("indirizzo3")!=null){
		indirizzo3 = (String)session.getAttribute("indirzzo3");
	}
	String sconto3="";
	if(session.getAttribute("sconto3")!=null){
		sconto3 = (String)session.getAttribute("sconto3");
	}

	if (request.getParameter("prenota1")!=null){
		
		nome1 = request.getParameter("name1");
		String problems1 = request.getParameter("problems1");
		String date1 = (String)request.getParameter("dateBook1");
		
		bookingBean.setUsername(String.valueOf(session.getAttribute("username")));
		bookingBean.setNomeOfficina(nome1);	
		bookingBean.setProblemi(problems1);
		
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(date1);
		
		bookingBean.setDataPrenotazione(date);
		
		if(request.getParameter("Vehicle")!=null){
			bookingBean.setVeicolo(request.getParameter("Vehicle"));
		} else {
			bookingBean.setVeicolo("Veicolo non definito");
		}
		
		controlBook.saveBooking(bookingBean);
	}
	
	if (request.getParameter("prenota2")!=null){
		
		nome2 = request.getParameter("name2");
		String problems2 = request.getParameter("problems2");
		String date2 = (String)request.getParameter("dateBook2");
		
		bookingBean.setUsername(String.valueOf(session.getAttribute("username")));
		bookingBean.setNomeOfficina(nome2);	
		bookingBean.setProblemi(problems2);
		
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(date2);
		
		bookingBean.setDataPrenotazione(date);
		
		if(request.getParameter("Vehicle")!=null){
			bookingBean.setVeicolo(request.getParameter("Vehicle"));
		} else {
			bookingBean.setVeicolo("Veicolo non definito");
		}
		
		controlBook.saveBooking(bookingBean);
	}
	
if (request.getParameter("prenota3")!=null){
		
		nome3 = request.getParameter("name3");
		String problems3 = request.getParameter("problems3");
		String date3 = (String)request.getParameter("dateBook3");
		
		bookingBean.setUsername(String.valueOf(session.getAttribute("username")));
		bookingBean.setNomeOfficina(nome1);	
		bookingBean.setProblemi(problems3);
		
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(date3);
		
		bookingBean.setDataPrenotazione(date);
		
		if(request.getParameter("Vehicle")!=null){
			bookingBean.setVeicolo(request.getParameter("Vehicle"));
		} else {
			bookingBean.setVeicolo("Veicolo non definito");
		}
		
		controlBook.saveBooking(bookingBean);
	}
%>

<!DOCTYPE>
<html lang="">
  <head>
    <title>Find Mechanic Page</title>
  </head>
  <body>
  <form action="ListOfMechanic.jsp" name="myform" method="POST">
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
          </td>
        </tr>
        <tr style="height: 85px;">
          <td style="width: 71px; height: 43px; text-align: center;"> <a><img

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
          <td style="text-align: center;">
            <h4>Nome:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;
            
             <input name="name1" id="name1" readonly="readonly" value="<%=nome1 %>" readonly="readonly" type="text"></h4>
            
            <h4>Indirizzo: &nbsp; <input name="address1" id="address1" value="<%=indirizzo1 %>" readonly="readonly"  type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Sconto:&nbsp; <input name="sconto1" id="sconto1" readonly="readonly" value="<%=sconto1 %>" type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Inserisci qui i problemi del veicolo:</h4>
            <div><textarea id="problems1" name="problems1" rows="4" cols="50"></textarea></div>
          </td>
          <td style="text-align: center;">
            <h4>Prenota:</h4>
            <input name="dateBook1" id="dateBook1" type="date"> <br>
            <br>
            <input name="prenota1" value ="prenota" type="submit"> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 153px; text-align: center;" colspan="2">
            <a href=""><img src="images_web/Parking_250x250.png"

                alt="bookParking" style="width: 255px; height: 255px;" title="bookParking"></a>
          </td>
          <td style="text-align: center;">
            <h4>Nome:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; 
            
            <input name="name2"  id="name2" value="<%=nome2%>" readonly="readonly" type="text"></h4>
           
            <h4>Indirizzo: &nbsp; 
            
            <input name="address2" id="address2" readonly="readonly" value="<%=indirizzo2%>" type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Sconto:&nbsp; 
            
            <input name="sconto2" id="sconto2" readonly="readonly" value="<%=sconto2%>" type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Inserisci qui i problemi del veicolo:</h4>
            <div><textarea id="problems2" name="problems2" rows="4" cols="50"></textarea></div>
          </td>
          <td style="text-align: center;">
            <h4>Prenota:</h4>
            <input name="dateBook2" id="dateBook2" type="date"> <br>
            <br>
            <input name="prenota2" value="prenota" type="submit"> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="height: 45px; width: 194px; text-align: center;" colspan="2">
            <a href="FindMechanicPage.jsp"><img src="images_web/BookMechanic_250x250_selected.png"

                alt="bookMechanic_selected" style="width: 255px; height: 256px;"

                title="bookMechanic_selected"></a> </td>
          <td style="text-align: center;">
            <h4>Nome:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; 
            <input name="name3" id="name3" value="<%=nome3%>" readonly="readonly" type="text"></h4>
            
            <h4>Indirizzo: &nbsp; <input name="address3" id="address3" value="<%=indirizzo3%>" readonly="readonly" type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Sconto:&nbsp; <input name="sconto3" id="sconto3" value="<%=sconto3%>" readonly="readonly"  type="text"></h4>
          </td>
          <td style="text-align: center;">
            <h4>Inserisci qui i problemi del veicolo:</h4>
            <div><textarea id="problems" name="problems" rows="4" cols="50"></textarea></div>
          </td>
          <td style="text-align: center;">
            <h4>Prenota:</h4>
            <input name="dateBook3" id="dateBook3" type="date"> <br>
            <br>
            <input name="prenota3" value="prenota" type="submit"> </td>
        </tr>
      </tbody>
    </table>
    </form>
  </body>
</html>