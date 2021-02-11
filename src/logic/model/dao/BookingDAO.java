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
		
		Connection connect = null;
		Statement stm = null;
		
		
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ITALY);
		String dataBook = sdf.format(booking.getDateBook());
		
		
		try {
			Class.forName(DRIVER);
            // Otteniamo una connessione con username e password
            connect = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
            stm = connect.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // Stringa per insert e update stm	
            
            String insertStm = String.format("INSERT INTO Booking (Username, Officina, Problemi, Data, Confermata, Veicolo) "
            								+ "VALUES ('%s', '%s', '%s', '%s', '%d', '%s')", booking.getUsername(), booking.getNameGarage(),
            								booking.getProblems(), dataBook, 0, booking.getSelVehicle());
           
           
            
            stm.executeUpdate(insertStm);  //System.out.println(insertStm); prova stringa query
            
		   } catch (SQLException e1) {
			   e1.printStackTrace();
	       
		   } catch (ClassNotFoundException cnf) {
	        	cnf.printStackTrace();
	        	
		} finally {
	       
	            if (stm != null) {
	                try {
	                    stm.close();
	                } catch (SQLException estm) {
	                    estm.printStackTrace();
	                }
	            }
	            stm = null;
	            
	            if (connect != null) {
	                try {
	                    connect.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	                connect = null;
	            }
	        }
				
    }		
	
	public List<Booking> findBooking(String nomeOfficina){
		
		List<Booking> listBooking = new ArrayList<>();
		
		ResultSet rst= null;
		Connection con = null;
		Statement stat = null;
		
		try {
			Class.forName(DRIVER);
            // Otteniamo una connessione con username e password
            con = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
             stat = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // query ---> immagazziniamone i risultati	in result set	INSERIRE LA GIUSTA QUERY PER CERCARE NEL DB
            
            String query = "SELECT * FROM Booking WHERE Officina = '" + nomeOfficina + "' ORDER BY Data ASC;"; //Scrivere query per cercare by city
            
            
            rst = stat.executeQuery(query); //System.out.println(query); prova stringa query
            
            rst.first();
           
            do{
                
                String username = rst.getString("Username"); 
                String problemi = rst.getString("Problemi");
                String data = rst.getString("Data");
                Date date=new SimpleDateFormat("dd/MM/yyyy").parse(data);
                
                Boolean confermata = rst.getBoolean("Confermata");
                String veicolo = rst.getString("Veicolo");
                
                Booking booking = new Booking();
                booking.setNameGarage(nomeOfficina);
                booking.setUsername(username);
                booking.setProblems(problemi);
                booking.setDateBook(date);
                booking.setSelVehicle(veicolo);
                booking.setBookingConfirm(confermata);

                listBooking.add(booking);

            }while(rst.next());
               
        } catch (SQLException se) {
            se.printStackTrace();
            
        } catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (ParseException e2) {
			e2.printStackTrace();
			
		} finally {
            
        	if (rst != null) {
                try {
                    rst.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
            rst = null;
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            stat = null;
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException eC) {
                    eC.printStackTrace();
                }
                con = null;
            }
        }
		
		return listBooking; 
		
	}

	public void confirmBooking(String username, String nomeOfficina, String targa, int val) {
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			Class.forName(DRIVER);
            // Otteniamo una connessione con username e password
            conn = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
            stmt = conn.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // Stringa per insert e update stm	
            
            String updateStm = "UPDATE Booking SET Confermata = '" + val + "' where Officina = '" + nomeOfficina + "' AND Username = '" + username + "' AND Veicolo = '" + targa + "';";
           
           
            
            stmt.executeUpdate(updateStm);  //System.out.println(updateStm); prova stringa query
            
		   } catch (SQLException sql) {
			   sql.printStackTrace();
	       
		   } catch (ClassNotFoundException e2) {
	        	e2.printStackTrace();
	        	
		} finally {
	       
	            if (stmt != null) {
	                try {
	                    stmt.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            stmt = null;
	            
	            if (conn != null) {
	                try {
	                    conn.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	                conn = null;
	            }
	        }
	}
	

}
