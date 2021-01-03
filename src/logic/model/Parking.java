package logic.model;

public class Parking {
	
	//***ATTRIBUTI****	
	private String parkingName;
	private int availableSlot;
	private String address;
	private String city;
	private String zone;
	
	//****Costruttore***
	public Parking (String parkingName, int availableSlot, String address, String city, String zone) {
		this.parkingName = parkingName;
		this.availableSlot = availableSlot;
		this.address = address;
		this.city = city;
		this.zone = zone;
	}

	public String getParkingName() {
		return parkingName;
	}

	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

	public int getAvailableSlot() {
		return availableSlot;
	}

	public void setAvailableSlot(int availableSlot) {
		this.availableSlot = availableSlot;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	


}
