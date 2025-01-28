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
 * @author Chathu
 */
public class Book {

    private int book_id;
    private String title;
    private String author;
    private String description;
    private String category;
    private int qty;
    private String bookstatus;

    public Book() {
    }

    public Book(int book_id) {
        this.book_id = book_id;
    }

    public Book(String title, String author, String description, String category, int qty, String bookstatus) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
        this.qty = qty;
        this.bookstatus = bookstatus;
    }

    public Book(int book_id, String title, String author, String description, String category, int qty, String bookstatus) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
        this.qty = qty;
        this.bookstatus = bookstatus;
    }

    public Book(String title, String author, String description, String category, int qty, String bookstatus, int book_id) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
        this.qty = qty;
        this.bookstatus = bookstatus;
        this.book_id = book_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getQty() {
        return qty;
    }

    public String getBookstatus() {
        return bookstatus;
    }

    public boolean addbook() {
        Connection con = Dbconnector.getConnection();
        String query = "INSERT INTO Book (title, author,description, category, qty, bookstatus) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setString(3, description);
            pstmt.setString(4, category);
            pstmt.setInt(5, qty);
            pstmt.setString(6, bookstatus);

            int a = pstmt.executeUpdate();
            return a > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public List<Book> getAllBooks() {
        List<Book> bookList = new ArrayList<>();
        Connection con = Dbconnector.getConnection();

        String query = "SELECT * FROM Book";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Book book = new Book(
                        rs.getInt("book_id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("description"),
                        rs.getString("category"),
                        rs.getInt("qty"),
                        rs.getString("bookstatus")
                );
                bookList.add(book);
            }

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bookList;
    }

    public boolean updateBook() {
        Connection con = Dbconnector.getConnection();
        String query = "UPDATE Book SET title=?, author=?, description=?, category=?, qty=?, bookstatus=? WHERE book_id=?";

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setString(3, description);
            pstmt.setString(4, category);
            pstmt.setInt(5, qty);
            pstmt.setString(6, bookstatus);
            pstmt.setInt(7, book_id);

            int a = pstmt.executeUpdate();
            return a > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public boolean deleteBook() {
        Connection con = Dbconnector.getConnection();
        String query = "DELETE FROM Book WHERE book_id=?";

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, book_id);

            int a = pstmt.executeUpdate();
            return a > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public List<Book> getAllBooks(String category, String bookstatus) {
    List<Book> bookList = new ArrayList<>();
    Connection con = Dbconnector.getConnection();
    StringBuilder query = new StringBuilder("SELECT * FROM Book WHERE 1=1");

    // Append filters based on category and status
    if (category != null && !category.isEmpty()) {
        query.append(" AND category = ?");
    }
    if (bookstatus != null && !bookstatus.equals("All")) {
        query.append(" AND bookstatus = ?");
    }

    try {
        PreparedStatement pstmt = con.prepareStatement(query.toString());

        int index = 1;
        // Set parameters for category and status
        if (category != null && !category.isEmpty()) {
            pstmt.setString(index++, category);
        }
        if (bookstatus != null && !bookstatus.equals("All")) {
            pstmt.setString(index++, bookstatus);
        }

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Book book = new Book(
                rs.getInt("book_id"),
                rs.getString("title"),
                rs.getString("author"),
                rs.getString("description"),
                rs.getString("category"),
                rs.getInt("qty"),
                rs.getString("bookstatus")
            );
            bookList.add(book);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }
    return bookList;
}

public List<Book> searchBooks(String search, String category, String bookstatus) {
    List<Book> bookList = new ArrayList<>();
    Connection con = Dbconnector.getConnection();
    StringBuilder query = new StringBuilder("SELECT * FROM Book WHERE (title LIKE ? OR author LIKE ?)");

    // Append filters based on category and status
    if (category != null && !category.isEmpty()) {
        query.append(" AND category = ?");
    }
    if (bookstatus != null && !bookstatus.equals("All")) {
        query.append(" AND bookstatus = ?");
    }

    try {
        PreparedStatement pstmt = con.prepareStatement(query.toString());
        pstmt.setString(1, "%" + search + "%");
        pstmt.setString(2, "%" + search + "%");

        int index = 3; // Start setting parameters from the third position
        if (category != null && !category.isEmpty()) {
            pstmt.setString(index++, category);
        }
        if (bookstatus != null && !bookstatus.equals("All")) {
            pstmt.setString(index++, bookstatus);
        }

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Book book = new Book(
                rs.getInt("book_id"),
                rs.getString("title"),
                rs.getString("author"),
                rs.getString("description"),
                rs.getString("category"),
                rs.getInt("qty"),
                rs.getString("bookstatus")
            );
            bookList.add(book);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }
    return bookList;
}


    public Book getBookById() {
        Connection con = Dbconnector.getConnection();
        String query = "SELECT * FROM Book WHERE book_id=?";

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, book_id);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                this.title = rs.getString("title");
                this.author = rs.getString("author");
                this.description = rs.getString("description");
                this.category = rs.getString("category");
                this.qty = rs.getInt("qty");
                this.bookstatus = rs.getString("bookstatus");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }
    
    

}
