package logic.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	
	static final String URL = "jdbc:mysql://localhost:3306/mydb";
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String USERNAMEDB = "root";
	static final String PASSWORDDB = "admin";
	
	public boolean findUser(String username, String password) {
       
		Statement stm = null;
		Connection con = null;
		ResultSet res = null;
		
		try {
            // Carichiamo un driver per connetterci a Java
			Class.forName(DRIVER);
                     
            // Otteniamo una connessione con username e password
            con = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
            stm = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            	
            	 // Eseguiamo una query e immagazziniamone i risultati
                // in un oggetto ResultSet
            String qry = "SELECT * FROM User WHERE Username = '" + username + "'AND Password = '" + password + "';";
            
            res = stm.executeQuery(qry);
                
            if(res.next()) {

                stm.close();
              	return true; //trovati --> ritorno vero
                }
             
       
        } catch (SQLException e) {
            e.printStackTrace();
        
        } catch (ClassNotFoundException cnf) {	
        	cnf.printStackTrace();
            
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
                } catch (SQLException eCon) {
                    eCon.printStackTrace();
                }
                con = null;
            }
        }
		
		return false; //se non trovati 
	}
	
	public boolean findUserMech(String username, String password) {
	       
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		try {
            // Carichiamo un driver per connetterci a Java
			Class.forName(DRIVER);
                     
            // Otteniamo una connessione con username e password
            con = DriverManager.getConnection (URL , USERNAMEDB, PASSWORDDB);
            
            // Creiamo un oggetto Statement per interrogare il db
            stm = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            	
            	 // Eseguiamo una query e immagazziniamone i risultati
                // in un oggetto ResultSet
            String qry = "SELECT * FROM User WHERE Username = '" + username + "' AND Password = '" + password + "' AND Mech = '1';";
            rs = stm.executeQuery(qry);
                
            if(rs.next()) {
                 
                stm.close();
              	return true; //trovati --> ritorno vero
 
                }
             
       
        } catch (SQLException e) {
            e.printStackTrace();
        
        } catch (ClassNotFoundException cnfe) {
        	
        	cnfe.printStackTrace();
        	
            
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
                } catch (SQLException eS) {
                    eS.printStackTrace();
                }
                con = null;
            }
        }
		
		return false;
	}
}

