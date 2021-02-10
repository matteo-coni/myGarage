package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.bean.LoginBean;
import logic.control.ControllerLogin;

public class LoginTest {

	@Test
	public void CheckLogin() {
		
		ControllerLogin controlLogin = new ControllerLogin();
		LoginBean loginBean = new LoginBean("admin","admin");
		
		Boolean check = controlLogin.isValidate(loginBean);
		
		assertEquals(true,check);
		
	}
	
	@Test
	public void CheckLoginMech() {
		ControllerLogin controlLoginMech = new ControllerLogin();
		LoginBean loginBeanMech = new LoginBean("mechanic","mechanic");
		
		Boolean checkMech = controlLoginMech.isValidateMech(loginBeanMech);
		
		assertEquals(true,checkMech);
	}

}
