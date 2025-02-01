<%-- 
    Document   : transaction_details
    Created on : Jan 8, 2025, 11:03:09 AM
    Author     : nadee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Transaction Details - Library Management System</title>
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
                    <h2 style="margin: 0;">Transaction Details</h2>
                    <a href="transaction.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Back to Transactions</a>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <!-- Transaction Details -->
                    <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 20px;">
                        <!-- Transaction ID -->
                        <div>
                            <label style="display: block; font-weight: bold; margin-bottom: 5px;">Transaction ID:</label>
                            <p style="background-color: #f5f5f5; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">T001</p>
                        </div>

                        <!-- User ID -->
                        <div>
                            <label style="display: block; font-weight: bold; margin-bottom: 5px;">User ID:</label>
                            <p style="background-color: #f5f5f5; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">U001</p>
                        </div>

                        <!-- Book ID -->
                        <div>
                            <label style="display: block; font-weight: bold; margin-bottom: 5px;">Book ID:</label>
                            <p style="background-color: #f5f5f5; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">B001</p>
                        </div>

                        <!-- Quantity -->
                        <div>
                            <label style="display: block; font-weight: bold; margin-bottom: 5px;">Quantity:</label>
                            <p style="background-color: #f5f5f5; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">1</p>
                        </div>

                        <!-- Transaction Date -->
                        <div>
                            <label style="display: block; font-weight: bold; margin-bottom: 5px;">Transaction Date:</label>
                            <p style="background-color: #f5f5f5; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">2025-01-01</p>
                        </div>

                        <!-- Status -->
                        <div>
                            <label style="display: block; font-weight: bold; margin-bottom: 5px;">Status:</label>
                            <p style="background-color: #f5f5f5; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">Borrowed</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <footer style="background-color: #2c3e50; color: white; text-align: center; padding: 15px;">
            Library System © All rights reserved 2025
        </footer>
    </body>
</html>

