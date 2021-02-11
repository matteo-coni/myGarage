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
		boolean result=false;
		int anno = Calendar.YEAR;
		int mese= Calendar.MONTH;
		GregorianCalendar dataAttuale = new GregorianCalendar();
		int annoAttuale = dataAttuale.get(anno);
		int meseAttuale = dataAttuale.get(mese)+1;
		
		int annoDeadline = deadline.get(anno);
		int meseDeadline = deadline.get(mese);
		
		if(annoAttuale == annoDeadline && meseAttuale == (meseDeadline-1))
			result= true;
		
		return result;
		
	}
	
}