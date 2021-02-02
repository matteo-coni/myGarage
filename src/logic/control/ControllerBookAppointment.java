package logic.control;

import java.util.*;


import logic.model.Vehicle;
import logic.model.Mechanic;
import logic.bean.MechanicBean;
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
	
	public List<MechanicBean> searchByCity(String city) {
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		return listMechanicBean;
	}
	
	public List<MechanicBean> searchByCityName(String city, String name) {
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		return listMechanicBean;
	}
	
	public List<MechanicBean> searchByAll(String city, String zone, String name) {
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		return listMechanicBean;
	}
	
	public List<MechanicBean> searchByCityZone(String city, String zone) {
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		return listMechanicBean;
	}
	
	/*public void saveNewVehicle(){
		
	}
	public void editVehicle(){
		
	}
	public void deleteVehicle(){
		
	}
	public void findMechanic(String address, String area, String city){
		
	}
	public void bookApp(Mechanic infoMech, User infoDriver, Date dateBook, String problems, Vehicle selVehicle){
		
	}
	public void saveFavorite(Mechanic infoMech){
		
	}
	public void contactMechanicBook(Mechanic infoMech, Booking infoBookng){
		
	}
	public void confirmBooking(Boolean value){
		
	}*/
	
}
