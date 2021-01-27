package logic.control;

import javafx.fxml.*;

import java.util.*;
import logic.model.Vehicle;
import java.awt.*;
import logic.bean.*;
import logic.model.DAO.*;

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
	
	/*public void saveVehicle(String licensePlate, String vehicleBrand, String vehicleModel, int vehicleDisplacement, int vehiclePowertrains, String vehicleFuel, Date vehicleInsurance, Date vehicleTax, Date vehicleReview, Date vehicleService, Image img){
	
	}*/
	
	public boolean saveVehicle(VehicleBean vehicleBean) {
		
		try {
		VehicleDAO vehicledao = new VehicleDAO();
		vehicledao.saveVehicle(vehicleBean.getUsername(), vehicleBean.getTargaVehicle(), vehicleBean.getMarcaVehicle(), vehicleBean.getModelloVehicle(), vehicleBean.getCilindrataVehicle(), vehicleBean.getCavalliVehicle(), vehicleBean.getScadAssicurazione(), vehicleBean.getScadBollo(), vehicleBean.getScadRevisione(), vehicleBean.getScadTagliando());
		return true;
		
		} catch (Exception e){
			return false;
		}
		
	}
	
	public void checkDeadlineInsurance(GregorianCalendar vehicleInsurance) {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH)+1;
		
		int annoDeadline = vehicleInsurance.get(GregorianCalendar.YEAR);
		int meseDeadline = vehicleInsurance.get(GregorianCalendar.MONTH);
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline);
			//boolean result=true;
			System.out.println("ricordati di controllare l'assicurazione!");
	}
	
	public void checkDeadlineTax(GregorianCalendar vehicleTax) {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH)+1;
		
		int annoDeadline = vehicleTax.get(GregorianCalendar.YEAR);
		int meseDeadline = vehicleTax.get(GregorianCalendar.MONTH);
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline);
			System.out.println("ricordati di controllare il bollo!");

	}
	
	public void checkDeadlineReview(GregorianCalendar vehicleReview) {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH)+1;
		
		int annoDeadline = vehicleReview.get(GregorianCalendar.YEAR);
		int meseDeadline = vehicleReview.get(GregorianCalendar.MONTH);
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline);
			System.out.println("ricordati di controllare la revisione!");
	}
	
	public void checkDeadlineService(GregorianCalendar vehicleService) {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH)+1;
		
		int annoDeadline = vehicleService.get(GregorianCalendar.YEAR);
		int meseDeadline = vehicleService.get(GregorianCalendar.MONTH);
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline);
			System.out.println("ricordati di controllare i servizi??!");
	}
	
}