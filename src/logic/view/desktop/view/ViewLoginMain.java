package logic.view.desktop.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.fxml.*;
import logic.view.desktop.controllerview.ControllerMain;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;



public class ViewLoginMain extends Application {

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
		
			Scene ViewLoginMain = new Scene(root);
			mainStage.setScene(ViewLoginMain);
		
			//ControllerMain ctrl = new ControllerMain();
			ControllerMain ctrl = ControllerMain.getInstance();
			FactoryView factory = FactoryView.getInstance();
			View subview = factory.createView(TypeView.LOGIN);
			ctrl.replace((BorderPane)getAllNodes(root).get(0), subview);
			mainStage.show();

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
