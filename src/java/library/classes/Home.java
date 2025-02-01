/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.classes;

import java.sql.PreparedStatement;;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Home {
    
//    public int getCount(){
//        return count;
//    }
    
    public int TotalBooks(){
        Connection con = Dbconnector.getConnection();
       String query = "SELECT COUNT(*) AS book_id FROM book";
       int count = 0;
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
            count = rs.getInt("book_id"); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
         return count;
    }
    
    public int AvailableBooks(){
        Connection con = Dbconnector.getConnection();
        int count = 0;
        String query = "SELECT count(*) AS bookstatus FROM book where bookstatus = 'Available'";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                count = rs.getInt("bookstatus");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
    public int TotalTransactions(){
        Connection con = Dbconnector.getConnection();
        String query = "SELECT COUNT(*) AS transaction_id FROM transaction";
        int count = 0;
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                count = rs.getInt("transaction_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
    public int TotalMembers(){
        Connection con = Dbconnector.getConnection();
        String query = "SELECT COUNT(*) AS u_id FROM user";
        int count = 0;
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                count = rs.getInt("u_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
}
