package logic.view.desktop.controllerview;

import logic.view.desktop.view.View;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.control.ControllerBookAppointment;
import logic.control.ControllerViewVehicle;
import logic.exception.EmptyDatePickException;
import logic.bean.MechanicBean;
import logic.bean.BookingBean;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.*;

public class ControllerGrafBookMech {
	
	private static String nondefinito = "Non definito";
	private static String inseriredata = "Inserire data";
	private static String dataerrata = "Data errata";
	
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
	TextArea txtProblem1;
	@FXML
	TextArea txtProblem2;
	@FXML
	TextArea txtProblem3;
	@FXML
	TextField nomeCerca;
	@FXML
	TextField zonaCerca;
	@FXML
	TextField cittaCerca;
	@FXML
	Text errorText;
	@FXML
	ComboBox<String> selectVehicle;
	@FXML
	ImageView imageLogout;
	
	
	@FXML
	public void back() throws IOException{
		FactoryView factory = FactoryView.getInstance();
		View view;
		view = factory.createView(TypeView.HOMEPAGE); 
		
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
		
	}
	
	@FXML
	public void logOut() throws IOException{
		FactoryView factory = FactoryView.getInstance();
		View viewLogOut;
		viewLogOut = factory.createView(TypeView.LOGIN); 
		
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), viewLogOut);
		
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
	
	@FXML
	public void confirmBooking1() {
		
		try{
			
			BookingBean bookingBean = new BookingBean();

			LocalDate datap1 = datePick1.getValue();
			
			Instant instant = Instant.from(datap1.atStartOfDay(ZoneId.systemDefault()));
			Date date1 = Date.from(instant);
			
			bookingBean.setUsername(ControllerMain.getInstance().getId());
			bookingBean.setNomeOfficina(nome1.getText());
			bookingBean.setDataPrenotazione(date1);
			bookingBean.setProblemi(txtProblem1.getText());
			
			
			if(selectVehicle.getValue() != null) {
				bookingBean.setVeicolo(selectVehicle.getValue());
			} else {
				bookingBean.setVeicolo(nondefinito);
			}
			
			ControllerBookAppointment controlBook = new ControllerBookAppointment();
			controlBook.saveBooking(bookingBean);
		
		} catch(EmptyDatePickException emptyDatePick1) {
			errorText.setText(inseriredata);
			
		} catch(NullPointerException ne) {
			errorText.setText(dataerrata);
		}
		
		
	
		
	}
	@FXML
	public void confirmBooking2() {
		
		try {
			BookingBean bookingBean = new BookingBean();
			
			LocalDate datap2 = datePick2.getValue();
			Instant instant = Instant.from(datap2.atStartOfDay(ZoneId.systemDefault()));
			Date date2 = Date.from(instant);
			
			bookingBean.setUsername(ControllerMain.getInstance().getId());
			bookingBean.setNomeOfficina(nome2.getText());
			bookingBean.setDataPrenotazione(date2);
			bookingBean.setProblemi(txtProblem2.getText());
			
			
			if(selectVehicle.getValue() != null) {
				bookingBean.setVeicolo(selectVehicle.getValue());
			} else {
				bookingBean.setVeicolo(nondefinito);
			}
			
			ControllerBookAppointment controlBook = new ControllerBookAppointment();
			controlBook.saveBooking(bookingBean);
		
		} catch(EmptyDatePickException emptyDatePick2) {
			errorText.setText(inseriredata);
		
		} catch(NullPointerException npe) {
			errorText.setText(dataerrata);
		}
		
		
	
		
	}
	@FXML
	public void confirmBooking3() {
		
		try{
			
			BookingBean bookingBean = new BookingBean();
		
			LocalDate datap3 = datePick3.getValue();
			
			Instant instant = Instant.from(datap3.atStartOfDay(ZoneId.systemDefault()));
			Date date3 = Date.from(instant);
			
			bookingBean.setUsername(ControllerMain.getInstance().getId());
			bookingBean.setNomeOfficina(nome3.getText());
			bookingBean.setDataPrenotazione(date3);
			bookingBean.setProblemi(txtProblem3.getText());
			
			
			if(selectVehicle.getValue() != null) {
				bookingBean.setVeicolo(selectVehicle.getValue());
			} else {
				bookingBean.setVeicolo(nondefinito);
			}
			
			ControllerBookAppointment controlBook = new ControllerBookAppointment();
			controlBook.saveBooking(bookingBean);
	
		} catch(EmptyDatePickException emptyDatePick3) {
			
			errorText.setText(inseriredata);
		
		} catch(NullPointerException np) {
			errorText.setText(dataerrata);
	}
		
	
		
	}
	
	@FXML
	public void findMechanic() {
		
		String nome = nomeCerca.getText();
		String zona = zonaCerca.getText();
		String citta = cittaCerca.getText();
		
		ControllerBookAppointment controlBook = new ControllerBookAppointment();
		List<MechanicBean> listMechanicBean;
		
		if (citta.equals("")){
			//Scrivere di dover inserire la città obbligatoriamente
			errorText.setText("Inserire la città");
			errorText.setFill(Color.RED);
			return;
		}
		
		listMechanicBean = controlBook.searchByAll(citta,zona,nome);
		
		if(listMechanicBean.isEmpty()) return;
		
		if(listMechanicBean.size()==1) {
			nome1.setText(listMechanicBean.get(0).getOfficina());
			indirizzo1.setText(listMechanicBean.get(0).getIndirizzo());
			sconto1.setText(String.valueOf(listMechanicBean.get(0).getPercSconto())+'%');
			nome2.setText("");
			indirizzo2.setText("");
			sconto2.setText("");
			nome3.setText("");
			indirizzo3.setText("");
			sconto3.setText("");
		}
		
		if(listMechanicBean.size()==2) {
			nome1.setText(listMechanicBean.get(0).getOfficina());
			indirizzo1.setText(listMechanicBean.get(0).getIndirizzo());
			sconto1.setText(String.valueOf(listMechanicBean.get(0).getPercSconto())+'%');
			
			indirizzo2.setText(listMechanicBean.get(1).getIndirizzo());
			nome2.setText(listMechanicBean.get(1).getOfficina());
			sconto2.setText(String.valueOf(listMechanicBean.get(1).getPercSconto())+'%');
			
			sconto3.setText("");
			nome3.setText("");
			indirizzo3.setText("");
			
		}
		
		if(listMechanicBean.size()==3) {
			nome1.setText(listMechanicBean.get(0).getOfficina());
			indirizzo1.setText(listMechanicBean.get(0).getIndirizzo());
			sconto1.setText(String.valueOf(listMechanicBean.get(0).getPercSconto())+'%');
			
			nome2.setText(listMechanicBean.get(1).getOfficina());
			indirizzo2.setText(listMechanicBean.get(1).getIndirizzo());
			sconto2.setText(String.valueOf(listMechanicBean.get(1).getPercSconto())+'%');
			
			nome3.setText(listMechanicBean.get(2).getOfficina());
			indirizzo3.setText(listMechanicBean.get(2).getIndirizzo());
			sconto3.setText(String.valueOf(listMechanicBean.get(2).getPercSconto())+'%');
		}
		
	}

	public void initialize() {
		
		String username = ControllerMain.getInstance().getId();
		
		
		
		ControllerViewVehicle controlViewVehicle = new ControllerViewVehicle();
		List<String> targheVeicoli = controlViewVehicle.viewVehicle(username); 
		
		for(String targa: targheVeicoli) { //Clico for per aggiungere le targhe al "combobox" (Solo targhe legate all'username)
						
			
			selectVehicle.getItems().addAll(
					targa);
						
		}
		
	}
	
}
