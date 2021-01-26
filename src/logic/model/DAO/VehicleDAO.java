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


public class VehicleDAO {
	
	public void saveVehicle(String username, String targa, String marca, String modello, String cilindrata, String cavalli, String assicurazione,
							String bollo, String revisione, String tagliando) { //AGGIUNGERE ULTERIORI INFO
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
            
            // Eseguiamo una query e immagazziniamone i risultati		
            // in un oggetto ResultSet
            String insertStm = String.format("INSERT INTO Vehicle (User_Username, Targa, Marca, Modello, Cilindrata, Cavalli, Assicurazione,"
            								+ " Bollo, Revisione, Tagliando) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", username,
            								targa, marca, modello, cilindrata, cavalli, assicurazione, bollo, revisione, tagliando);
            System.out.println(insertStm); //prova stringa query
            
            stm.executeUpdate(insertStm);
            
            stm.close();
            con.close();
              
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
    }
	
	
	
	public List<Vehicle> findVehicle(String username){
		
		List<Vehicle> listVehicle = new ArrayList<Vehicle>();
		
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
            String query = "SELECT * FROM Vehicle WHERE Username_User = '" + username + "';";
            System.out.println(query); //prova stringa query
            ResultSet rs = stm.executeQuery(query);
            
            rs.first();
           
            do{
                
                String targa = rs.getString("Targa");
                String marca = rs.getString("Marca");
                String modello = rs.getString("Modello");
                
                Vehicle vehicle = new Vehicle(username, targa, marca, modello);
                
                listVehicle.add(vehicle);
                                               
                

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
				
		
	}

}
