package logic.control;

public class ControllerBookParkingSpace {
	//*****PROVA SINGLETON*****
	private static ControllerBookParkingSpace INSTANCE = null;
	
	//*****COSTRUTTORE*****
	private ControllerBookParkingSpace() {} //"private" perché tramite getInstance() potrà essere chiamato solo dall'interno
	
	public static ControllerBookParkingSpace getInstance() {
		if(INSTANCE==null)
			INSTANCE=new ControllerBookParkingSpace();
		return INSTANCE;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****
		
}
