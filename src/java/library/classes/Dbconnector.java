/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.classes;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nadee
 */
public class Dbconnector {
    
    private final static String DRIVER = "com.mysql.jdbc.Driver" ;
    private final static String URL = "jdbc:mysql://localhost:3306/library_system" ;
    private final static String DBUSER = "library_user" ;
    private final static String DBPW = "library_user" ;
    
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,DBUSER,DBPW);
        } catch ( Exception ex) {
            Logger.getLogger(Dbconnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return con;
    }
    
}
