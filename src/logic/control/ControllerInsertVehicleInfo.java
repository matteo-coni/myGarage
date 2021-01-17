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
		/*
		 * if(licensePlate== **query su DAO per licensePlate in DB**)
		 * 	return false;
		 * else
		 * 	return true;
		*/
	}
	
	public void saveVehicle(String licensePlate, String vehicleBrand, String vehicleModel, int vehicleDisplacement, int vehiclePowertrains, String vehicleFuel, Date vehicleInsurance, Date vehicleTax, Date vehicleReview, Date vehicleService, Image img){
	
	}
	
	public void checkDeadlineInsurance(Date vehicleInsurance) {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH);
		
		int annoDeadline = vehicleInsurance.get(GregorianCalendar.YEAR);
		int meseDeadline = vehicleInsurance.get(GregorianCalendar.MONTH)-1;
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline);
			System.out.println("ricordati di controllare l'assicurazione!");
	}
	
	public void checkDeadlineTax(Date vehicleTax) {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH);
		
		int annoDeadline = vehicleTax.get(GregorianCalendar.YEAR);
		int meseDeadline = vehicleTax.get(GregorianCalendar.MONTH)-1;
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline);
			System.out.println("ricordati di controllare il bollo!");

	}
	
	public void checkDeadlineReview(Date vehicleReview) {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH);
		
		int annoDeadline = vehicleReview.get(GregorianCalendar.YEAR);
		int meseDeadline = vehicleReview.get(GregorianCalendar.MONTH)-1;
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline);
			System.out.println("ricordati di controllare la revisione!");
	}
	
	public void checkDeadlineService(Date vehicleService) {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH);
		
		int annoDeadline = vehicleService.get(GregorianCalendar.YEAR);
		int meseDeadline = vehicleService.get(GregorianCalendar.MONTH)-1;
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline);
			System.out.println("ricordati di controllare i servizi??!");
	}
	
}