package logic.model;

public class ParkingSpace {
	//*****ATTRIBUTI*****
	private String parkingName;
	private String parkingAddress;
	private int parkingLotNumber;
	
	//*****COSTRUTTORE*****
	public ParkingSpace(String parkingName, String parkingAddress, int parkingLotNumber) {
		super();
		this.parkingName = parkingName;
		this.parkingAddress = parkingAddress;
		this.parkingLotNumber = parkingLotNumber;
	}
	
	//*****METODI*****
	public String getParkingName() {
		return parkingName;
	}

	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

	public String getParkingAddress() {
		return parkingAddress;
	}

	public void setParkingAddress(String parkingAddress) {
		this.parkingAddress = parkingAddress;
	}

	public int getParkingLotNumber() {
		return parkingLotNumber;
	}

	public void setParkingLotNumber(int parkingLotNumber) {
		this.parkingLotNumber = parkingLotNumber;
	}
}
