package logic.model;

public class Owner extends User{
	//*****ATTRIBUTI*****
	protected String univoqueCode;
	
	//*****COSTRUTTORE*****
	public Owner(String name, String surname, String accountID, Vehicle vehicle, String univoqueCode) {
		super(name, surname, accountID, vehicle);
		this.univoqueCode = univoqueCode;
	}
	
	//*****METODI*****
	public String getUnivoqueCode() {
		return univoqueCode;
	}

	public void setUnivoqueCode(String univoqueCode) {
		this.univoqueCode = univoqueCode;
	}
}
