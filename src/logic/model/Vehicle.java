package logic.model;

import java.util.*;
import java.awt.*;

public class Vehicle {
	//*****ATTRIBUTI*****
	private String username;
	private String licensePlate;
	private String vehicleBrand;
	private String vehicleModel;
	private int vehicleDisplacement;
	private int vehiclePowertrains;
	private String vehicleFuel;
	private GregorianCalendar vehicleInsurance = new GregorianCalendar();
	private GregorianCalendar vehicleTax = new GregorianCalendar();
	private GregorianCalendar vehicleReview = new GregorianCalendar();
	private GregorianCalendar vehicleService = new GregorianCalendar();
	private Deadlines deadlines;
	private Image img;
	
	//*****COSTRUTTORE*****
	public Vehicle(String licensPlate, String vehicleBrand, String vehicleModel, int vehicleDisplacement, int vehiclePowertrains, String vehicleFuel, Deadlines deadlines, /*Date vehicleInsurance, Date vehicleTax, Date vehicleReview, Date vehicleService,*/ Image img) {
		
		this.licensePlate = licensPlate;
		this.vehicleBrand = vehicleBrand;
		this.vehicleModel = vehicleModel;
		this.vehicleDisplacement = vehicleDisplacement;
		this.vehiclePowertrains = vehiclePowertrains;
		this.vehicleFuel = vehicleFuel;
		this.deadlines = deadlines;
		this.vehicleInsurance = vehicleInsurance;
		this.vehicleTax = vehicleTax;
		this.vehicleReview = vehicleReview;
		this.vehicleService = vehicleService;
		this.img = img;
	}
	
	public Vehicle(String username, String targa, String marca, String modello) {
		
	}
	
	public Vehicle(String username, String targa) {
		this.username = username;
		this.licensePlate = targa;
	}
		
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
		return this.vehicleFuel;
	}
	
	public void setVehicleFuel(String vehicleFuel) {
		this.vehicleFuel = vehicleFuel;
	}
	
	public GregorianCalendar getVehicleInsurance() {
		return vehicleInsurance;
	}

	public void setVehicleInsurance(GregorianCalendar vehicleInsurance) {
		this.vehicleInsurance = vehicleInsurance;
	}

	public GregorianCalendar getVehicleTax() {
		return vehicleTax;
	}

	public void setVehicleTax(GregorianCalendar vehicleTax) {
		this.vehicleTax = vehicleTax;
	}

	public GregorianCalendar getVehicleReview() {
		return vehicleReview;
	}

	public void setVehicleReview(GregorianCalendar vehicleReview) {
		this.vehicleReview = vehicleReview;
	}

	public GregorianCalendar getVehicleService() {
		return vehicleService;
	}

	public void setVehicleService(GregorianCalendar vehicleService) {
		this.vehicleService = vehicleService;
	}

	public Image getImg() {
		return img;
	}
	
	public void setImg(Image img) {
		this.img = img;
	}
	
	//metodo per il controllo della data???
	/*
	 * boolean result;
		GregorianCalendar cal = new GregorianCalendar (29, 2, 2007);
		cal.setLenient (false);

		try {
			cal.get (Calendar.DATE);
			result=true;
		} catch (IllegalArgumentException e) {
			result=false;}
	 */
}
