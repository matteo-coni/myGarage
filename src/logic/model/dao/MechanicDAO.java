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
	String testo= "SELECT * FROM Mechanic WHERE Città = '";
	String testo2 = "' ORDER BY PercSconto DESC;";	
	
	public List<Mechanic> searchByCity(String city){
		
		List<Mechanic> listMechanic = new ArrayList<>();
		
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
            
            String query = testo + city + testo2; //Scrivere query per cercare by city
            System.out.println(query); //prova stringa query
            
            rs = stm.executeQuery(query);
            
            rs.first();
           
            do{
                
                String officina = rs.getString("Officina");
                
                String citta = rs.getString("Città");
                String zona = rs.getString("Zona");
                String indirizzo = rs.getString("Indirizzo");
                int percSconto = rs.getInt("PercSconto");
                
                
                
                Mechanic mechanic = new Mechanic();
                mechanic.setCity(citta);
                mechanic.setZone(zona);
                mechanic.setAddress(indirizzo);
                mechanic.setGarage(officina);
                mechanic.setPercSconto(percSconto);

                listMechanic.add(mechanic);

            }while(rs.next());
               
        } catch (SQLException se) {
            se.printStackTrace();
            
        } catch (ClassNotFoundException e) {
			
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
		
		return listMechanic; 
				
		
	}
	
	public List<Mechanic> searchByCityZone(String city, String zone){
		
		List<Mechanic> listMechanic = new ArrayList<>();
		
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
            
            String query = testo + city + "' AND Zona = '" + zone + testo2; //Scrivere query per cercare by city/zone
            System.out.println(query); //prova stringa query
            
            rs = stm.executeQuery(query);
            
            rs.first();
           
            do{
                
                String officina = rs.getString("Officina");
                
                String citta = rs.getString("Città");
                String zona = rs.getString("Zona");
                String indirizzo = rs.getString("Indirizzo");
                int percSconto = rs.getInt("PercSconto");
                
                
                
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
            
        } catch (ClassNotFoundException e) {
			
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
                } catch (SQLException es) {
                    es.printStackTrace();
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
		
		return listMechanic; 
				
		
	}
	
	public List<Mechanic> searchByCityName(String city, String name){
		
		List<Mechanic> listMechanic = new ArrayList<>();
		
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
            
            String query = testo + city + "' AND Officina = '" + name + testo2; //Scrivere query per cercare by city/name
            System.out.println(query); //prova stringa query
            
            rs = stm.executeQuery(query);
            
            rs.first();
           
            do{
                
                String officina = rs.getString("Officina");
                
                String citta = rs.getString("Città");
                String zona = rs.getString("Zona");
                String indirizzo = rs.getString("Indirizzo");
                int percSconto = rs.getInt("PercSconto");
                
                
                
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
            
        } catch (ClassNotFoundException e) {
			
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
            
            String query = testo + city + "' AND Zona = '" + zone + "' AND Officina = '" + name + testo2; //Scrivere query per cercare by city
            System.out.println(query); //prova stringa query
            
            rs = stm.executeQuery(query);
            
            rs.first();
           
            do{
                
                String officina = rs.getString("Officina");
                
                String citta = rs.getString("Città");
                String zona = rs.getString("Zona");
                String indirizzo = rs.getString("Indirizzo");
                int percSconto = rs.getInt("PercSconto");
                
                
                
                Mechanic mechanic = new Mechanic();
                mechanic.setCity(citta);
                mechanic.setZone(zona);
                mechanic.setAddress(indirizzo);
                mechanic.setGarage(officina);
                mechanic.setPercSconto(percSconto);

                listMechanic.add(mechanic);

            }while(rs.next());
               
        } catch (SQLException se) {
            se.printStackTrace();
            
        } catch (ClassNotFoundException e) {
		
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
                } catch (SQLException es) {
                    es.printStackTrace();
                }
            }
            stm = null;
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
}
