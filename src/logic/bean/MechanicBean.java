package logic.bean;

public class MechanicBean {
	
	//Attributi
	private String nome;
	private String officina;
	private String citta;
	private String zona;
	private String indirizzo;
	private int percSconto;
	
	public MechanicBean() {  //Costruttore default
		
	}
	
	public MechanicBean(String nome, String officina, String citta, String zona, String indirizzo, int percSconto) {
		this.nome = nome;
		this.officina = officina;
		this.citta = citta;
		this.zona = zona;
		this.indirizzo = indirizzo;
		this.percSconto = percSconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOfficina() {
		return officina;
	}

	public void setOfficina(String officina) {
		this.officina = officina;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getPercSconto() {
		return percSconto;
	}

	public void setPercSconto(int percSconto) {
		this.percSconto = percSconto;
	}
	
	
	

}
