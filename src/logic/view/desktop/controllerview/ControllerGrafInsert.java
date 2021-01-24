package logic.view.desktop.controllerview;

import javafx.scene.shape.*;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.view.desktop.view.View;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
//import javafx.scene.text.*;
import java.io.IOException;



public class ControllerGrafInsert {

	@FXML
	Polygon Back;
	@FXML
	Button button = new Button("prova");
	@FXML
	GridPane grid1;
	
	@FXML
	Button imageSelect, buttonConfirm;
	@FXML
	TextField insertTarga, insertMarca;
	
	@FXML
	public void back() throws IOException{
		FactoryView factory = FactoryView.getInstance();
		View view;
		view = factory.createView(TypeView.HOMEPAGE); 
			
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
	}
	
	@FXML
	public void setButton() {
		grid1.add(button,0,0); //*************PROVA INSERIMENTO RUNTIME*************
		String string = insertTarga.getText();
		System.out.println(string);
		
	}
}
