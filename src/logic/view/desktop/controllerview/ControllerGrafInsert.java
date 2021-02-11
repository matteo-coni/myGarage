package logic.view.desktop.controllerview;


import logic.bean.*;
import logic.control.*;
import logic.exception.DuplicatedVehicleException;
import logic.exception.EmptyLicensePlateFieldException;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.view.desktop.view.View;

import javafx.scene.shape.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import javafx.scene.paint.*;




public class ControllerGrafInsert {
	
	private static String format="dd/MM/yyyy";

	@FXML
	Polygon back;
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
	Text confirmText;
	@FXML
	ImageView homeImage;
	
	@FXML
	public void back() throws IOException{
		FactoryView factory = FactoryView.getInstance();
		View view;
		view = factory.createView(TypeView.HOMEPAGE); 
		
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
		
	}
	
	
	@FXML
	public void setButton() {
		//grid1.add(button,0,0); //*************PROVA INSERIMENTO RUNTIME*************
		String string = insertTarga.getText();
		System.out.println(string);
		System.out.println(ControllerMain.getInstance().getId());
		
	}
	
	@FXML
	public void confirmInsert() {
		
		
		try {
		String username = ControllerMain.getInstance().getId();					//******TEST****
		String targa = insertTarga.getText();
		String modello = insertModello.getText();
		String marca = insertMarca.getText();
		String cavalli = insertCavalli.getText();
		String cilindrata = insertCilindrata.getText();
		
		String assicurazione = insertAssic.getText();
		String bollo = insertBollo.getText();
		String revisione = insertRevisione.getText();
		String tagliando = insertTagliando.getText();
		
		/*if( targa.equals("")) {
			
			throw new EmptyLicensePlateFieldException("Targa obbligatoria");
			//return;
		}*/
		
		VehicleBean vehicleBean = new VehicleBean(username, targa); // ***** COSTRUTTORE BEAN VEICOLO.....
		vehicleBean.setMarcaVehicle(marca);
		vehicleBean.setModelloVehicle(modello);
		vehicleBean.setCilindrataVehicle(cilindrata);
		vehicleBean.setCavalliVehicle(cavalli);
		
		
		Date dateAss=new SimpleDateFormat(format).parse(assicurazione);
        vehicleBean.setScadAssicurazione(dateAss);
        
        Date dateRev=new SimpleDateFormat(format).parse(revisione);
        vehicleBean.setScadRevisione(dateRev);
        
        Date dateBollo=new SimpleDateFormat(format).parse(bollo);
        vehicleBean.setScadBollo(dateBollo);
        
        Date dateTagl=new SimpleDateFormat(format).parse(tagliando);
        vehicleBean.setScadTagliando(dateTagl);
		
		ControllerInsertVehicleInfo controllerInsert =  new ControllerInsertVehicleInfo();
		
		if( controllerInsert.saveVehicle(vehicleBean)) {
			
			confirmText.setText("Veicolo inserito correttamente!");		
			Color green = Color.GREEN;
			confirmText.setFill(green);
		
		} else {
			
			confirmText.setText("Errore nell'inserimento");	
			Color red = Color.RED;
			confirmText.setFill(red);
			//throw new DuplicatedVehicleException("Veicolo duplicato");
		}
		
		} catch (ParseException pe) {
			
			confirmText.setText("Inserire tutte le date!");
			Color red = Color.RED;
			confirmText.setFill(red);
	
		} catch (EmptyLicensePlateFieldException e) {
			
			confirmText.setText(e.getMessage());
			Color red = Color.RED;
			confirmText.setFill(red);
			System.err.println("provaerr2");
			
		} catch (DuplicatedVehicleException dupExc) {
			
			confirmText.setText(dupExc.getMessage());
			Color red = Color.RED;
			confirmText.setFill(red);
			System.err.println("provaerr2");
		}
		
	}
}
