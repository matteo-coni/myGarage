package test;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;
import logic.control.*;

public class DateTest {
	
	@Test
	public void CheckDate() {
		//confronto tra date
		boolean result;
		
		//RICHIAMARE METODO DA ControllerInsertVehicleInfo
		ControllerInsertVehicleInfo TestDate= ControllerInsertVehicleInfo.getInstance();
		
		GregorianCalendar date= new GregorianCalendar(2019, 11, 25);
		
		assertEquals(true, TestDate.checkDeadlineInsurance(date));
	}
	
	@Test
	public void CorrectDate() {
		//verifica dell'esistenza di una data
		boolean result;
		GregorianCalendar cal = new GregorianCalendar (29, 2, 2007);
		cal.setLenient (false);

		try {
			cal.get (Calendar.DATE);
			result=true;
		} catch (IllegalArgumentException e) {
			result=false;}
		
		assertEquals(false, cal);
	}

}

	//yesterday.isBefore(today);
	//today.isAfter(yesterday);