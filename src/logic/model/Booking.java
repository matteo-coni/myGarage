package logic.model;

import java.util.*;

public class Booking {
	//*****ATTRIBUTI*****
	private String bookID;
	private Date dateBook = new Date();
	private Mechanic infoMech;
	private String problems;
	private Vehicle selVehicle;
	private Boolean bookingConfirm;
	
	//*****COSTRUTTORE*****
	public Booking (String bookID, Date dateBook, Mechanic infoMech, String problems, Vehicle selVehicle, boolean bookingConfirm) {
		this.bookID = bookID;
		this.dateBook = dateBook;
		this.infoMech = infoMech;
		this.problems = problems;
		this.selVehicle = selVehicle;
		this.bookingConfirm = bookingConfirm;	
	}
	
	//*****METODI*****
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public Date getDateBook() {
		return dateBook;
	}
	public void setDateBook(Date dateBook) {
		this.dateBook = dateBook;
	}
	public Mechanic getInfoMech() {
		return infoMech;
	}
	public void setInfoMech(Mechanic infoMech) {
		this.infoMech = infoMech;
	}
	public String getProblems() {
		return problems;
	}
	public void setProblems(String problems) {
		this.problems = problems;
	}
	public Vehicle getSelVehicle() {
		return selVehicle;
	}
	public void setSelVehicle(Vehicle selVehicle) {
		this.selVehicle = selVehicle;
	}
	public Boolean getBookingConfirm() {
		return bookingConfirm;
	}
	public void setBookingConfirm(Boolean bookingConfirm) {
		this.bookingConfirm = bookingConfirm;
	}
}
