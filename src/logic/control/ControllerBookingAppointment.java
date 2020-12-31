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
	public saveNewVehicle(){
		
	}
	public editVehicle(){
		
	}
	public DeleteVehicle(){
		
	}
	public findMechanic(String address, String area, String city){
		
	}
	public bookApp(Mechanic infoMech, Driver infoDriver, Date dateBook, String problems, Vehicle selVehicle){
		
	}
	public saveFavorite(Mechanic infoMech){
		
	}
	public contactMechanicBook(Mechanic infoMech, Booking infoBookng){
		
	}
	public confirmBooking(Boolean value){
		
	}
	
}
