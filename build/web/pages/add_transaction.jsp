<%-- 
    Document   : add_transaction
    Created on : Jan 5, 2025
    Author     : chathuranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <form action="addtransactionaction.jsp" method="post">
                        <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 20px;">
                            <div>
                                <label for="userID" style="display: block; margin-bottom: 5px;">User ID</label>
                                <input type="text" id="userID" name="userID" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="bookID" style="display: block; margin-bottom: 5px;">Book ID</label>
                                    <input type="text" id="bookID" name="bookID" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                                    </div>
                                    <div>
                                        <label for="qty" style="display: block; margin-bottom: 5px;">Quantity</label>
                                        <input type="number" min="1" id="qty"  name="qty" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                                    </div>
                                    <div>
                                        <label for="date" style="display: block; margin-bottom: 5px;">Date</label>
                                        <input type="date" id="date" name="date" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;" required>
                                    </div>
                            
                                    <div>
                                <label for="status" style="display: block; margin-bottom: 5px;">Status</label>
                                <select id="status" name="status" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                                    <option value="Borrow">Borrow</option>
                                   
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
