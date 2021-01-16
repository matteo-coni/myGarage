package logic.view.desktop.controllerview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.layout.BorderPane;

import logic.view.desktop.view.View;
import javafx.fxml.Initializable;
import java.lang.reflect.AccessibleObject;



public class ControllerMain  {
	
	
	//****Singleton****//
	private static ControllerMain instance = null;
	
	private ControllerMain() {}

	public static synchronized ControllerMain getInstance() {
		if(instance == null)
			instance = new ControllerMain();
			
		return instance;
	}
	///Fine singleton
	
	
	private static BorderPane container;
	private int id = 0; 

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public static BorderPane getContainer() {
		return container;
	}

	public static void setContainer(BorderPane container) {
		ControllerMain.container = container;
	}

	public void replace(BorderPane container, View node) {
		container.setCenter(node.getRoot());
		
	}
	
	/*@Override
	public void initialize(URL location, ResourceBundle resources) {
		ControllerMain.setContainer(container);
	}*/	
	
}


