package logic.bean;

public class VehicleBean {
	
	public VehicleBean (String username, String targa) {
		
		this.Username = username;
		this.targaVehicle = targa;
	}
	
	public VehicleBean (String targa) {
		this.targaVehicle = targa;
	}
	
	String Username;
	private String targaVehicle;
	String marcaVehicle;
	String modelloVehicle;
	String cilindrataVehicle;
	String cavalliVehicle;
	String scadAssicurazione;
	String scadBollo;
	String scadRevisione;
	String scadTagliando;
	
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
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
	
	public String getScadAssicurazione() {
		return scadAssicurazione;
	}
	
	public void setScadAssicurazione(String scadAssicurazione) {
		this.scadAssicurazione = scadAssicurazione;
	}
	
	public String getScadBollo() {
		return scadBollo;
	}
	
	public void setScadBollo(String scadBollo) {
		this.scadBollo = scadBollo;
	}
	
	public String getScadRevisione() {
		return scadRevisione;
	}
	
	public void setScadRevisione(String scadRevisione) {
		this.scadRevisione = scadRevisione;
	}
	
	public String getScadTagliando() {
		return scadTagliando;
	}
	
	public void setScadTagliando(String scadTagliando) {
		this.scadTagliando = scadTagliando;
	}

}
