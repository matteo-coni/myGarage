package logic.control;

import logic.bean.*;
import logic.model.dao.*;

public class ControllerLogin {
	//*****PROVA SINGLETON*****
	//private static ControllerLogin instance = null;
	
	//*****COSTRUTTORE*****
	//private ControllerLogin() {} //"private" perche' tramite getInstance() potra essere chiamato solo dall'interno
	
	public ControllerLogin() {
		
	}
	
	/*public static ControllerLogin getInstance() {
		if(instance == null)
			instance = new ControllerLogin();
		return instance;
	}*/
	//*****FINE SINGLETON*****
	
	//*****METODI*****
	public boolean isValidate(LoginBean loginBean) {
		boolean valid = false;
		try {
		//--query DAO
		//controlla nel database se username e password sono giusti
		UserDAO userdao = new UserDAO();
		valid = userdao.findUser(loginBean.getUsername(),loginBean.getPassword());
		
		if (valid) {
			//User user = new User(loginBean.getUsername());
		}
		return valid;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valid;
	}
	

}
