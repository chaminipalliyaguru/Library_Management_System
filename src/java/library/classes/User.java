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
public class User {
    
    private int u_id;
    private String f_name;
    private String l_name;
    private String email;
    private String mobile_no;
    private String address;

    public User() {
    }

    public User(int u_id) {
        this.u_id = u_id;
    }

    public User(String f_name, String l_name, String email, String mobile_no, String address) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.mobile_no = mobile_no;
        this.address = address;
    }

    public User(int u_id, String f_name, String l_name, String email, String mobile_no, String address) {
        this.u_id = u_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.mobile_no = mobile_no;
        this.address = address;
    }

    public int getU_id() {
        return u_id;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public String getAddress() {
        return address;
    }

    public boolean register() {
        Connection con = Dbconnector.getConnection();
        String query = "INSERT INTO User (f_name, l_name, email, mobile_no, address) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, f_name);
            pstmt.setString(2, l_name);
            pstmt.setString(3, email);
            pstmt.setString(4, mobile_no);
            pstmt.setString(5, address);

            int a = pstmt.executeUpdate();
            return a > 0;

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        Connection con = Dbconnector.getConnection();

        String query = "SELECT * FROM User";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                User user = new User(
                    rs.getInt("u_id"),
                    rs.getString("f_name"),
                    rs.getString("l_name"),
                    rs.getString("email"),
                    rs.getString("mobile_no"),
                    rs.getString("address")
                );
                userList.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userList;
    }

    public boolean updateUser() {
        Connection con = Dbconnector.getConnection();
        String query = "UPDATE User SET t_name=?, l_name=?, email=?, mobile_no=?, address=? WHERE u_id=?";

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, f_name);
            pstmt.setString(2, l_name);
            pstmt.setString(3, email);
            pstmt.setString(4, mobile_no);
            pstmt.setString(5, address);
            pstmt.setInt(6, u_id);

            int a = pstmt.executeUpdate();
            return a > 0;

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public boolean deleteUser() {
        Connection con = Dbconnector.getConnection();
        String query = "DELETE FROM User WHERE u_id=?";

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, u_id);

            int a = pstmt.executeUpdate();
            return a > 0;

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public List<User> searchUsers(String search) {
        List<User> userList = new ArrayList<>();
        Connection con = Dbconnector.getConnection();

        String query = "SELECT * FROM User WHERE t_name LIKE ? OR l_name LIKE ? OR email LIKE ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "%" + search + "%");
            pstmt.setString(2, "%" + search + "%");
            pstmt.setString(3, "%" + search + "%");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                User user = new User(
                    rs.getInt("u_id"),
                    rs.getString("t_name"),
                    rs.getString("l_name"),
                    rs.getString("email"),
                    rs.getString("mobile_no"),
                    rs.getString("address")
                );
                userList.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userList;
    }

    public User getUserById() {
        Connection con = Dbconnector.getConnection();
        String query = "SELECT * FROM User WHERE u_id=?";

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, u_id);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                this.f_name = rs.getString("t_name");
                this.l_name = rs.getString("l_name");
                this.email = rs.getString("email");
                this.mobile_no = rs.getString("mobile_no");
                this.address = rs.getString("address");
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }
}
