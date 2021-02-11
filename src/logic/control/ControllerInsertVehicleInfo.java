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
		
		if(annoAttuale == annoDeadline && meseAttuale == (meseDeadline-1))
			return true;
		return false;
	}
	
}