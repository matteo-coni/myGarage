package logic.view.desktop;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.*;

public class MainDesktop extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			
			root = FXMLLoader.load(getClass().getResource("ViewDesktop.fxml"));
			
			//scene.getStylesheets().add(getClass().getResource("ViewDesktop.fxml").toExternalForm());
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