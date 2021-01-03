package logic.control;

//import logic.model.Date;
//import logic.model.Image;
import java.util.*;
import logic.model.Vehicle;
import java.awt.*;

public class ControllerInsertVehicleInfo {
	//*****PROVA SINGLETON*****
	private static ControllerInsertVehicleInfo INSTANCE = null;
	
	//*****COSTRUTTORE*****
	private ControllerInsertVehicleInfo() {} //"private" perch� tramite getInstance() potr� essere chiamato solo dall'interno
	
	public static ControllerInsertVehicleInfo getInstance() {
		if(INSTANCE==null)
			INSTANCE=new ControllerInsertVehicleInfo();
		return INSTANCE;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****
	public void checkVehicle(String licensePlate) {
		
	}
	
	//public void saveVehicle(String licensePlate, String vehicleBrand, String vehicleModel, int vehicleDisplacement, int vehiclePowertrains, String vehicleFuel, Date vehicleInsurance, Date vehicleTax, Date vehicleReview, Date vehicleService, Image img){
	public void saveVehicle(Vehicle vehicle) {
		
	}
	/*
	public void checkDeadline(Date vehicleInsurance) {
		
	}
	public void checkDeadline(Date vehicleTax) {
		
	}
	public void checkDeadline(Date vehicleReview) {
		
	}
	public void checkDeadline(Date vehicleService) {
		
	}
	*/
}