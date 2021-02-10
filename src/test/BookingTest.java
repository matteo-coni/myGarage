package test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import logic.bean.BookingBean;
import logic.control.ControllerViewBook;

//TEST MATTEO CONI

public class BookingTest {

	@Test
	public void checkBooking() {
		
		String nomeOfficina = "OfficinaMario";
		ControllerViewBook controlViewBook = new ControllerViewBook();
		List<BookingBean> listBookingBean = controlViewBook.findBooking(nomeOfficina);
		
		String usernameBook = listBookingBean.get(0).getUsername();
		
		assertEquals("admin",usernameBook);
;		
	}

}
