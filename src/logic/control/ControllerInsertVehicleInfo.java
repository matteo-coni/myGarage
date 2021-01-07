package logic.control;

import javafx.fxml.*;
import java.util.*;
import logic.model.Vehicle;
import java.awt.*;

public class ControllerInsertVehicleInfo {
	//*****PROVA SINGLETON*****
	private static ControllerInsertVehicleInfo istance = null;
	
	//*****COSTRUTTORE*****
	private ControllerInsertVehicleInfo() {} //"private" perch� tramite getInstance() potr� essere chiamato solo dall'interno
	
	public static ControllerInsertVehicleInfo getInstance() {
		if(istance == null)
			istance = new ControllerInsertVehicleInfo();
		return istance;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****
	public void checkVehicle(String licensePlate) {
		System.out.println(licensePlate);
		/*
		 * if(licensePlate== **query su DAO per licensePlate in DB**)
		 * 	return false;
		 * else
		 * 	return true;
		*/
	}
	
	public void saveVehicle(String licensePlate, String vehicleBrand, String vehicleModel, int vehicleDisplacement, int vehiclePowertrains, String vehicleFuel, Date vehicleInsurance, Date vehicleTax, Date vehicleReview, Date vehicleService, Image img){
	
	}
	/*
	public void checkDeadline(Date vehicleInsurance) {
		if(**data odierna**==(vehicleInsurance - 3 settimane))
			return **banner "ricordati di controllare l'assicurazione"**;
	}
	public void checkDeadline(Date vehicleTax) {
		if(**data odierna**==(vehicleTax - 3 settimane))
			return **banner "ricordati di controllare il bollo"**;
	}
	public void checkDeadline(Date vehicleReview) {
		if(**data odierna**==(vehicleReview - 3 settimane))
			return **banner "ricordati di controllare la revisione"**;
	}
	public void checkDeadline(Date vehicleService) {
		if(**data odierna**==(vehicleService - 3 settimane))
			return **banner "ricordati di controllare i servizi??"**;
	}
	*/
}