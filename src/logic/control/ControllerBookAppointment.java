package logic.control;

import java.util.*;



import logic.model.Mechanic;
import logic.bean.BookingBean;
import logic.bean.MechanicBean;
import logic.exception.EmptyDatePickException;
import logic.model.dao.MechanicDAO;
import logic.model.dao.BookingDAO;
import logic.model.Booking;


public class ControllerBookAppointment {	

	public ControllerBookAppointment() {
		//Costruttore
	}
	
	// *****METODI*****
	public List<MechanicBean> searchByAll(String city, String zone, String name) {
		
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		List<Mechanic> listMechanic;
		
		MechanicDAO mechanicDao = new MechanicDAO();
		
		if (name.equals("")){
			
			if (zone.equals("")) {
				
				listMechanic = mechanicDao.searchByCity(city);
			
			} else {
			
				listMechanic = mechanicDao.searchByCityZone(city,zone);
			}
		} else {
			
			if (zone.equals("")) {
				
				listMechanic = mechanicDao.searchByCityName(city,name);
			
			} else {
			
				listMechanic = mechanicDao.searchByCityZoneName(city,zone,name);
				
			}
		}
		
		try{
			
			for (int i=0; i<=2; i++) {
		
			Mechanic mechanic;
			mechanic = listMechanic.get(i);
			
			MechanicBean mechanicBean = new MechanicBean(mechanic.getName(), mechanic.getGarage(), mechanic.getCity(), mechanic.getZone(), mechanic.getAddress(), mechanic.getPercSconto());
			
			listMechanicBean.add(mechanicBean);
			}
			
		} catch (IndexOutOfBoundsException ie) {
			
			return listMechanicBean; //Se la lunghezza della lista è minore di 3 (alias indice 2) mi fermo 
									 // e ritorno la lista costruita fino a quel punto
		}
		
		return listMechanicBean;
	}
	

	
	public void saveBooking(BookingBean bookingBean) throws EmptyDatePickException {
		
		BookingDAO bookingDao = new BookingDAO();
		Booking booking = new Booking();
		if (bookingBean.getDataPrenotazione()==null) {
			throw new EmptyDatePickException("Inserire la data!");
		}
		booking.setUsername(bookingBean.getUsername());
		booking.setNameGarage(bookingBean.getNomeOfficina());
		booking.setProblems(bookingBean.getProblemi());
		booking.setDateBook(bookingBean.getDataPrenotazione());
		booking.setBookingConfirm(bookingBean.getConfermaPren());
		booking.setSelVehicle(bookingBean.getVeicolo());
		
		bookingDao.saveBooking(booking);
		
		
		
	}
	
}
