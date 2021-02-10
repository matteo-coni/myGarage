package test;

import static org.junit.Assert.*;

import org.junit.*;
import java.util.*;

import logic.control.ControllerInsertVehicleInfo;
import logic.bean.VehicleBean;

public class DateTest {
	
	//Confronto fra date
	@Test
	public void checkDateDeadline() {
		ControllerInsertVehicleInfo testDate= new ControllerInsertVehicleInfo();
		
		GregorianCalendar date= new GregorianCalendar(2021, 03, 25);
		
		assertEquals(true, testDate.checkDeadline(date));
	}
	
	//Verifica esistenza data
	@Test
	public void correctDate() {
		VehicleBean testDate= new VehicleBean();
		
		GregorianCalendar cal = new GregorianCalendar(0000, 02, 29);
		
		assertEquals(false, testDate.checkDate(cal));
	}

}