package logic.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import logic.model.Mechanic;

public class MechanicDAO {
	
	// Stringa di connessione al db con nome e porta
	static final String URL = "jdbc:mysql://localhost:3306/mydb";
	// Stringa driver per il db
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String USERNAMEDB = "root";
	static final String PASSWORDDB = "admin";
	
	static final String OFFICINA = "Officina";
	static final String CITTA = "Città";
	static final String ZONA = "Zona";
	static final String INDIRIZZO = "Indirizzo";
	static final String PERCSCONTO = "PercSconto";
	
	String testo= "SELECT * FROM Mechanic WHERE Città = '";
	String testo2 = "' ORDER BY PercSconto DESC;";	
	
	
	public List<Mechanic> searchByCity(String city){
		
		List<Mechanic> listMechanic = new ArrayList<>();
		
		ResultSet ress= null;
		Connection conn = null;
		Statement stm = null;
		
		try {
			
			Class.forName(DRIVER);
            // Otteniamo una connessione con username e password
            conn = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
             stm = conn.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // query ---> immagazziniamone i risultati	in result set	INSERIRE LA GIUSTA QUERY PER CERCARE NEL DB
             String query = testo + city + testo2; //Scrivere query per cercare by city
            
            
            ress = stm.executeQuery(query);
            
            ress.first();
            
            do{
                
                String officina = ress.getString(OFFICINA);
                
                String citta = ress.getString(CITTA);
                String zona = ress.getString(ZONA);
                String indirizzo = ress.getString(INDIRIZZO);
                int percSconto = ress.getInt(PERCSCONTO);
                
                
                
                Mechanic mechanic = new Mechanic();
                mechanic.setCity(citta);
                mechanic.setZone(zona);
                mechanic.setAddress(indirizzo);
                mechanic.setGarage(officina);
                mechanic.setPercSconto(percSconto);

                listMechanic.add(mechanic);

            }while(ress.next());
               
        } catch (SQLException se) {
            se.printStackTrace();
            
        } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} finally {
            
        	if (ress != null) {
                try {
                    ress.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
            ress = null;
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            stm = null;
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException esc) {
                    esc.printStackTrace();
                }
                conn = null;
            }
        }
		
		return listMechanic; 
				
		
	}
	
	public List<Mechanic> searchByCityZone(String city, String zone){
		
		List<Mechanic> listMechanic = new ArrayList<>();
		
		ResultSet rs= null;
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName(DRIVER);
            // Otteniamo una connessione con username e password
            con = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
             stmt = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // query ---> immagazziniamone i risultati	in result set	INSERIRE LA GIUSTA QUERY PER CERCARE NEL DB  
            String query = testo + city + "' AND Zona = '" + zone + testo2; //Scrivere query per cercare by city/zone
            
            
            rs = stmt.executeQuery(query);
            
            rs.first();
           
            do{
                
                String officina = rs.getString(OFFICINA);
                
                String citta = rs.getString(CITTA);
                String zona = rs.getString(ZONA);
                String indirizzo = rs.getString(INDIRIZZO);
                int percSconto = rs.getInt(PERCSCONTO);
                
                
                
                Mechanic mechanic = new Mechanic();
                mechanic.setCity(citta);
                mechanic.setZone(zona);
                mechanic.setAddress(indirizzo);
                mechanic.setGarage(officina);
                mechanic.setPercSconto(percSconto);

                listMechanic.add(mechanic);

            }while(rs.next());
               
        } catch (SQLException e) {
            e.printStackTrace();
            
        } catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} finally {
            
        	if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
            rs = null;
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ess) {
                    ess.printStackTrace();
                }
            }
            stmt = null;
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                con = null;
            }
        }
		
		return listMechanic; 
				
		
	}
	
	public List<Mechanic> searchByCityName(String city, String name){
		
		List<Mechanic> listMechanic = new ArrayList<>();
		
		ResultSet rst= null;
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
            String query = testo + city + "' AND Officina = '" + name + testo2; //Scrivere query per cercare by city/name
            
            rst = stm.executeQuery(query);
            
            rst.first();
           
            do{
                
                String officina = rst.getString(OFFICINA);
                
                String citta = rst.getString(CITTA);
                String zona = rst.getString(ZONA);
                String indirizzo = rst.getString(INDIRIZZO);
                int percSconto = rst.getInt(PERCSCONTO);
                
                
                
                Mechanic mechanic = new Mechanic();
                mechanic.setCity(citta);
                mechanic.setZone(zona);
                mechanic.setAddress(indirizzo);
                mechanic.setGarage(officina);
                mechanic.setPercSconto(percSconto);

                listMechanic.add(mechanic);

            }while(rst.next());
               
        } catch (SQLException e) {
            e.printStackTrace();
            
        } catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} finally {
			if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            stm = null;
        	if (rst != null) {
                try {
                    rst.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
            rst = null;
            
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException es) {
                    es.printStackTrace();
                }
                con = null;
            }
        }
		
		return listMechanic; 
	
	}
	
	public List<Mechanic> searchByCityZoneName(String city, String zone, String name){
		
		List<Mechanic> listMechanic = new ArrayList<>();
		
		ResultSet rsc= null;
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
            String query = testo + city + "' AND Zona = '" + zone + "' AND Officina = '" + name + testo2; //Scrivere query per cercare by city
            
            
            rsc = stm.executeQuery(query);
            
            rsc.first();
           
            do{
                
                String officina = rsc.getString(OFFICINA);
                
                String citta = rsc.getString(CITTA);
                String zona = rsc.getString(ZONA);
                String indirizzo = rsc.getString(INDIRIZZO);
                int percSconto = rsc.getInt(PERCSCONTO);
                
                
                
                Mechanic mechanic = new Mechanic();
                mechanic.setCity(citta);
                mechanic.setZone(zona);
                mechanic.setAddress(indirizzo);
                mechanic.setGarage(officina);
                mechanic.setPercSconto(percSconto);

                listMechanic.add(mechanic);

            }while(rsc.next());
               
        } catch (SQLException se) {
            se.printStackTrace();
            
        } catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} finally {
            
        	if (rsc != null) {
                try {
                    rsc.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
            rsc = null;
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException es) {
                    es.printStackTrace();
                }
            }
            stm = null;
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                con = null;
            }
        }
		
		return listMechanic; 
		
	}
}
