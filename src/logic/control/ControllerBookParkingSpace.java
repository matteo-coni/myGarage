package logic.control;

public class ControllerBookParkingSpace {
	//*****PROVA SINGLETON*****
	private static ControllerBookParkingSpace INSTANCE = null;
	
	//*****COSTRUTTORE*****
	private ControllerBookParkingSpace() {} //"private" perch� tramite getInstance() potr� essere chiamato solo dall'interno
	
	public static ControllerBookParkingSpace getInstance() {
		if(INSTANCE==null)
			INSTANCE=new ControllerBookParkingSpace();
		return INSTANCE;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****
		
}
