package logic.control;

import logic.bean.*;

public class ControllerLogin {
	//*****PROVA SINGLETON*****
	private static ControllerLogin instance = null;
	
	//*****COSTRUTTORE*****
	private ControllerLogin() {} //"private" perche' tramite getInstance() potra essere chiamato solo dall'interno
	
	public static ControllerLogin getInstance() {
		if(instance == null)
			instance = new ControllerLogin();
		return instance;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****
	public boolean isValidate(LoginBean loginBean) {
		boolean valid;
		
		//controlla nel database se username e password sono giusti
			valid = true; //prova
		
		return valid;
	}

}
