package logic.control;

import java.util.*;
import logic.model.Vehicle;

public class ControllerBookAppointment {
	//*****PROVA SINGLETON*****
	private static ControllerBookAppointment INSTANCE = null;
	
	//*****COSTRUTTORE*****
	private ControllerBookAppointment() {} //"private" perch� tramite getInstance() potr� essere chiamato solo dall'interno
	
	public static ControllerBookAppointment getInstance() {
		if(INSTANCE==null)
			INSTANCE=new ControllerBookAppointment();
		return INSTANCE;
	}
	//*****FINE SINGLETON*****
	
	Vehicle selVehicle = new Vehicle();
	
	//*****METODI*****
	public void saveNewVehicle(){
		
	}
	public void editVehicle(){
		
	}
	public void DeleteVehicle(){
		
	}
	public void findMechanic(String address, String area, String city){
		
	}
	public void bookApp(Mechanic infoMech, Driver infoDriver, Date dateBook, String problems, Vehicle selVehicle){
		
	}
	public void saveFavorite(Mechanic infoMech){
		
	}
	public void contactMechanicBook(Mechanic infoMech, Booking infoBookng){
		
	}
	public void confirmBooking(Boolean value){
		
	}
	
}
