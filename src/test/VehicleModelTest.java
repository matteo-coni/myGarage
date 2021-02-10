package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.control.ControllerViewVehicle;
import logic.bean.VehicleBean;

public class VehicleModelTest {

	@Test
	public void CheckVehicleModel() {
		
		String targa = "BB/636/CG";
		
		ControllerViewVehicle controlViewVehicle = new ControllerViewVehicle();
		VehicleBean vehicleBean = controlViewVehicle.loadVehicle(targa);
		
		assertEquals("Ferrari",vehicleBean.getMarcaVehicle());
		
	}

}
