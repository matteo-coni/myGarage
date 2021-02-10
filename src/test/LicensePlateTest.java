package test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import logic.bean.VehicleBean;

public class LicensePlateTest {
	
	@Test
	public void checkFormat() {
		//verifica correttezza formato targa italiana
		VehicleBean TestFormat= new VehicleBean();
		
		String exlicense = "Za225Ld";
		
		assertEquals(true, TestFormat.checkLicensePlate(exlicense));
	}
}
