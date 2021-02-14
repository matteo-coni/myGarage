package logic.view.desktop.controllerview;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import logic.bean.BookingBean;

import logic.control.ControllerViewBook;
import logic.view.desktop.factory.viewfactory.FactoryView;
import logic.view.desktop.factory.viewfactory.TypeView;
import logic.view.desktop.view.View;

public class ControllerGrafListBook {

	public ControllerGrafListBook() {
		//Costruttore
	}

	@FXML
	Button accetta1;
	@FXML
	Button accetta2;
	@FXML
	Button accetta3;
	@FXML
	Button declina1;
	@FXML
	Button declina2;
	@FXML
	Button declina3;
	@FXML
	TextField nome1;
	@FXML
	TextField nome2;
	@FXML
	TextField nome3;
	@FXML
	TextField data1;
	@FXML
	TextField data2;
	@FXML
	TextField data3;
	@FXML
	TextField targa1;
	@FXML
	TextField targa2;
	@FXML
	TextField targa3;
	@FXML
	TextArea problemi1;
	@FXML
	TextArea problemi2;
	@FXML
	TextArea problemi3;
	@FXML
	Rectangle redGreen1;
	@FXML
	Rectangle redGreen2;
	@FXML
	Rectangle redGreen3;
	@FXML
	ImageView listImage;
	@FXML
	ImageView insertImage;
	@FXML
	ImageView imageHome;
	@FXML
	ImageView	imageLogout;
	
	
	
	@FXML
	public void logout() throws IOException{
		
		FactoryView factory = FactoryView.getInstance();
		View viewLogout;
		viewLogout = factory.createView(TypeView.LOGIN); 
		
		ControllerMain.getInstance().replace(ControllerMain.getContainer(), viewLogout);	
	}
	
	@FXML
	public void confirm1() {
		String username = nome1.getText();
		String targa = targa1.getText();
		ControllerViewBook controlViewBook = new ControllerViewBook();
		controlViewBook.confirmBooking(username, ControllerMain.getInstance().getId(),targa,1); // 1 per la conferma, 0 declina
		//setta il colore come verde
		redGreen1.setFill(Color.GREEN);
	}
	
	@FXML
	public void confirm2() {
		String username = nome2.getText();
		String targa = targa2.getText();
		ControllerViewBook controlViewBook = new ControllerViewBook();
		controlViewBook.confirmBooking(username, ControllerMain.getInstance().getId(),targa,1); // 1 per la conferma, 0 declina
		//setta il colore come verde
		redGreen2.setFill(Color.GREEN);
	}
	@FXML
	public void confirm3() {
		String username = nome3.getText();
		String targa = targa3.getText();
		ControllerViewBook controlViewBook = new ControllerViewBook();
		controlViewBook.confirmBooking(username, ControllerMain.getInstance().getId(),targa,1); // 1 per la conferma, 0 declina
		//setta il colore come verde
		redGreen3.setFill(Color.GREEN);
	}
	
	@FXML
	public void decline1() {
		String usernamedecline = nome1.getText();
		String targadecline = targa1.getText();
		ControllerViewBook controlViewBook = new ControllerViewBook();
		controlViewBook.confirmBooking(usernamedecline, ControllerMain.getInstance().getId(),targadecline,0); // 1 per la conferma, 0 declina
		//setta il colore come verde
		redGreen1.setFill(Color.RED);
	}
	@FXML
	public void decline2() {
		String usernamedecline = nome2.getText();
		String targadecline = targa2.getText();
		ControllerViewBook controlViewBook = new ControllerViewBook();
		controlViewBook.confirmBooking(usernamedecline, ControllerMain.getInstance().getId(),targadecline,0); // 1 per la conferma, 0 declina
		//setta il colore come verde
		redGreen2.setFill(Color.RED);
	}
	@FXML
	public void decline3() {
		String usernameDecline = nome3.getText();
		String targaDecline = targa3.getText();
		ControllerViewBook controlViewBook = new ControllerViewBook();
		controlViewBook.confirmBooking(usernameDecline, ControllerMain.getInstance().getId(),targaDecline,0); // 1 per la conferma, 0 declina
		//setta il colore come verde
		redGreen3.setFill(Color.RED);
	}
	
	
	public void initialize() {
		
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy",Locale.ITALY);
		List<BookingBean> listBookingBean;
		ControllerViewBook controlViewBook = new ControllerViewBook();
		listBookingBean = controlViewBook.findBooking(ControllerMain.getInstance().getId());
		
		
		if(listBookingBean.isEmpty()) return;
		
		if(listBookingBean.size()==1) {
			nome1.setText(listBookingBean.get(0).getUsername());
			targa1.setText(listBookingBean.get(0).getVeicolo());
			problemi1.setText(listBookingBean.get(0).getProblemi());

			String data = sdf.format(listBookingBean.get(0).getDataPrenotazione());
			data1.setText(data);
		}
		
		if(listBookingBean.size()==2) {
			nome1.setText(listBookingBean.get(0).getUsername());
			targa1.setText(listBookingBean.get(0).getVeicolo());
			problemi1.setText(listBookingBean.get(0).getProblemi());
			String data = sdf.format(listBookingBean.get(0).getDataPrenotazione());
			data1.setText(data);
			
			nome2.setText(listBookingBean.get(1).getUsername());
			targa2.setText(listBookingBean.get(1).getVeicolo());
			problemi2.setText(listBookingBean.get(1).getProblemi());
			String datap2 = sdf.format(listBookingBean.get(1).getDataPrenotazione());
			data2.setText(datap2);
		}
		
		if(listBookingBean.size()==3) {
			nome1.setText(listBookingBean.get(0).getUsername());
			targa1.setText(listBookingBean.get(0).getVeicolo());
			problemi1.setText(listBookingBean.get(0).getProblemi());
			String datap1 = sdf.format(listBookingBean.get(0).getDataPrenotazione());
			data1.setText(datap1);
			
			nome2.setText(listBookingBean.get(1).getUsername());
			targa2.setText(listBookingBean.get(1).getVeicolo());
			problemi2.setText(listBookingBean.get(1).getProblemi());
			String datapick2 = sdf.format(listBookingBean.get(1).getDataPrenotazione());
			data2.setText(datapick2);
			
			nome3.setText(listBookingBean.get(2).getUsername());
			targa3.setText(listBookingBean.get(2).getVeicolo());
			problemi3.setText(listBookingBean.get(2).getProblemi());
			String datap3 = sdf.format(listBookingBean.get(2).getDataPrenotazione());
			data3.setText(datap3);
		}
	}
}
