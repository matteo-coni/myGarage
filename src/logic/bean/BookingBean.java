package logic.bean;

import java.util.Date;

public class BookingBean {
	
	private String nomeOfficina;
	private String username;
	private String veicolo;
	private Date dataPrenotazione;// = new Date();
	private Boolean confermaPren;
	private String problemi;
	
	//COSTRUTTORI
	public BookingBean () {
		
	}
	
	public BookingBean(String username, String nomeOfficina, String problemi, Date dataPrenotazione, Boolean confermaPren, String veicolo) {
		
		this.username = username;
		this.nomeOfficina = nomeOfficina;
		this.problemi = problemi;
		this.dataPrenotazione = dataPrenotazione;
		this.confermaPren = confermaPren;
		this.veicolo = veicolo;
	}
	
	
	//METODI
	public String getNomeOfficina() {
		return nomeOfficina;
	}
	public void setNomeOfficina(String nomeOfficina) {
		this.nomeOfficina = nomeOfficina;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getVeicolo() {
		return veicolo;
	}
	public void setVeicolo(String veicolo) {
		this.veicolo = veicolo;
	}
	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}
	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	public Boolean getConfermaPren() {
		return confermaPren;
	}
	public void setConfermaPren(Boolean confermaPren) {
		this.confermaPren = confermaPren;
	}
	public String getProblemi() {
		return problemi;
	}
	public void setProblemi(String problemi) {
		this.problemi = problemi;
	}
	
}
