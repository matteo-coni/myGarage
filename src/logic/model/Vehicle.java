package logic.model;

import java.util.*;
import java.awt.*;

public class Vehicle {
	//*****ATTRIBUTI*****
	private String username;
	private String licensePlate;
	private String vehicleBrand;
	private String vehicleModel;
	private String vehicleDisplacement;
	private String vehiclePowertrains;
	private String vehicleFuel;
	private Date vehicleInsurance = new Date();
	private Date vehicleTax = new Date();
	private Date vehicleReview = new Date();
	private Date vehicleService = new Date();

	private Image img;
	
	
	//*****COSTRUTTORE****
	public Vehicle(String username, String targa, String marca, String modello, String cilindrata, String cavalli) {
		this.username = username;
		this.licensePlate = targa;
	
		this.vehicleBrand = marca;
		this.vehicleModel = modello;
		this.vehicleDisplacement = cilindrata;
		this.vehiclePowertrains = cavalli;
		
	}
	
	public Vehicle(String username, String targa) {
		this.username = username;
		this.licensePlate = targa;
	}
	
	public Vehicle(String targa) {
		this.licensePlate = targa;
	}
		
	//*****METODI*****	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	
	public String getVehicleModel() {
		return vehicleModel;
	}
	
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	
	public String getVehicleDisplacement() {
		return vehicleDisplacement;
	}
	
	public void setVehicleDisplacement(String vehicleDisplacement) {
		this.vehicleDisplacement = vehicleDisplacement;
	}
	
	public String getVehiclePowertrains() {
		return vehiclePowertrains;
	}
	
	public void setVehiclePowertrains(String vehiclePowertrains) {
		this.vehiclePowertrains = vehiclePowertrains;
	}
	
	public String getVehicleFuel() {
		return this.vehicleFuel;
	}
	
	public void setVehicleFuel(String vehicleFuel) {
		this.vehicleFuel = vehicleFuel;
	}
	
	public Date getVehicleInsurance() {
		return vehicleInsurance;
	}

	public void setVehicleInsurance(Date vehicleInsurance) {
		this.vehicleInsurance = vehicleInsurance;
	}

	public Date getVehicleTax() {
		return vehicleTax;
	}

	public void setVehicleTax(Date vehicleTax) {
		this.vehicleTax = vehicleTax;
	}

	public Date getVehicleReview() {
		return vehicleReview;
	}

	public void setVehicleReview(Date vehicleReview) {
		this.vehicleReview = vehicleReview;
	}

	public Date getVehicleService() {
		return vehicleService;
	}

	public void setVehicleService(Date vehicleService) {
		this.vehicleService = vehicleService;
	}

	public Image getImg() {
		return img;
	}
	
	public void setImg(Image img) {
		this.img = img;
	}
	
}
