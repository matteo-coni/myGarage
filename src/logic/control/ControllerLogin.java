package logic.control;

public class ControllerLogin {
	//*****PROVA SINGLETON*****
	private static ControllerLogin INSTANCE = null;
	
	//*****COSTRUTTORE*****
	private ControllerLogin() {} //"private" perch� tramite getInstance() potr� essere chiamato solo dall'interno
	
	public static ControllerLogin getInstance() {
		if(INSTANCE==null)
			INSTANCE=new ControllerLogin();
		return INSTANCE;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****

}
