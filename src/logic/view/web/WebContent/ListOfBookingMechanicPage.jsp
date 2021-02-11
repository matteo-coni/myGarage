<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="logic.bean.BookingBean" %>

<!-- dichiarazione e instanziazione di una variabile -->
<jsp:useBean id="controlViewBook" scope="request" class="logic.control.ControllerViewBook"/>


<%
//compilare in JAVA il corpo della pagina
		List<BookingBean> listBookingBean = new ArrayList<>();
		
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy",Locale.ITALY);		

		listBookingBean = controlViewBook.findBooking((String)session.getAttribute("username"));
		String nome1="";
		String targa1="";
		String data1="";
		String nome2="";
		String targa2="";
		String data2="";
		String nome3="";
		String targa3="";
		String data3="";
		
		
		
		if(listBookingBean.size()==1) {
			nome1 = listBookingBean.get(0).getUsername();
			targa1 =listBookingBean.get(0).getVeicolo();
			data1 = sdf.format(listBookingBean.get(0).getDataPrenotazione());
			
		}
		
		System.out.println(nome1);
		
		if(listBookingBean.size()==2) {
			nome1 = listBookingBean.get(0).getUsername();
			targa1 =listBookingBean.get(0).getVeicolo();
			data1 = sdf.format(listBookingBean.get(0).getDataPrenotazione());
			
			nome2 = listBookingBean.get(1).getUsername();
			targa2 =listBookingBean.get(1).getVeicolo();
			data2 = sdf.format(listBookingBean.get(1).getDataPrenotazione());
		}
		
		if(listBookingBean.size()==3) {
			nome1 = listBookingBean.get(0).getUsername();
			targa1 =listBookingBean.get(0).getVeicolo();
			data1 = sdf.format(listBookingBean.get(0).getDataPrenotazione());
			
			nome2 = listBookingBean.get(1).getUsername();
			targa2 =listBookingBean.get(1).getVeicolo();
			data2 = sdf.format(listBookingBean.get(1).getDataPrenotazione());
			
			nome3 = listBookingBean.get(2).getUsername();
			targa3 =listBookingBean.get(2).getVeicolo();
			data3 = sdf.format(listBookingBean.get(2).getDataPrenotazione());
		}
		
		if(request.getParameter("accetta1")!=null){
			
			controlViewBook.confirmBooking(nome1,(String)session.getAttribute("username"),targa1 ,1);
		}
		
		if(request.getParameter("accetta2")!=null){
			
			controlViewBook.confirmBooking(nome2,(String)session.getAttribute("username"),targa2 ,1);
		}
		
		if(request.getParameter("accetta3")!=null){
			
			controlViewBook.confirmBooking(nome3,(String)session.getAttribute("username"),targa3 ,1);
		}
		
		if(request.getParameter("declina1")!=null){
			
			controlViewBook.confirmBooking(nome1,(String)session.getAttribute("username"),targa1 ,0);
		}
		
		if(request.getParameter("declina2")!=null){
			
			controlViewBook.confirmBooking(nome2,(String)session.getAttribute("username"),targa2 ,0);
		}
		
		if(request.getParameter("declina3")!=null){
			
			controlViewBook.confirmBooking(nome3,(String)session.getAttribute("username"),targa3 ,0);
		}
		
%>
<!DOCTYPE html>
<html lang="">
  <head>
    <title>List Of Booking</title>
  </head>
  <body>
  <form action="ListOfBookingMechanicPage.jsp" name="myform" method="POST">
    <table style="border-collapse: collapse; width: 1667px; height: 954px;" border="1">
    <caption></caption>
		<th scope=""></th>
      <tbody>
        <tr style="height: 84px;">
          <td style="width: 51px; height: 43px; text-align: center; margin-left: 64px;">
            <a href="pippo.html"><img src="images_web/settings_71x71.png" alt="settings"

                title="settings"></a> </td>
          <td style="width: 31px; height: 43px; text-align: center; margin-left: 147px;">
            <a href="Help.html"><img src="images_web/help_71x71.png" alt="help"

                style="width: 71px; height: 71px;" title="help"></a> </td>
          <td style="width: 1596px; text-align: center; height: 86px; margin-left: -427px;"

            rowspan="2" colspan="1">
            <h1 style="text-align: center;"><strong>Lista Appuntamenti</strong>
            </h1>
          </td>
        </tr>
        <tr style="height: 85px;">
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="HomeScreen.jsp"><img

                src="images_web/M_71x71.png" alt="M" title="M"></a> </td>
          <td style="width: 71px; height: 43px; text-align: center;"> <a href="LoginScreen.jsp"><img

                src="images_web/logout_71x71.png" alt="logout" title="logout"></a>
          </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 23px; text-align: center;" colspan="2">
            <a href="ListOfBookingMechanic.jsp"><img src="images_web/list_selected.png"

                alt="listOfBooking" title="listOfBooking"></a> </td>
          <td style="text-align: center;">
            <h4>Nome:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <input name="name"

                id="name" readonly="readonly" value="<%=nome1 %>" type="text"></h4>
            
            <h4>Data:&nbsp;&nbsp; <input name="surname" id="surname" readonly="readonly" value="<%=data1 %>"

                type="text"></h4>
            <h4>Targa:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <input name="address" value="<%=targa1 %>"

                id="address" readonly="readonly" type="text"></h4>
          </td>
          <td style="text-align: center;"> <textarea id="problems" name="problems"

rows="4" cols="50" readonly="readonly"></textarea> </td>
          <td style="text-align: center;"> 
          
          <button name="accetta1">Accetta</button>
            <br>
            <br>
           <button name="declina1">Declina</button> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="width: 194px; height: 153px; text-align: center;" colspan="2">
            <a href="FindParkingPage.jsp"><img src="images_web/Parking_250x250.png"

                alt="bookParking" style="width: 255px; height: 255px;" title="bookParking"></a>
          </td>
          <td style="text-align: center;">
            <h4>Nome:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <input name="name" value="<%=nome2 %>"

                id="name" readonly="readonly" type="text"></h4>
            <h4>Data:&nbsp;&nbsp; <input name="surname" id="surname" readonly="readonly" value="<%=data2 %>"

                type="text"></h4>
            <h4>Targa:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <input name="address" value="<%=targa2 %>"

                id="address" readonly="readonly" type="text"></h4>
          </td>
          <td style="text-align: center;"> <textarea id="problems" name="problems"

rows="4" cols="50" readonly="readonly"></textarea> </td>
          <td style="text-align: center;"> 
          <button name="accetta2">Accetta</button><br>
            <br>
            <br>
            <button name="declina2">Declina</button> </td>
        </tr>
        <tr style="height: 18px;">
          <td style="height: 45px; width: 194px; text-align: center;" colspan="2">
            <a href="FindMechanicPage.jsp"><img src="images_web/BookMechanic_250x250.png"

                alt="bookMechanic" style="width: 255px; height: 256px;" title="bookMechanic"></a>
          </td>
          <td style="text-align: center;">
            <h4>Nome:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <input name="name" value="<%=nome3 %>"

                id="name" readonly="readonly" type="text"></h4>
            <h4>Data:&nbsp;&nbsp; <input name="surname" id="surname" readonly="readonly" value="<%=data3 %>"

                type="text"></h4>
            <h4>Targa:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <input name="address" value="<%=targa3 %>"

                id="address" readonly="readonly" type="text"></h4>
          </td>
          <td style="text-align: center;"> <textarea id="problems" name="problems"

rows="4" cols="50" readonly="readonly"></textarea> </td>
          <td style="text-align: center;"> <button name="accetta3">Accetta</button><br>
            <br>
            <br>
            <button name="declina3">Declina</button> </td>
        </tr>
      </tbody>
    </table>
    </form>
  </body>
</html>