package logic.model;

public class Mechanic {
	//*****ATTRIBUTI*****
	private String name;
	private String garage;
	private String address;
	private String zone;
	private String city;
	private int percSconto;
	
	//*****COSTRUTTORE*****
	public Mechanic() {
		
	}
	
	public Mechanic(String name, String garage, String city,  String zone, String address, int percSconto) {
		this.name = name;
		this.garage = garage;
		this.address = address;
		this.zone = zone;
		this.city = city;
		this.percSconto=percSconto;
	}
	
	//*****METODI*****
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGarage() {
		return garage;
	}
	public void setGarage(String garage) {
		this.garage = garage;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPercSconto() {
		return percSconto;
	}
	public void setPercSconto(int percSconto) {
		this.percSconto = percSconto;
	}
	
}
