package logic.view.desktop.view;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import animatefx.animation.FadeIn;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.fxml.*;
import logic.view.desktop.controllerview.ControllerMain;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.view.desktop.view.View;



//import logic.control.ControllerInsertVehicleInfo;



public class ViewLoginMain extends Application {
	
	/*static Stage primaryStage; 
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			TitledPane root = FXMLLoader.load(getClass().getResource("ViewDesktopMain.fxml"));
			
			Scene scene = new Scene(root,1294,914);
			
		
			//scene.setRoot(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			
			this.primaryStage = primaryStage;
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Stage getStage() {
		return primaryStage;
	}*/
	private double offsetX;
	private double offsetY;
	private Parent root;
	
	public Parent getRoot() {
		return this.root;
	}
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public ViewLoginMain() { // may be singleton
		try {
			load();
		} catch (IOException e) {
			
		}
	}
	public void load() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/logic/view/desktop/view/Cont.fxml"));
		setRoot(loader.load());
	}

	@Override
	public void start(Stage mainStage) throws Exception{		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/logic/view/desktop/view/Cont.fxml"));
			setRoot(loader.load());
			Scene ViewLoginMain = new Scene(root);
			mainStage.setScene(ViewLoginMain);
			//mainStage.initStyle(StageStyle.UNDECORATED);
			/*root.setOnMousePressed(event -> {
				offsetX = event.getSceneX();
				offsetY = event.getSceneY();			
			});

			root.setOnMouseDragged(event -> {
				mainStage.setX(event.getScreenX()-offsetX);
				mainStage.setY(event.getScreenY()-offsetY);
			});*/
			ControllerMain ctrl = ControllerMain.getInstance();
			FactoryView factory = FactoryView.getInstance();
			View subview = factory.createView(TypeView.LOGIN);
			ctrl.replace((BorderPane)getAllNodes(root).get(0), subview);
			mainStage.show();
			//new FadeIn(root).play();
		} catch (IllegalStateException e) {
			
		}
	}
	public static List<Node> getAllNodes(Parent p){
		ArrayList<Node> nodes = new ArrayList<>();
		addAllDescendents(p,nodes);
		return nodes;
	}
	private static void addAllDescendents(Parent p, ArrayList<Node> nodes) {
		for (Node n : p.getChildrenUnmodifiable()) {
			nodes.add(n);
			if(n instanceof Parent)
				addAllDescendents((Parent)n,nodes);
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
