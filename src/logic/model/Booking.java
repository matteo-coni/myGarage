package logic.model;

import java.util.*;

public class Booking {
	//*****ATTRIBUTI*****
	
	private Date dateBook = new Date();
	private String nameGarage; 
	private String problems;
	private String selVehicle;
	private Boolean bookingConfirm;
	private String username;
	
	//*****COSTRUTTORE*****
	public Booking (String username, String nameGarage, String problems, Date dateBook, boolean bookingConfirm, String selVehicle) {
		
		this.dateBook = dateBook;
		this.nameGarage = nameGarage;
		this.problems = problems;
		this.dateBook = dateBook;
		this.bookingConfirm = bookingConfirm;	
		this.selVehicle = selVehicle;
	}
	
	public Booking() {
		
	}
	
	
	//*****METODI*****
	public Date getDateBook() {
		return dateBook;
	}

	public void setDateBook(Date dateBook) {
		this.dateBook = dateBook;
	}

	public String getNameGarage() {
		return nameGarage;
	}

	public void setNameGarage(String nameGarage) {
		this.nameGarage = nameGarage;
	}

	public String getProblems() {
		return problems;
	}

	public void setProblems(String problems) {
		this.problems = problems;
	}

	public String getSelVehicle() {
		return selVehicle;
	}

	public void setSelVehicle(String selVehicle) {
		this.selVehicle = selVehicle;
	}

	public Boolean getBookingConfirm() {
		return bookingConfirm;
	}

	public void setBookingConfirm(Boolean bookingConfirm) {
		this.bookingConfirm = bookingConfirm;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
