package logic.bean;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class VehicleBean {
	
	public VehicleBean (String username, String targa) {
		
		this.username = username;
		this.targaVehicle = targa;
	}
	
	public VehicleBean (String targa) {
		this.targaVehicle = targa;
	}
	
	public VehicleBean() {
		
	}
	
	String username;
	String targaVehicle;
	String marcaVehicle;
	String modelloVehicle;
	String cilindrataVehicle;
	String cavalliVehicle;
	Date scadAssicurazione = new Date();
	Date scadBollo = new Date();
	Date scadRevisione = new Date();
	Date scadTagliando = new Date();
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTargaVehicle() {
		return targaVehicle;
	}
	
	public void setTargaVehicle(String targaVehicle) {
		this.targaVehicle = targaVehicle;
	}
	
	public String getMarcaVehicle() {
		return marcaVehicle;
	}
	
	public void setMarcaVehicle(String marcaVehicle) {
		this.marcaVehicle = marcaVehicle;
	}
	
	public String getModelloVehicle() {
		return modelloVehicle;
	}
	
	public void setModelloVehicle(String modelloVehicle) {
		this.modelloVehicle = modelloVehicle;
	}
	
	public String getCilindrataVehicle() {
		return cilindrataVehicle;
	}
	
	public void setCilindrataVehicle(String cilindrataVehicle) {
		this.cilindrataVehicle = cilindrataVehicle;
	}
	
	public String getCavalliVehicle() {
		return cavalliVehicle;
	}
	
	public void setCavalliVehicle(String cavalliVehicle) {
		this.cavalliVehicle = cavalliVehicle;
	}
	
	public Date getScadAssicurazione() {
		return scadAssicurazione;
	}
	
	public void setScadAssicurazione(Date scadAssicurazione) {
		this.scadAssicurazione = scadAssicurazione;
	}
	
	public Date getScadBollo() {
		return scadBollo;
	}
	
	public void setScadBollo(Date scadBollo) {
		this.scadBollo = scadBollo;
	}
	
	public Date getScadRevisione() {
		return scadRevisione;
	}
	
	public void setScadRevisione(Date scadRevisione) {
		this.scadRevisione = scadRevisione;
	}
	
	public Date getScadTagliando() {
		return scadTagliando;
	}
	
	public void setScadTagliando(Date scadTagliando) {
		this.scadTagliando = scadTagliando;
	}
	
	public boolean checkDate(GregorianCalendar data) {
		//verifica dell'esistenza di una data
		data.setLenient(false);
		try {
			data.get(Calendar.DATE);
			return true;
		} catch (IllegalArgumentException e) {
			return false;}
	}
	
	public boolean checkLicensePlate(String license) {
		int i=0;
		int strlen = license.length();

		if(strlen==7){
			char[] letter= new char[strlen];
			for(i=0; i<strlen;i++)
				letter[i]=license.charAt(i);
			if(Character.isLetter(letter[0])&&Character.isLetter(letter[1])&&Character.isDigit(letter[2])&&Character.isDigit(letter[3])&&Character.isDigit(letter[4])&&Character.isLetter(letter[5])&&Character.isLetter(letter[6]))
				return true;
		}
		return false;
	}
	
}
