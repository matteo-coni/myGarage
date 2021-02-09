package logic.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import logic.model.*;

public class BookingDAO {

	//Stringa di connessione al db con nome e porta
	static final String URL = "jdbc:mysql://localhost:3306/mydb";
	// Stringa driver per il db
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String USERNAMEDB = "root";
	static final String PASSWORDDB = "admin";
		
	public void saveBooking(Booking booking) {
		
		Connection con = null;
		Statement stm = null;
		
		
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ITALY);
		String dataBook = sdf.format(booking.getDateBook());
		
		
		try {
			Class.forName(DRIVER);
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
	            
	        } catch (ClassNotFoundException e) {
			
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
	
	public List<Booking> findBooking(String nomeOfficina){
		
		List<Booking> listBooking = new ArrayList<>();
		
		ResultSet rs= null;
		Connection con = null;
		Statement stm = null;
		
		try {
			Class.forName(DRIVER);
            // Otteniamo una connessione con username e password
            con = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
             stm = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // query ---> immagazziniamone i risultati	in result set	INSERIRE LA GIUSTA QUERY PER CERCARE NEL DB
            
            String query = "SELECT * FROM Booking WHERE Officina = '" + nomeOfficina + "' ORDER BY Data ASC;"; //Scrivere query per cercare by city
            System.out.println(query); //prova stringa query
            
            rs = stm.executeQuery(query);
            
            rs.first();
           
            do{
                
                String username = rs.getString("Username");
                
                //String Officina = rs.getString("");
                String problemi = rs.getString("Problemi");
                String data = rs.getString("Data");
                Date date=new SimpleDateFormat("dd/MM/yyyy").parse(data);
                
                Boolean confermata = rs.getBoolean("Confermata");
                String veicolo = rs.getString("Veicolo");
                
                Booking booking = new Booking();
                booking.setNameGarage(nomeOfficina);
                booking.setUsername(username);
                booking.setProblems(problemi);
                booking.setDateBook(date);
                booking.setSelVehicle(veicolo);
                booking.setBookingConfirm(confermata);

                listBooking.add(booking);

            }while(rs.next());
               
        } catch (SQLException se) {
            se.printStackTrace();
            
        } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
			
		} finally {
            
        	if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
            rs = null;
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
		
		return listBooking; 
		
	}
	

}
