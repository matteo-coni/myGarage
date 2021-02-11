package logic.control;

import java.util.ArrayList;
import java.util.List;

import logic.bean.*;
import logic.model.*;
import logic.model.dao.*;

public class ControllerViewVehicle {

	public ControllerViewVehicle() {
		//Costruttore
	}
	
	
	public List<String> viewVehicle(String username){
		
		
		List<String> targheVeicoli = new ArrayList<>();
		VehicleDAO vehicledao = new VehicleDAO();
		List<Vehicle> listVehicle = vehicledao.findVehicle(username);
		
		for(Vehicle vehicle : listVehicle) {
			
			targheVeicoli.add(vehicle.getLicensePlate());
		}
		
		return targheVeicoli;
		
	}

	
	public VehicleBean loadVehicle(String targa) { //chiama il dao per ottenere un veicolo e setta la relativa bean
		
		VehicleBean vehiclebean = new VehicleBean(targa);
		Vehicle vehicle;
		
		VehicleDAO vehicledao = new VehicleDAO();
		vehicle = vehicledao.createLoadVehicle(targa);
		
		vehiclebean.setMarcaVehicle(vehicle.getVehicleBrand());
		vehiclebean.setModelloVehicle(vehicle.getVehicleModel());
		vehiclebean.setCilindrataVehicle(vehicle.getVehicleDisplacement());
		vehiclebean.setCavalliVehicle(vehicle.getVehiclePowertrains());
		vehiclebean.setScadAssicurazione(vehicle.getVehicleInsurance());
		vehiclebean.setScadBollo(vehicle.getVehicleTax());
		vehiclebean.setScadRevisione(vehicle.getVehicleReview());
		vehiclebean.setScadTagliando(vehicle.getVehicleService());
		
		
		
		return vehiclebean;
	}
}
