package logic.view.desktop.controllerview;

import javafx.scene.shape.*;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.view.desktop.view.View;
import javafx.fxml.*;
import java.io.IOException;

public class ControllerGrafInsert {

	@FXML
	Polygon Back;
	
	@FXML
	public void back() throws IOException{
		FactoryView factory = FactoryView.getInstance();
		View view;
		view = factory.createView(TypeView.HOMEPAGE); 
			
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
	}
}
