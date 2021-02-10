package logic.view.desktop.controllerview;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import logic.bean.BookingBean;

import logic.control.ControllerViewBook;

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
	
	public void initialize() {
		
		List<BookingBean> listBookingBean = new ArrayList<>();
		ControllerViewBook controlViewBook = new ControllerViewBook();
		listBookingBean = controlViewBook.findBooking(ControllerMain.getInstance().getId());
		
		if(listBookingBean.isEmpty()) return;
		
		if(listBookingBean.size()==1) {
			nome1.setText(listBookingBean.get(0).getUsername());
			targa1.setText(listBookingBean.get(0).getVeicolo());
			
			DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy",Locale.ITALY);
			String data = sdf.format(listBookingBean.get(0).getDataPrenotazione());
			data1.setText(data);
		}
		
		if(listBookingBean.size()==2) {
			nome1.setText(listBookingBean.get(0).getUsername());
			targa1.setText(listBookingBean.get(0).getVeicolo());
			data1.setText(String.valueOf(listBookingBean.get(0).getDataPrenotazione()));
			
			nome2.setText(listBookingBean.get(1).getUsername());
			targa2.setText(listBookingBean.get(1).getVeicolo());
			data2.setText(String.valueOf(listBookingBean.get(1).getDataPrenotazione()));
		}
		
		if(listBookingBean.size()==3) {
			nome1.setText(listBookingBean.get(0).getUsername());
			targa1.setText(listBookingBean.get(0).getVeicolo());
			data1.setText(String.valueOf(listBookingBean.get(0).getDataPrenotazione()));
			
			nome2.setText(listBookingBean.get(1).getUsername());
			targa2.setText(listBookingBean.get(1).getVeicolo());
			data2.setText(String.valueOf(listBookingBean.get(1).getDataPrenotazione()));
			
			nome3.setText(listBookingBean.get(2).getUsername());
			targa3.setText(listBookingBean.get(2).getVeicolo());
			data3.setText(String.valueOf(listBookingBean.get(2).getDataPrenotazione()));
		}
	}
}
