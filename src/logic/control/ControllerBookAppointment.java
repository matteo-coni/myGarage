package logic.control;

public class ControllerBookAppointment {
	//*****PROVA SINGLETON*****
	private static ControllerBookAppointment INSTANCE = null;
	
	//*****COSTRUTTORE*****
	private ControllerBookAppointment() {} //"private" perché tramite getInstance() potrà essere chiamato solo dall'interno
	
	public static ControllerBookAppointment getInstance() {
		if(INSTANCE==null)
			INSTANCE=new ControllerBookAppointment();
		return INSTANCE;
	}
	//*****FINE SINGLETON*****
	
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
