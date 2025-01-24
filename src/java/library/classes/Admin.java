/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.classes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nadee
 */
public class Admin {

    private String username;
    private String password;
    private int admin_id;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public Admin(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public Admin(String username, String password, int admin_id) {
        this.username = username;
        this.password = password;
        this.admin_id = admin_id;
    }

    public boolean register() {
        Connection con = Dbconnector.getConnection();
        String query = "INSERT into admin(user_name,password) VALUES (?,?)";

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            int a = pstmt.executeUpdate();
            return a > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public List<Admin> getAlladmins() {
        List<Admin> adminlist = new ArrayList<>();
        Connection con = Dbconnector.getConnection();

        String query = "SELECT * FROM admin";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Admin admins = new Admin(rs.getString("user_name"), rs.getString("password"), rs.getInt("admin_id"));
                adminlist.add(admins);
            }

        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return adminlist;
    }

    public List<Admin> searchAdmins(String search) {
        List<Admin> adminlist = new ArrayList<>();
        Connection con = Dbconnector.getConnection();

        String query = "SELECT * FROM admin WHERE user_name LIKE ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "%" + search + "%");  // Search using wildcard
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Admin admins = new Admin(rs.getString("user_name"), rs.getString("password"), rs.getInt("admin_id"));
                adminlist.add(admins);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adminlist;
    }

    public Admin getAdmin() {
        Connection con = Dbconnector.getConnection();
        String query = "SELECT * FROM admin WHERE admin_id = ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, admin_id);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                this.username = rs.getString("user_name");  // Correct
                this.password = rs.getString("password");   // Fixed here
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }
    
    
    public boolean updateadmin(){
        
        Connection con = Dbconnector.getConnection();
        
        String query = "UPDATE admin SET user_name=?,password=? WHERE admin_id=?";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setInt(3, admin_id);
            
            int a = pstmt.executeUpdate();
  
            return a>0;
            
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public boolean deleteAdmin() {

        Connection con = Dbconnector.getConnection();

        String query = "DELETE FROM admin WHERE admin_id=?";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, admin_id);

            int a = pstmt.executeUpdate();
            return a > 0;

        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}
