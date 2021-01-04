package logic.control;

public class ControllerBookParkingSpace {
	//*****PROVA SINGLETON*****
	private static ControllerBookParkingSpace istance = null;
	
	//*****COSTRUTTORE*****
	private ControllerBookParkingSpace() {} //"private" perch� tramite getInstance() potr� essere chiamato solo dall'interno
	
	public static ControllerBookParkingSpace getInstance() {
		if(istance == null)
			istance = new ControllerBookParkingSpace();
		return istance;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****
		
}
