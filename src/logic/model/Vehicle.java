package logic.model;

import java.util.*;

public class Vehicle {
	//*****ATTRIBUTI*****
	private String licensePlate;
	private String vehicleBrand;
	private String vehicleModel;
	private int vehicleDisplacement;
	private int vehiclePowertrains;
	private String vehicleFuel;
	Date vehicleInsurance = new Date();
	Date vehicleTax = new Date();
	Date vehicleReview = new Date();
	Date vehicleService = new Date();
	private Image img;
	
	//*****METODI*****
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
	public int getVehicleDisplacement() {
		return vehicleDisplacement;
	}
	public void setVehicleDisplacement(int vehicleDisplacement) {
		this.vehicleDisplacement = vehicleDisplacement;
	}
	public int getVehiclePowertrains() {
		return vehiclePowertrains;
	}
	public void setVehiclePowertrains(int vehiclePowertrains) {
		this.vehiclePowertrains = vehiclePowertrains;
	}
	public String getVehicleFuel() {
		return vehicleFuel;
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
	
	//prova
}
