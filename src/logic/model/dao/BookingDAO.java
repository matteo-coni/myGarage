package logic.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import logic.model.*;

public class BookingDAO {

	//Stringa di connessione al db con nome e porta
	static final String URL = "jdbc:mysql://localhost:3306/mydb";
	// Stringa driver per il db
	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String USERNAMEDB = "root";
	static final String PASSWORDDB = "admin";
		
	public void saveBooking(Booking booking) {
		
		Connection con = null;
		Statement stm = null;
		
		
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ITALY);
		String dataBook = sdf.format(booking.getDateBook());
		
		
		try {
            
            // Otteniamo una connessione con username e password
            con = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
            stm = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // Stringa per insert e update stm	
            
            String insertStm = String.format("INSERT INTO Booking (Username, Officina, Problemi, Data, Confermata, Veicolo) "
            								+ "VALUES ('%s', '%s', '%s', '%s', '%d', '%s')", booking.getUsername(), booking.getNameGarage(),
            								booking.getProblems(), dataBook, 0, booking.getSelVehicle());
           
            System.out.println(insertStm); //prova stringa query
            
            stm.executeUpdate(insertStm);
            
          
              
            
		   } catch (SQLException e) {
	            e.printStackTrace();
	            
	        } finally {
	       
	            if (stm != null) {
	                try {
	                    stm.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            stm = null;
	            
	            if (con != null) {
	                try {
	                    con.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	                con = null;
	            }
	        }
				
    }		
	

}
