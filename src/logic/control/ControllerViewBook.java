package logic.control;

import java.util.ArrayList;
import java.util.List;
import logic.bean.BookingBean;
import logic.model.Booking;
import logic.model.dao.BookingDAO;


public class ControllerViewBook {
	
	public ControllerViewBook(){
		//Costruttore
	}
	
	public List<BookingBean> findBooking(String mechanic){
		
		List<Booking> listBooking = new ArrayList<>();
		List<BookingBean> listBookingBean = new ArrayList<>();
		
		BookingDAO bookingDao = new BookingDAO();
		listBooking = bookingDao.findBooking(mechanic);
		
		try{
			
			for (int i=0; i<=2; i++) {
		
			Booking booking = new Booking();
			booking = listBooking.get(i);
			
			BookingBean bookingBean = new BookingBean(booking.getUsername(), booking.getNameGarage(), booking.getProblems(), booking.getDateBook(), booking.getBookingConfirm(), booking.getSelVehicle());
			
			listBookingBean.add(bookingBean);
			}
			
		} catch (IndexOutOfBoundsException ie) {
			
			return listBookingBean; //Se la lunghezza della lista è minore di 3 (alias indice 2) mi fermo 
									 // e ritorno la lista costruita fino a quel punto
		}	
		
		return listBookingBean;
		
	}
	
	public void confirmBooking(String username, String nomeOfficina, String targa, int val) {
		
		BookingDAO bookingDao = new BookingDAO();
		bookingDao.confirmBooking(username,nomeOfficina,targa,val);
	}

}
