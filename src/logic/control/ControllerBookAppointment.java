package logic.control;

import java.util.*;



import logic.model.Mechanic;
import logic.bean.BookingBean;
import logic.bean.MechanicBean;
import logic.model.dao.MechanicDAO;
import logic.model.Booking;
import logic.model.User;

public class ControllerBookAppointment {
	//*****PROVA SINGLETON*****
	//private static ControllerBookAppointment istance = null;
	
	//*****COSTRUTTORE*****
	public ControllerBookAppointment() {} //"private" perch� tramite getInstance() potr� essere chiamato solo dall'interno
	
	/*public static ControllerBookAppointment getInstance() {
		if(istance == null)
			istance = new ControllerBookAppointment();
		return istance;
	}*/
	//*****FINE SINGLETON*****
	
	
	//*****METODI*****
	
	/*public List<MechanicBean> searchByCity(String city) {
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		
		MechanicDAO mechanicDao = new MechanicDAO();
		List<Mechanic> listMechanic = mechanicDao.searchByCity(city);
		
		return listMechanicBean;
	}
	
	public List<MechanicBean> searchByCityName(String city, String name) {
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		return listMechanicBean;
	}*/
	
	public List<MechanicBean> searchByAll(String city, String zone, String name) {
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		List<Mechanic> listMechanic = new ArrayList<>();
		
		if (name.equals("")){
			if (zone.equals("")) {
				
				MechanicDAO mechanicDao = new MechanicDAO();
				listMechanic = mechanicDao.searchByCity(city);
			
			} else {
			//listMechanicBean = controlBook.searchByCityZone(città,zona);
			}
		} else {
			if (zone.equals("")) {
				//listMechanicBean = controlBook.searchByCityName(città,nome);
			} else {
				//listMechanicBean = controlBook.searchByAll(città,zona,nome);
			}
		}
		
		try{
			for (int i=0; i<=2; i++) {
		
			//MechanicBean mechanicBean = new MechanicBean();
			Mechanic mechanic = new Mechanic();
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
	
	public List<MechanicBean> searchByCityZone(String city, String zone) {
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		return listMechanicBean;
	}
	
	
	public void saveBooking(BookingBean bookingBean) {
		
	}
	
	/*
	public void saveFavorite(Mechanic infoMech){
		
	}
	public void contactMechanicBook(Mechanic infoMech, Booking infoBookng){
		
	}
	public void confirmBooking(Boolean value){
		
	}*/
	
}
