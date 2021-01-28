package logic.view.desktop.controllerview;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.view.desktop.view.View;

public class ControllerGrafBookMech {

	@FXML
	ImageView homeImage;
	@FXML
	ImageView insertImage;
	
	@FXML
	public void back() throws IOException{
		FactoryView factory = FactoryView.getInstance();
		View view;
		view = factory.createView(TypeView.HOMEPAGE); 
		
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
		/*ControllerMain controlMain = new ControllerMain();
		controlMain.replace(controlMain.getContainer(), view);*/
	}
	
	@FXML
	public void insertVehicle() {
		
		try {
		FactoryView factory = FactoryView.getInstance();
		View view;
		view = factory.createView(TypeView.INSERTVEHICLEPAGE); 
			
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
		/*ControllerMain controlMain = new ControllerMain();
		controlMain.replace(controlMain.getContainer(), view);*/
		} catch (IOException e) {
			//dummy
		}
		
	}
}
