<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Return Transaction - Library Management System</title>
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
                    <h2 style="margin: 0;">Return Transaction</h2>
                    <a href="transaction.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Back to Transactions</a>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <form action="updatetransaction.jsp" method="post">
                        <!-- Transaction Details -->
                        <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 20px; margin-bottom: 20px;">
                            <!-- Transaction ID (Read-Only) -->
                            <div>
                                <label for="transactionID" style="display: block; margin-bottom: 5px;">Transaction ID</label>
                                <input type="text" id="transactionID" name="transactionID" value="T001" readonly style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px; background-color: #f5f5f5;">
                            </div>

                            <!-- User ID (Read-Only) -->
                            <div>
                                <label for="userID" style="display: block; margin-bottom: 5px;">User ID</label>
                                <input type="text" id="userID" name="userID" value="U001" readonly style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px; background-color: #f5f5f5;">
                            </div>

                            <!-- Book ID (Read-Only) -->
                            <div>
                                <label for="bookID" style="display: block; margin-bottom: 5px;">Book ID</label>
                                <input type="text" id="bookID" name="bookID" value="B001" readonly style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px; background-color: #f5f5f5;">
                            </div>

                            <!-- Quantity (Read-Only) -->
                            <div>
                                <label for="qty" style="display: block; margin-bottom: 5px;">Quantity</label>
                                <input type="number" id="qty" name="qty" value="1" readonly style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px; background-color: #f5f5f5;">
                            </div>

                            <!-- Transaction Date -->
                            <div>
                                <label for="transactionDate" style="display: block; margin-bottom: 5px;">Transaction Date</label>
                                <input type="date" id="transactionDate" name="transactionDate" value="2025-01-01" style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>

                            <!-- Status -->
                            <div>
                                <label for="status" style="display: block; margin-bottom: 5px;">Status</label>
                                <select id="status" name="status" style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                                    
                                    <option value="Returned">Returned</option>
                                </select>
                            </div>
                        </div>

                        <!-- Submit and Cancel Buttons -->
                        <div style="text-align: right;">
                            <button type="submit" style="background-color: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;">Update</button>
                            <a href="transaction.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px; margin-left: 10px;">Cancel</a>
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
