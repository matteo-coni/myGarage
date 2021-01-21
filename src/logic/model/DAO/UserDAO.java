package logic.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	
	public boolean findUser(String username, String password) {
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
            String qry = "SELECT * FROM User WHERE Username = '" + username + "'AND Password = '" + password + "';";
            System.out.println(qry); //prova stringa query
            ResultSet res = stm.executeQuery(qry);
            
            if(res.next()) {
               // System.out.printf("%s : %s (%s)\n", res.getString("Artista"), res.getString("Titolo"), res.getInt("Anno"));
            	res.close();
                stm.close();
                con.close();
                System.out.println(username);
            	return true; //trovati --> ritorno vero
            	
            	/****** MANCA LA CREAZIONE DELL'UTENTE USER    ****** */
            }
            res.close();
            stm.close();
            con.close();
            
            return false; //username e password non trovati nel database
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        
       return false;
    }
}
