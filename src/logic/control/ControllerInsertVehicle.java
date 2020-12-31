package logic.control;

import logic.model.Date;
import logic.model.Image;

public class ControllerInsertVehicleInfo {
	//*****PROVA SINGLETON*****
	private static ControllerInsertVehicleInfo INSTANCE = null;
	
	//*****COSTRUTTORE*****
	private ControllerInsertVehicleInfo() {} //"private" perché tramite getInstance() potrà essere chiamato solo dall'interno
	
	public static ControllerInsertVehicleInfo getInstance() {
		if(INSTANCE==null)
			INSTANCE=new ControllerInsertVehicleInfo();
		return INSTANCE;
	}
	//*****FINE SINGLETON*****
	
	//*****METODI*****
	public checkVehicle(String licensePlate) {
		
	}
	
	public saveVehicle(String licensePlate, String vehicleBrand, String vehicleModel, int vehicleDisplacement, int vehiclePowertrains, String vehicleFuel, Date vehicleInsurance, Date vehicleTax, Date vehicleReview, Date vehicleService, Image img){
		
	}
	/*
	public checkDeadline(Date vehicleInsurance) {
		
	}
	public checkDeadline(Date vehicleTax) {
		
	}
	public checkDeadline(Date vehicleReview) {
		
	}
	public checkDeadline(Date vehicleService) {
		
	}
	*/
}