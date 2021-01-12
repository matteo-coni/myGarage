package logic.view.desktop.view;

import java.util.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.fxml.FXML;

import java.awt.*;

public class ViewHomeVehicle {
	
	
	
	public void homePage(Stage secondaryStage) {
		try {
			//BorderPane root = new BorderPane();
			AnchorPane root = FXMLLoader.load(getClass().getResource("ViewDesktopHome.fxml"));
		
			Scene scene2 = new Scene(root,1294,914);
	
			//scene.setRoot(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			secondaryStage.setResizable(false);
			secondaryStage.setScene(scene2);
			
			secondaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	public void setVehicleLicensePlate(String licensePlate) {
		
	}
	
	public void setVehiclebrand(String vehicleBrand) {
		
	}
	
	public void setVehicleModel(String vehicleModel) {
		
	}
	
	public void setDisplacement(int vehicleDisplacement) {
		
	}
	
	public void setPowertrains(int vehiclePowertrains) {
		
	}
	
	public void setVehicleFuel(String vehicleFuel) {
		
	}
	
	public void setVehicleInsurance(Date vehicleInsurance) {
		
	}
	
	public void setVehicleTax(Date vehicleTax) {
		
	}
	
	public void setVehicleReview(Date vehicleReview) {
		
	}
	
	public void setVehicleService(Date vehicleService) {
		
	}
	
	public void setImage(Image img) {
		
	}
	
}
