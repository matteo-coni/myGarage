package logic.view.desktop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.*;

import logic.control.ControllerInsertVehicleInfo;



public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			GridPane root = FXMLLoader.load(getClass().getResource("ViewDesktopMain.fxml"));
			
			Scene scene = new Scene(root,400,400);
		
			//scene.setRoot(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
