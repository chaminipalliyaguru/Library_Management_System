package library.classes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class Transaction {
    private int transactionId; 
    private int userId;
    private int bookId;
    private int quantity;
    private Date date;
    private String status;

    // Getters and Setters for all fields
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to fetch all transactions
    public static List<Transaction> getAllTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        Connection con = Dbconnector.getConnection();
        String query = "SELECT * FROM transaction";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Transaction transaction = new Transaction();
                transaction.setTransactionId(rs.getInt("transaction_id"));
                transaction.setUserId(rs.getInt("user_id"));
                transaction.setBookId(rs.getInt("book_id"));
                transaction.setQuantity(rs.getInt("quantity"));
                transaction.setDate(rs.getDate("transaction_date"));
                transaction.setStatus(rs.getString("status"));
                transactions.add(transaction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return transactions;
    }

    // Existing addTransaction method
    public boolean addTransaction(Transaction transaction) {
        Connection con = Dbconnector.getConnection();
        String query = "INSERT INTO transaction (user_id, book_id, quantity, transaction_date, status) " +
                "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, transaction.getUserId());
            pstmt.setInt(2, transaction.getBookId());
            pstmt.setInt(3, transaction.getQuantity());
            pstmt.setDate(4, transaction.getDate());
            pstmt.setString(5, transaction.getStatus());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Method to get today's borrows
    public static int getTodaysBorrows() {
        Connection con = Dbconnector.getConnection();
        String query = "SELECT COUNT(*) AS borrows FROM transaction WHERE status = 'Borrow' AND transaction_date = CURDATE()";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("borrows");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    // Method to get today's returns
    public static int getTodaysReturns() {
        Connection con = Dbconnector.getConnection();
        String query = "SELECT COUNT(*) AS returns FROM transaction WHERE status = 'Return' AND transaction_date = CURDATE()";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("returns");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
    
    // Method to get overdue books
    public static int getOverdueBooks() {
        Connection con = Dbconnector.getConnection();
        String query = "SELECT COUNT(*) AS overdue FROM transaction WHERE status = 'Borrow' AND transaction_date < CURDATE()";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("overdue");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
    
    public static List<Transaction> searchTransactionsByBookId(int bookId) {
    List<Transaction> transactions = new ArrayList<>();
    Connection con = Dbconnector.getConnection();
    String query = "SELECT * FROM transaction WHERE book_id = ?";
    try {
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, bookId);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Transaction transaction = new Transaction();
            transaction.setTransactionId(rs.getInt("transaction_id"));
            transaction.setUserId(rs.getInt("user_id"));
            transaction.setBookId(rs.getInt("book_id"));
            transaction.setQuantity(rs.getInt("quantity"));
            transaction.setDate(rs.getDate("transaction_date"));
            transaction.setStatus(rs.getString("status"));
            transactions.add(transaction);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return transactions;
}
    
    public static boolean updateTransactionStatus(int transactionId, String status) {
    Connection con = Dbconnector.getConnection();
    String query = "UPDATE transaction SET status = ? WHERE transaction_id = ?";
    try {
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, status);
        pstmt.setInt(2, transactionId);
        int rowsAffected = pstmt.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}