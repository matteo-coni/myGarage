package logic.control;



import java.util.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import logic.bean.*;
import logic.model.dao.*;



public class ControllerInsertVehicleInfo {
	
	public ControllerInsertVehicleInfo() {
		//Costruttore
	}
	
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
	
	public boolean checkDeadline(GregorianCalendar deadline) {
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(GregorianCalendar.YEAR);
		int meseAttuale = dataAttuale.get(GregorianCalendar.MONTH)+1;
		
		int annoDeadline = deadline.get(GregorianCalendar.YEAR);
		int meseDeadline = deadline.get(GregorianCalendar.MONTH);
		
		if(annoAttuale == annoDeadline && meseAttuale == meseDeadline)
			return true;
		else
			return false;
	}
	
	public void checkAssicurazione (Date dateAssic) {
		
		//vehicleBean.getScadAssicurazione().compareTo(vehicleBean.getScadBollo());
		//USARE IL .compareTo--- data1 > data2 --> ris > 0
		
	}
	
}