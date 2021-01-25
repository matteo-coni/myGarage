package logic.view.desktop.controllerview;


import logic.bean.*;
import logic.control.*;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.view.desktop.view.View;

import javafx.scene.shape.*;
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
	Button imageSelect; 
	@FXML
	Button buttonConfirm;
	@FXML
	TextField insertTarga;
	@FXML
	TextField insertMarca;
	@FXML
	TextField insertModello;
	@FXML
	TextField insertCilindrata; 
	@FXML 
	TextField insertCavalli; 
	@FXML
	TextField insertAssic;
	@FXML 
	TextField insertBollo;
	@FXML
	TextField insertRevisione;
	@FXML
	TextField insertTagliando;
	
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
	
	@FXML
	public void confirmInsert() {
		
		String username = "admin";					//******TEST****
		String targa = insertTarga.getText();
		String modello = insertModello.getText();
		String marca = insertMarca.getText();
		String cavalli = insertCavalli.getText();
		String cilindrata = insertCilindrata.getText();
		
		String assicurazione = insertAssic.getText();
		String bollo = insertBollo.getText();
		String revisione = insertRevisione.getText();
		String tagliando = insertTagliando.getText();
		
		VehicleBean vehicleBean = new VehicleBean(targa, username); //***** COSTRUTTORE BEAN VEICOLO.....
		vehicleBean.setMarcaVehicle(marca);
		vehicleBean.setModelloVehicle(modello);
		vehicleBean.setCilindrataVehicle(cilindrata);
		vehicleBean.setCavalliVehicle(cavalli);
		vehicleBean.setScadAssicurazione(assicurazione);
		vehicleBean.setScadBollo(bollo);
		vehicleBean.setScadRevisione(revisione);
		vehicleBean.setScadTagliando(tagliando);
		
		ControllerInsertVehicleInfo controllerInsert =  ControllerInsertVehicleInfo.getInstance();
		controllerInsert.saveVehicle(vehicleBean);
		
		
		
		
	}
}