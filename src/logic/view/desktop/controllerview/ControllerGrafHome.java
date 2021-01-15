package logic.view.desktop.controllerview;


import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.fxml.FXML;
import javafx.scene.text.*;


public class ControllerGrafHome  {
	
	@FXML
	Button button;
	@FXML
	Button button3;
	Button button2;
	
	Image imageVehicle;
	GridPane grid;
	@FXML
	Text label1;
	
	@FXML
	AnchorPane anchor;
	
	@FXML
	public void exit() {
		
		System.out.println("ciaociao");
		button3.setText("oh");
		label1.setText("essu");
		
			
	
	}
}

