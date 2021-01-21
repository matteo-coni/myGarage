package logic.model;

public class User {
	//*****ATTRIBUTI*****
	protected String name;
	protected String surname;
	protected String accountID;
	private Vehicle vehicle;
	
	//*****COSTRUTTORE*****
	public User(String name, String surname, String accountID, Vehicle vehicle) {
		super();
		this.name = name;
		this.surname = surname;
		this.accountID = accountID;
		this.vehicle = vehicle;
	}
		
	public User(String username) {
		this.name = username;
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

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
