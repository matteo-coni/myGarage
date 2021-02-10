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
	
	public boolean isValidateMech(LoginBean loginBean) {
		
		boolean valid = false;
		try {
			//--query DAO
			//controlla nel database se username e password sono giusti
			UserDAO userdao = new UserDAO();
			valid = userdao.findUserMech(loginBean.getUsername(),loginBean.getPassword());
		
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


