package logic.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import logic.exception.DuplicatedVehicleException;
import logic.exception.EmptyLicensePlateFieldException;
import logic.model.Vehicle; 


public class VehicleDAO {
	
	// Stringa di connessione al db con nome e porta
	static final String URL = "jdbc:mysql://localhost:3306/mydb";
	// Stringa driver per il db
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String USERNAMEDB = "root";
	static final String PASSWORDDB = "admin";
	String format ="dd/MM/yyyy";
	
	public Boolean saveVehicle(Vehicle vehicle) throws DuplicatedVehicleException, EmptyLicensePlateFieldException { //AGGIUNGERE ULTERIORI INFO
        
		
		Connection con = null;
		Statement stm = null;
		
		try {
            
			Class.forName(DRIVER);
            // Otteniamo una connessione con username e password
            con = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
            stm = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // Stringa per insert e update stm	
            String username = vehicle.getUsername(); 
            String targa = vehicle.getLicensePlate();
            String marca = vehicle.getVehicleBrand();
            String modello = vehicle.getVehicleModel();
            String cilindrata = vehicle.getVehicleDisplacement();
            String cavalli = vehicle.getVehiclePowertrains();
           
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ITALY);
           
            String assicurazione = sdf.format(vehicle.getVehicleInsurance());
			String bollo = sdf.format(vehicle.getVehicleTax()); 
			String revisione = sdf.format(vehicle.getVehicleReview());
			String tagliando = sdf.format(vehicle.getVehicleService());
			
			if(targa.equals("")) {
				throw new EmptyLicensePlateFieldException("Targa obbligatoria");
			}
            
            String insertStm = String.format("INSERT INTO Vehicle (User_Username, Targa, Marca, Modello, Cilindrata, Cavalli, Assicurazione,"
            								+ " Bollo, Revisione, Tagliando) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", username,
            								targa, marca, modello, cilindrata, cavalli, assicurazione, bollo, revisione, tagliando);
            System.out.println(insertStm); //prova stringa query
            
           if(stm.executeUpdate(insertStm)>0) { //restituisce il numero delle modifiche, quindi con 0 non è possibile
        	   return true;
           } 
           
           
    
		   } catch (SQLException e) {
			   
			   throw new DuplicatedVehicleException("Veicolo già presente");
	          // e.printStackTrace();
		   } catch (ClassNotFoundException cnf) {
			   cnf.printStackTrace();
	            
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
		return false;
				
    }
	
	
	
	public List<Vehicle> findVehicle(String username){
		
		List<Vehicle> listVehicle = new ArrayList<>();
		
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
            
            String query = "SELECT * FROM Vehicle WHERE User_Username = '" + username + "';";
            System.out.println(query); //prova stringa query
            rs = stm.executeQuery(query);
            
            rs.first();
           
            do{
                
                String targa = rs.getString("Targa");
                
                String marca = rs.getString("Marca");
                String modello = rs.getString("Modello");
                String cilindrata = rs.getString("Cilindrata");
                String cavalli = rs.getString("Cavalli");
                /*String assicurazione = rs.getString("Assicurazione");
                String bollo = rs.getString("Bollo");
                String revisione = rs.getString("Revisione");
                String tagliando = rs.getString("Tagliando");*/
                
                Vehicle vehicle = new Vehicle(username, targa, marca, modello, cilindrata, cavalli);
                //vehicle.setVehicleInsurance(assicurazione);
                
                
                
                System.out.println(vehicle.getLicensePlate());
             
                
                listVehicle.add(vehicle);

            }while(rs.next());
               
        } catch (SQLException e) {
            e.printStackTrace();
       
        } catch (ClassNotFoundException cnf) {
			   cnf.printStackTrace();
			   
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
		
		return listVehicle; 
				
		
	}
	
	public Vehicle createLoadVehicle(String targa) {
		
		Vehicle vehicle = new Vehicle(targa);
		
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
            
            //query e risultati in rs	-----	INSERIRE LA GIUSTA QUERY PER CERCARE NEL DB
            
            String query = "SELECT * FROM Vehicle WHERE Targa = '" + targa + "';";
            System.out.println(query); //prova stringa query
            rs = stm.executeQuery(query);
            
            rs.first();
            
            
            String marca = rs.getString("Marca");
            String modello = rs.getString("Modello");
            String cilindrata = rs.getString("Cilindrata");
            String cavalli = rs.getString("Cavalli");
            String assicurazione = rs.getString("Assicurazione");
            String bollo = rs.getString("Bollo");
            String revisione = rs.getString("Revisione");
            String tagliando = rs.getString("Tagliando");
           
            
            vehicle.setVehicleBrand(marca);
            vehicle.setVehicleModel(modello);
            vehicle.setVehicleDisplacement(cilindrata);
            vehicle.setVehiclePowertrains(cavalli);
            
            Date dateAss=new SimpleDateFormat(format).parse(assicurazione);
            vehicle.setVehicleInsurance(dateAss);
            
            Date dateRev=new SimpleDateFormat(format).parse(revisione);
            vehicle.setVehicleReview(dateRev);
            
            Date dateBollo=new SimpleDateFormat(format).parse(bollo);
            vehicle.setVehicleTax(dateBollo);
            
            Date dateTagl=new SimpleDateFormat(format).parse(tagliando);
            vehicle.setVehicleService(dateTagl);
            
            
	
		   } catch (SQLException e) {
	            e.printStackTrace();
	            
	       } catch (ParseException pe){
	    	   pe.printStackTrace();
	       
	       } catch (ClassNotFoundException cnf) {
			   cnf.printStackTrace();
			   
	       } finally {
	       
	            
	        	if (rs != null) {
	                try {
	                    rs.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            rs = null;
	            if (stm != null) {
	                try {
	                    stm.close();
	                } catch (SQLException e1) {
	                    e1.printStackTrace();
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
			
		
		return vehicle;		
	}
}
