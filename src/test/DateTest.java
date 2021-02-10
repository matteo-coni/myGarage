package test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.util.*;

import logic.control.ControllerInsertVehicleInfo;
import logic.bean.VehicleBean;

public class DateTest {
	
	//Confronto fra date
	@Test
	public void CheckDate() {
		ControllerInsertVehicleInfo TestDate= new ControllerInsertVehicleInfo();
		
		GregorianCalendar date= new GregorianCalendar(2021, 03, 25);
		
		assertEquals(true, TestDate.checkDeadline(date));
	}
	
	//Verifica esistenza data
	@Test
	public void CorrectDate() {
		VehicleBean TestDate= new VehicleBean();
		
		GregorianCalendar cal = new GregorianCalendar (29, 2, 2007);
		
		assertEquals(false, TestDate.checkDate(cal));
	}

}

//yesterday.isBefore(today);
//today.isAfter(yesterday);