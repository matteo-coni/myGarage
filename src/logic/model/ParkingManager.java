package logic.model;

public class ParkingManager {
	//*****ATTRIBUTI*****
	private String name;
	private String surname;
	private boolean availableLot;
	private Parking parking;
	
	//*****COSTRUTTORE*****
	public ParkingManager(String name, String surname, boolean availableLot, Parking parking) {
		this.name = name;
		this.surname = surname;
		this.availableLot = availableLot;
		this.parking = parking;
	}
	
	//*****METODI*****
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean isAvailableLot() {
		return availableLot;
	}

	public void setAvailableLot(boolean availableLot) {
		this.availableLot = availableLot;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}
	
	
	
}
