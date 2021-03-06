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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import logic.bean.*;
import logic.control.ControllerViewVehicle;


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
	@FXML
	ComboBox<String> menuSelectVehicle;
	@FXML
	ImageView imageBookMechanic;
	@FXML
	ImageView imageLogout;
	
	
	
	
	
	@FXML 
	public void exit() throws IOException{
		FactoryView factory = FactoryView.getInstance();
		View viewLogout;
		viewLogout = factory.createView(TypeView.LOGIN); 
		
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), viewLogout);
		
	}
	
	
	@FXML
	public void insertVehicle() {
		
		try {
		FactoryView factory = FactoryView.getInstance();
		View view;
		view = factory.createView(TypeView.INSERTVEHICLEPAGE); 
			
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void initialize() {
		
		String username = ControllerMain.getInstance().getId();
		
		
		
		ControllerViewVehicle controlViewVehicle = new ControllerViewVehicle();
		List<String> targheVeicoliHome = controlViewVehicle.viewVehicle(username); 
		
		for(String targa: targheVeicoliHome) { //Clico for per aggiungere le targhe al "combobox" (Solo targhe legate all'username)
						
			//String targaVehicle = "ciao"; ---TEST-----
			menuSelectVehicle.getItems().addAll(
					targa);
						
		}
		
	}
	
	@FXML
	public void viewVehicle() {
		
		// settarre i vari Text in base ad una ricerca del dao *********
		String targaCb = menuSelectVehicle.getValue();
		ControllerViewVehicle controlViewVehicle = new ControllerViewVehicle();
		VehicleBean vehiclebean = controlViewVehicle.loadVehicle(targaCb);
		
		
		textTarga.setText(vehiclebean.getTargaVehicle());
		textMarca.setText(vehiclebean.getMarcaVehicle());
		textModello.setText(vehiclebean.getModelloVehicle());
		textCilindrata.setText(vehiclebean.getCilindrataVehicle());
		textCavalli.setText(vehiclebean.getCavalliVehicle());
		
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy",Locale.ITALY);
		String ass = sdf.format(vehiclebean.getScadAssicurazione());
		String rev = sdf.format(vehiclebean.getScadRevisione());
		String bollo = sdf.format(vehiclebean.getScadBollo());
		String tagl = sdf.format(vehiclebean.getScadTagliando());
		
		textAssicurazione.setText(ass);
		textBollo.setText(bollo);
		textRevisione.setText(rev);
		textTagliando.setText(tagl);
		
		
	}
	
	@FXML
	public void bookMech() {
		try {
			FactoryView factory = FactoryView.getInstance();
			View view;
			view = factory.createView(TypeView.MECHANICPAGE); 
				
			ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
			
			} catch (IOException eIo) {
				eIo.printStackTrace();
			}
	}
}

