package logic.view.desktop.controllerview;


import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.fxml.FXML;
import javafx.scene.text.*;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.view.desktop.view.View;
import java.io.IOException;


public class ControllerGrafHome  {
	
	@FXML
	Button button;
	@FXML
	Button button3;
	
	Button button2;
	@FXML
	ImageView imageVehicle;
	
	GridPane grid;
	@FXML
	Text label1;
	@FXML
	Text textTarga;
	@FXML
	Text textModello;
	@FXML
	Text textMarca; 
	@FXML
	Text textCilindrata;
	@FXML
	Text textCavalli;
	@FXML
	Text textAssicurazione;
	@FXML
	Text textBollo;
	@FXML
	Text textRevisione;
	@FXML
	Text textTagliando;
	
	
	//@FXML
	//AnchorPane anchor;
	
	//Image imgVeh = new Image("/images/BookMechanic.png");
	
	@FXML
	public void exit() {
		
		System.out.println("ciaociao");
		button3.setText("oh");
		label1.setText("essu");
		textTarga.setText("ei");
		textModello.setText("ei");
		//imageVehicle.setImage(imgVeh);
		
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

