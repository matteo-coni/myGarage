package logic.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import logic.model.Vehicle; 
import logic.model.User;
import logic.bean.*;


public class VehicleDAO {
	
	public void saveVehicle(String username, String targa, String marca, String modello, String cilindrata, String cavalli, String assicurazione,
							String bollo, String revisione, String tagliando) { //AGGIUNGERE ULTERIORI INFO
        
		Statement stm = null;
		Connection con = null;
		try {
            // Carichiamo un driver per connetterci a Java DB
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver); 
            
            // Creiamo la stringa di connessione
            String url = "jdbc:mysql://localhost:3306/mydb"; //inserire nome database
            
            // Otteniamo una connessione con username e password
            con = DriverManager.getConnection (url , "root", "admin");
            
            // Creiamo un oggetto Statement per interrogare il db
            stm = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // Eseguiamo una query e immagazziniamone i risultati		
            // in un oggetto ResultSet
            String insertStm = String.format("INSERT INTO Vehicle (User_Username, Targa, Marca, Modello, Cilindrata, Cavalli, Assicurazione,"
            								+ " Bollo, Revisione, Tagliando) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", username,
            								targa, marca, modello, cilindrata, cavalli, assicurazione, bollo, revisione, tagliando);
            System.out.println(insertStm); //prova stringa query
            
            stm.executeUpdate(insertStm);
            
            //stm.close();
            //con.close();
              
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        
        } finally {
        	
        	if(stm!=null) {
        		
        		try{
        			stm.close();
        			con.close();
        		} catch (SQLException e) {
        			e.printStackTrace();
        			
        		}
        	if(con!=null) {
        		try {
        			con.close();
        		} catch (SQLException e) {
        			e.printStackTrace();
        		}
        	}
        		
        	}
        	
        }		
    }
	
	
	
	public List<Vehicle> findVehicle(String username){
		
		List<Vehicle> listVehicle = new ArrayList<Vehicle>();
		
		ResultSet rs= null;
		Connection con = null;
		Statement stm = null;
		
		try {
            // Carichiamo un driver per connetterci a Java DB
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver); 
            
            // Creiamo la stringa di connessione
            String url = "jdbc:mysql://localhost:3306/mydb"; //inserire nome database
            
            // Otteniamo una connessione con username e password
            con = DriverManager.getConnection (url , "root", "admin");
            
            // Creiamo un oggetto Statement per interrogare il db
             stm = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // Eseguiamo una query e immagazziniamone i risultati		INSERIRE LA GIUSTA QUERY PER CERCARE NEL DB
            // in un oggetto ResultSet
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
                String assicurazione = rs.getString("Assicurazione");
                String bollo = rs.getString("Bollo");
                String revisione = rs.getString("Revisione");
                String tagliando = rs.getString("Tagliando");
                
                Vehicle vehicle = new Vehicle(username, targa, marca, modello,cilindrata,cavalli);
                //vehicle.setVehicleInsurance(vehicleInsurance);
                
                
                System.out.println(vehicle.getLicensePlate());
                //System.out.println(targa);
                
                listVehicle.add(vehicle);
                                               
                

            }while(rs.next());
            
            
              
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
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
		
		try {
            // Carichiamo un driver per connetterci a Java DB
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver); 
            
            // Creiamo la stringa di connessione
            String url = "jdbc:mysql://localhost:3306/mydb"; //inserire nome database
            
            // Otteniamo una connessione con username e password
            Connection con = DriverManager.getConnection (url , "root", "admin");
            
            // Creiamo un oggetto Statement per interrogare il db
            Statement stm = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // Eseguiamo una query e immagazziniamone i risultati	-----	INSERIRE LA GIUSTA QUERY PER CERCARE NEL DB
            // in un oggetto ResultSet
            String query = "SELECT * FROM Vehicle WHERE Targa = '" + targa + "';";
            System.out.println(query); //prova stringa query
            ResultSet rs = stm.executeQuery(query);
            
            rs.first();
            
            String targa2 = rs.getString("Targa");
            String username = rs.getString("User_Username");
            String marca = rs.getString("Marca");
            String modello = rs.getString("Modello");
            String cilindrata = rs.getString("Cilindrata");
            String cavalli = rs.getString("Cavalli");
            String assicurazione = rs.getString("Assicurazione");
            String bollo = rs.getString("Bollo");
            String revisione = rs.getString("Revisione");
            String tagliando = rs.getString("Tagliando");
            
            //Vehicle vehicle = new Vehicle(username, targa, marca, modello, cilindrata, cavalli);
           /* vehiclebean.setTargaVehicle(targa2);
            vehiclebean.setUsername(username);
            vehiclebean.setMarcaVehicle(marca);
            vehiclebean.setModelloVehicle(modello);
            vehiclebean.setCilindrataVehicle(cilindrata);
            vehiclebean.setCavalliVehicle(cavalli);*/
            
            vehicle.setVehicleBrand(marca);
            vehicle.setVehicleModel(modello);
            vehicle.setVehicleDisplacement(cilindrata);
            vehicle.setVehiclePowertrains(cavalli);
           
            
           
          // return vehicle;
            
		
		} catch (SQLException e) {
            e.printStackTrace();
            
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
		return vehicle;
		
	}

/*public List<VehicleBean> findVehicle(String username){
		
		List<VehicleBean> listVehicle = new ArrayList<VehicleBean>();
		
		try {
            // Carichiamo un driver per connetterci a Java DB
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver); 
            
            // Creiamo la stringa di connessione
            String url = "jdbc:mysql://localhost:3306/mydb"; //inserire nome database
            
            // Otteniamo una connessione con username e password
            Connection con = DriverManager.getConnection (url , "root", "admin");
            
            // Creiamo un oggetto Statement per interrogare il db
            Statement stm = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            // Eseguiamo una query e immagazziniamone i risultati		INSERIRE LA GIUSTA QUERY PER CERCARE NEL DB
            // in un oggetto ResultSet
            String query = "SELECT * FROM Vehicle WHERE User_Username = '" + username + "';";
            System.out.println(query); //prova stringa query
            ResultSet rs = stm.executeQuery(query);
            
            rs.first();
           
            do{
                
                String targa = rs.getString("Targa");
                
                //String marca = rs.getString("Marca");
                //String modello = rs.getString("Modello");
                
                VehicleBean vehiclebean = new VehicleBean(targa); //marca, modello);
                
                
                System.out.println(vehiclebean.getTargaVehicle());
                //System.out.println(targa);
                
                listVehicle.add(vehiclebean);
                                               
                

            }while(rs.next());
            
            stm.close();
            con.close();
            rs.close();
              
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
		return listVehicle; 
				
		
	}*/
}
