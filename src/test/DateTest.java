package test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.util.*;

import logic.control.ControllerInsertVehicleInfo;
import logic.bean.VehicleBean;

public class DateTest {
	
	//Confronto fra date
	@Test
	public void checkDate() {
		ControllerInsertVehicleInfo testDate= new ControllerInsertVehicleInfo();
		
		GregorianCalendar date= new GregorianCalendar(2021, 03, 25);
		
		assertEquals(true, testDate.checkDeadline(date));
	}
	
	//Verifica esistenza data
	@Test
	public void correctDate() {
		VehicleBean testDate= new VehicleBean();
		
		GregorianCalendar cal = new GregorianCalendar (29, 2, 2007);
		
		assertEquals(false, testDate.checkDate(cal));
	}

}