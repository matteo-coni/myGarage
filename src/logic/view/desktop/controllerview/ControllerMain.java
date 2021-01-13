package logic.view.desktop.controllerview;

import javafx.scene.layout.BorderPane;
import logic.view.desktop.view.View;

public class ControllerMain {
	
	
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
	
}


