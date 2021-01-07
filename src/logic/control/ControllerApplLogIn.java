package logic.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerApplLogIn {
	
	public ControllerApplLogIn() {}
	
	@FXML
	Button logInButton;
	
	@FXML
	public void logIn() {
		
		logInButton.setText("prova");
		//System.out.println(x);
		
		String name = logInButton.getText();
		ControllerInsertVehicleInfo control = ControllerInsertVehicleInfo.getInstance(); 
		control.checkVehicle(name);
	}

}
