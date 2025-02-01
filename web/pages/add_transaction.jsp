<%-- 
    Document   : add_transaction
    Created on : Jan 5, 2025
    Author     : chathuranga
--%>

<%@page import="java.util.Date"%>  <!-- Add this import -->
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="library.classes.Transaction"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getMethod().equals("POST")) {
        try {
            // Get form parameters
            int userId = Integer.parseInt(request.getParameter("userId")); // Changed to match form
            int bookId = Integer.parseInt(request.getParameter("bookId")); // Changed to match form
            int quantity = Integer.parseInt(request.getParameter("quantity")); // Changed to match form

            // Parse date from HTML date input
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Changed format to match HTML date input
            Date date = dateFormat.parse(request.getParameter("date"));

            String status = request.getParameter("status");

            // Create Transaction object
            Transaction transaction = new Transaction();
            transaction.setUserId(userId);
            transaction.setBookId(bookId);
            transaction.setQuantity(quantity);
            transaction.setDate(new java.sql.Date(date.getTime())); // Convert to SQL Date
            transaction.setStatus(status);

            // Save to database
            boolean success = transaction.addTransaction(transaction);

            if (success) {
                response.sendRedirect("transaction.jsp?success=true"); // Changed to match your back button link
            } else {
                response.sendRedirect("add_transaction.jsp?error=true");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("add_transaction.jsp?error=true");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Transaction - Library Management System</title>
    </head>
    <body style="margin: 0; font-family: Arial, sans-serif;">
        <nav style="background-color: #2c3e50; padding: 15px; color: white;">
            <a href="home.jsp">
                <img src="../images/Logo.png" width="175px">
            </a>
        </nav>

        <div style="display: flex; min-height: calc(100vh - 120px);">
           <%@include file="header.jsp" %>

            <div style="flex-grow: 1; padding: 20px; background-color: #f5f6fa;">
                <div style="display: flex; justify-content: space-between; margin-bottom: 20px;">
                    <h2 style="margin: 0;">Add New Transaction</h2>
                    <a href="transaction.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Back to Transactions</a>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <form action="add_transaction.jsp" method="post">
                        <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 20px;">
                            <div>
                                <label for="userID" style="display: block; margin-bottom: 5px;">User ID</label>
                                <input type="text" id="userID" name="userId" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="bookID" style="display: block; margin-bottom: 5px;">Book ID</label>
                                <input type="text" id="bookID" name="bookId" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="qty" style="display: block; margin-bottom: 5px;">Quantity</label>
                                <input type="number" min="1" id="qty"  name="quantity" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="date" style="display: block; margin-bottom: 5px;">Date</label>
                                <input type="date" id="date" name="date" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;" required>
                            </div>

                            <div>
                                <label for="status" style="display: block; margin-bottom: 5px;">Status</label>
                                <select id="status" name="status" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                                    <option value="Borrow">Borrow</option>
                                    <option value="Return">Return</option>


                                </select>
                            </div>
                        </div>
                        <div style="margin-top: 20px; text-align: right;">
                            <button type="submit" style="background-color: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;">Save</button>
                            <button type="reset" style="background-color: #e74c3c; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;">Reset</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <footer style="background-color: #2c3e50; color: white; text-align: center; padding: 15px;">
            Library System © All rights reserved 2025
        </footer>
    </body>
</html>
