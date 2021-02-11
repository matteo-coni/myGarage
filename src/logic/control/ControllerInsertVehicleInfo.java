package logic.control;

import java.util.*;

import logic.bean.*;
import logic.exception.DuplicatedVehicleException;
import logic.exception.EmptyLicensePlateFieldException;
import logic.model.Vehicle;
import logic.model.dao.*;

public class ControllerInsertVehicleInfo {
	
	public ControllerInsertVehicleInfo() {
		//Costruttore
	}
	
	public boolean saveVehicle(VehicleBean vehicleBean) throws EmptyLicensePlateFieldException, DuplicatedVehicleException{
		boolean result=false;
		try {
		VehicleDAO vehicledao = new VehicleDAO();
		Vehicle vehicle = new Vehicle(vehicleBean.getTargaVehicle());
		
		vehicle.setLicensePlate(vehicleBean.getTargaVehicle());
		vehicle.setUsername(vehicleBean.getUsername());
		vehicle.setVehicleBrand(vehicleBean.getMarcaVehicle());
		vehicle.setVehicleModel(vehicleBean.getModelloVehicle());
		vehicle.setVehiclePowertrains(vehicleBean.getCavalliVehicle());
		vehicle.setVehicleDisplacement(vehicleBean.getCilindrataVehicle());
		vehicle.setVehicleInsurance(vehicleBean.getScadAssicurazione());
		vehicle.setVehicleTax(vehicleBean.getScadBollo());
		vehicle.setVehicleReview(vehicleBean.getScadRevisione());
		vehicle.setVehicleService(vehicleBean.getScadTagliando());
		
		
		
		if (vehicledao.saveVehicle(vehicle))
			result= true;
		
		return result;
		
		} catch (DuplicatedVehicleException dve) {
			System.err.println(dve.getMessage());
			//return false;
			throw dve;
		
		} catch (EmptyLicensePlateFieldException emptyException) {
			//System.err.println(emptyException.getMessage());
			throw emptyException;
			//return false;
		
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