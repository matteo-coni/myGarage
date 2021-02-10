package logic.control;

import logic.bean.*;
import logic.model.dao.*;

public class ControllerLogin {
	
	public ControllerLogin() {
		//Costruttore
	}
	
	//*****METODI*****
	public boolean isValidate(LoginBean loginBean) {
		
		boolean valid = false;
		try {
			//--query DAO -- controlla nel database se username e password sono giusti
			UserDAO userdao = new UserDAO();
			valid = userdao.findUser(loginBean.getUsername(),loginBean.getPassword());
		
			
			return valid;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return valid;
	}
	
	public boolean isValidateMech(LoginBean loginBeanMech) {
		
		boolean validmech = false;
		try {
			//--query DAO -- controlla nel database se username e password sono giusti
			UserDAO userdaomech = new UserDAO();
			validmech = userdaomech.findUserMech(loginBeanMech.getUsername(),loginBeanMech.getPassword());
		
			
			
			return validmech;
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return validmech;
	}
	
}


