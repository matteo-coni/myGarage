package logic.control;

public class ControllerLogin {
	//*****PROVA SINGLETON*****
	private static ControllerLogin INSTANCE = null;
	
	//*****COSTRUTTORE*****
	private ControllerLogin() {} //"private" perché tramite getInstance() potrà essere chiamato solo dall'interno
	
	public static ControllerLogin getInstance() {
		if(INSTANCE==null)
			INSTANCE=new ControllerLogin();
		return INSTANCE;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****

}
