package logic.view.desktop;

//import javafx.application.*;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.fxml.FXML;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

import logic.view.desktop.ViewOwnerSaveVehicle;


public class ControllerGrafHome /* extends Application*/ {
	
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
	
	//ViewOwnerSaveVehicle viewVehicle = new ViewOwnerSaveVehicle();
	
	@FXML
	public void exit() {
		//button.setText("oh");
		System.out.println("ciaociao");
		//grid.add(rect, 0, 0);
		button3.setText("oh");
		label1.setText("essu");
		
		
		
	
	}
}

