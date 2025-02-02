package library.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Setting {

    private String libraryName;
    private String contactNumber;
    private String libraryEmail;
    private int maxBooks;
    private int fineRate;

    // Getters and setters
    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLibraryEmail() {
        return libraryEmail;
    }

    public void setLibraryEmail(String libraryEmail) {
        this.libraryEmail = libraryEmail;
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    public void setMaxBooks(int maxBooks) {
        this.maxBooks = maxBooks;
    }

    public int getFineRate() {
        return fineRate;
    }

    public void setFineRate(int fineRate) {
        this.fineRate = fineRate;
    }

    // Get current settings
    public static Setting getCurrentSettings() {
        Setting setting = new Setting();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = Dbconnector.getConnection();
            String query = "SELECT * FROM settings LIMIT 1";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                setting.setLibraryName(rs.getString("library_name"));
                setting.setContactNumber(rs.getString("contact_number"));
                setting.setLibraryEmail(rs.getString("library_email"));
                setting.setMaxBooks(rs.getInt("max_books"));
                setting.setFineRate(rs.getInt("fine_rate"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, "Error fetching settings", ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, "Error closing resources", ex);
            }
        }
        return setting;
    }

    // Update settings
    public static boolean updateSettings(String libraryName, String contactNumber, String libraryEmail, int maxBooks, int fineRate) {
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean success = false;

        try {
            con = Dbconnector.getConnection();
            String query = "UPDATE settings SET library_name=?, contact_number=?, library_email=?, max_books=?, fine_rate=?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, libraryName);
            pstmt.setString(2, contactNumber);
            pstmt.setString(3, libraryEmail);
            pstmt.setInt(4, maxBooks);
            pstmt.setInt(5, fineRate);

            int rs = pstmt.executeUpdate();
            success = rs > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, "Error updating settings", ex);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, "Error closing resources", ex);
            }
        }
        return success;
    }
}
