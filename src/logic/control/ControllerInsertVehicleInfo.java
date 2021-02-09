package logic.control;



import java.util.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import logic.bean.*;
import logic.model.dao.*;



public class ControllerInsertVehicleInfo {
	//*****PROVA SINGLETON*****
	//private static ControllerInsertVehicleInfo istance = null;
	
	//*****COSTRUTTORE*****
	public ControllerInsertVehicleInfo() {} //"private" perch� tramite getInstance() potr� essere chiamato solo dall'interno
	
	/*public static ControllerInsertVehicleInfo getInstance() {
		if(istance == null)
			istance = new ControllerInsertVehicleInfo();
		return istance;
	}*/
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
		
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ITALY);
		String ass = sdf.format(vehicleBean.getScadAssicurazione());
		String rev = sdf.format(vehicleBean.getScadRevisione());
		String bollo = sdf.format(vehicleBean.getScadBollo());
		String tagl = sdf.format(vehicleBean.getScadTagliando());
		
		
		vehicledao.saveVehicle(vehicleBean.getUsername(), vehicleBean.getTargaVehicle(), vehicleBean.getMarcaVehicle(), vehicleBean.getModelloVehicle(), vehicleBean.getCilindrataVehicle(), vehicleBean.getCavalliVehicle(), ass, bollo, rev, tagl);
		return true;
		
		} catch (Exception e){
			return false;
		}
		
	}
	
	public boolean checkDeadlineInsurance(GregorianCalendar vehicleInsurance) {
		boolean result;
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH)+1;
		
		int annoDeadline = vehicleInsurance.get(GregorianCalendar.YEAR);
		int meseDeadline = vehicleInsurance.get(GregorianCalendar.MONTH);
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline);{
			System.out.println("ricordati di controllare l'assicurazione!");
			return result=true;}
	}
	
	public void checkAssicurazione (Date dateAssic) {
		
		//vehicleBean.getScadAssicurazione().compareTo(vehicleBean.getScadBollo());
		//USARE IL .compareTo--- data1 > data2 --> ris > 0
		
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