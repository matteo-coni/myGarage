package logic.view.desktop;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.*;

import logic.control.ControllerLogin;



public class ControllerGrafLogin {
	
	public ControllerGrafLogin() {}
	
	@FXML
	Button loginButton;
	@FXML
	TextField usernameField;
	@FXML
	PasswordField passwordField;
	
	@FXML
	public void login() {
		
		String username = usernameField.getText();
		String password = passwordField.getText();
		
		ControllerLogin controlLogin = ControllerLogin.getInstance();
		BoundaryOwnerSaveVehicle controlHome = new BoundaryOwnerSaveVehicle();
		
		if (controlLogin.isValidate(username, password)){
			System.out.println(username);
			
			Stage secondaryStage = Main.getStage();
			controlHome.homePage(secondaryStage);
			
		}
		
		
	}

}
