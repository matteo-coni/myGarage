package logic.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VehicleDAO {
	
	public void saveVehicle(String targa, String marca, String modello, String cilindrata, String cavalli, String assicurazione,
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
            
            // Eseguiamo una query e immagazziniamone i risultati		INSERIRE LA GIUSTA QUERY PER SALVARE NEL DB
            // in un oggetto ResultSet
            String qry = "          ";/*"SELECT * FROM User WHERE Username = '" + username + "'AND Password = '" + password + "';";*/
            System.out.println(qry); //prova stringa query
            ResultSet res = stm.executeQuery(qry);
            
            if(res.next()) {
               
            	res.close();
                stm.close();
                con.close();
               
            	
       
            }
            
            
            res.close();
            stm.close();
            con.close();
            
           
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
       
  }

}
