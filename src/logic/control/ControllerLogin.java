package logic.control;

public class ControllerLogin {
	//*****PROVA SINGLETON*****
	private static ControllerLogin istance = null;
	
	//*****COSTRUTTORE*****
	private ControllerLogin() {} //"private" perche' tramite getInstance() potra essere chiamato solo dall'interno
	
	public static ControllerLogin getInstance() {
		if(istance == null)
			istance = new ControllerLogin();
		return istance;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****

}
