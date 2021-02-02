package logic.view.desktop.controllerview;

import logic.view.desktop.view.View;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.control.ControllerBookAppointment;
import logic.bean.MechanicBean;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.control.*;

public class ControllerGrafBookMech {

	@FXML
	ImageView homeImage;
	@FXML
	ImageView insertImage;
	@FXML
	DatePicker datePick1;
	@FXML
	DatePicker datePick2;
	@FXML
	DatePicker datePick3;
	@FXML
	Button buttonVisualizza;
	@FXML
	Button buttonBooking1;
	@FXML
	Button buttonBooking2;
	@FXML
	Button buttonBooking3;
	@FXML
	TextField nome1;
	@FXML
	TextField nome2;
	@FXML
	TextField nome3;
	@FXML
	TextField indirizzo1;
	@FXML
	TextField indirizzo2;
	@FXML
	TextField indirizzo3;
	@FXML
	TextField sconto1;
	@FXML
	TextField sconto2;
	@FXML
	TextField sconto3;
	@FXML
	TextField textProblem1;
	@FXML
	TextField textProblem2;
	@FXML
	TextField textProblem3;
	@FXML
	TextField nomeCerca;
	@FXML
	TextField zonaCerca;
	@FXML
	TextField cittàCerca;
	
	
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
	
	@FXML
	public void confirmBooking() {
		//String data = datePick.getAccessibleText();
		//System.out.println(data);
		LocalDate datap = datePick1.getValue();
		System.out.println(datap.toString());
		
	}
	
	@FXML
	public void findMechanic() {
		
		String nome = nomeCerca.getText();
		String zona = zonaCerca.getText();
		String città = cittàCerca.getText();
		
		ControllerBookAppointment controlBook = new ControllerBookAppointment();
		List<MechanicBean> listMechanicBean = new ArrayList<>();
		
		if (città.equals("")){
			//Scrivere di dover inserire la città obbligatoriamente
			return;
		}
		
		listMechanicBean = controlBook.searchByAll(città,zona,nome);
		/*if (nome.equals("")){
			if (zona.equals("")) {
				listMechanicBean = controlBook.searchByCity(città);
			} else {
				listMechanicBean = controlBook.searchByCityZone(città,zona);
			}
		} else {
			if (zona.equals("")) {
				listMechanicBean = controlBook.searchByCityName(città,nome);
			} else {
				listMechanicBean = controlBook.searchByAll(città,zona,nome);
			}
		}*/
		//System.out.println(listMechanicBean.get(0).getIndirizzo()); //TESTOK
		
		nome1.setText(listMechanicBean.get(0).getOfficina());
		indirizzo1.setText(listMechanicBean.get(0).getIndirizzo());
		sconto1.setText(String.valueOf(listMechanicBean.get(0).getPercSconto())+'%');
	}
}
