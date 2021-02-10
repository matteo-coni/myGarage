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
	static final String OFFICINA = "officina";
	String testo= "SELECT * FROM Mechanic WHERE Città = '";
	String testo2 = "' ORDER BY PercSconto DESC;";	
	
	
	public List<Mechanic> searchByCity(String city){
		
		List<Mechanic> listMechanic = new ArrayList<>();
		
		ResultSet res= null;
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
            
            res = stm.executeQuery(query);
            
            res.first();
           
            do{
                
                String officina = res.getString(OFFICINA);
                
                String citta = res.getString("Città");
                String zona = res.getString("Zona");
                String indirizzo = res.getString("Indirizzo");
                int percSconto = res.getInt("PercSconto");
                
                
                
                Mechanic mechanic = new Mechanic();
                mechanic.setCity(citta);
                mechanic.setZone(zona);
                mechanic.setAddress(indirizzo);
                mechanic.setGarage(officina);
                mechanic.setPercSconto(percSconto);

                listMechanic.add(mechanic);

            }while(res.next());
               
        } catch (SQLException se) {
            se.printStackTrace();
            
        } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} finally {
            
        	if (res != null) {
                try {
                    res.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
            res = null;
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
                
                String officina = rs.getString(OFFICINA);
                
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
            System.out.println(query); //prova stringa query
            
            rst = stm.executeQuery(query);
            
            rst.first();
           
            do{
                
                String officina = rst.getString(OFFICINA);
                
                String citta = rst.getString("Città");
                String zona = rst.getString("Zona");
                String indirizzo = rst.getString("Indirizzo");
                int percSconto = rst.getInt("PercSconto");
                
                
                
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
            
        	if (rst != null) {
                try {
                    rst.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
            rst = null;
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
            System.err.println(query); //prova stringa query
            
            rsc = stm.executeQuery(query);
            
            rsc.first();
           
            do{
                
                String officina = rsc.getString(OFFICINA);
                
                String citta = rsc.getString("Città");
                String zona = rsc.getString("Zona");
                String indirizzo = rsc.getString("Indirizzo");
                int percSconto = rsc.getInt("PercSconto");
                
                
                
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
