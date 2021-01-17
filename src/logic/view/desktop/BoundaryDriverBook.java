package logic.view.desktop;

import java.util.*;
import javafx.scene.control.TextField;
import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;

import logic.model.Vehicle;

public class BoundaryDriverBook {
	
	private void setAddress(String address) {
		
	}
	
	private void setArea(String area) {
		
	}
	
	private void setCity(String city) {
		
	}
	
	private void setDate(Date dateBook) {
		//da mettere nel bean per prelevare da data durante l'nserimento
		TextField txt = new TextField();
		Date d = null;
		//si procura la data sotto forma di una stringa nel formato SHORT
	    System.out.println("Inserisci la data [gg/mm/yyyy]: ");
	    String s = txt.getText();
	    //converte la stringa della data in un oggetto di classe Date
	    try{
	    	DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
	    	//imposta che i calcoli di conversione della data siano rigorosi       
	    	formatoData.setLenient(false);
	    	d = formatoData.parse(s);
	    } catch (ParseException e) {
	    	System.out.println("Formato data non valido.");
	    }
	    //visualizza la data non formattata (sfruttando implicitamente il metodo toString dell'oggetto)
	    System.out.println(d);
	    //da rivedere in che formato stampa la data
	}
	
	private void setProblems(String problems) {
		
	}
	
	private void setVehicle(Vehicle selVehicle) {
		
	}
	
}
