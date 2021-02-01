package logic.view.desktop.controllerview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGrafMain implements Initializable{
	
    @FXML
    private AnchorPane main;
    
	@FXML
	private HBox topMenu;

	@FXML
	private BorderPane container;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ControllerMain.setContainer(container);
	}	
}