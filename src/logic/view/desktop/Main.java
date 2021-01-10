package logic.view.desktop;

import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.*;

//import logic.control.ControllerInsertVehicleInfo;



public class Main extends Application {
	
	static Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			TitledPane root = FXMLLoader.load(getClass().getResource("ViewDesktopMain.fxml"));
			
			Scene scene = new Scene(root,1294,914);
			
		
			//scene.setRoot(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			this.primaryStage = primaryStage;
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Stage getStage() {
		return primaryStage;
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
