package logic.view.desktop;

import javafx.application.*;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
//import logic.control.ControllerLogin;
import logic.view.desktop.Main;


public class ControllerGrafHome /* extends Application*/ {
	

	
	public void homePage(Stage secondaryStage) {
		try {
			//BorderPane root = new BorderPane();
			GridPane root = FXMLLoader.load(getClass().getResource("ViewDesktopHome.fxml"));
		
			Scene scene2 = new Scene(root,1294,914);
	
			//scene.setRoot(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
			secondaryStage.setScene(scene2);
			secondaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*public static void main(String[] args) {
		launch(args);
	
	}*/
}

