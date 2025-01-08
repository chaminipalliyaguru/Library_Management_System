<%-- 
    Document   : transaction
    Created on : Jan 5, 2025, 2:51:04 PM
    Author     : chathuranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Transactions - Library Management System</title>
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
                    <h2 style="margin: 0;">Transactions</h2>
                    <a href="add_transaction.jsp" style="background-color: #3498db; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Add Transaction</a>
                </div>

                <div style="display: grid; grid-template-columns: repeat(4, 1fr); gap: 20px; margin-bottom: 20px;">
                    <div style="background-color: #3498db; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Today's Borrows</h3>
                        <p style="font-size: 24px; margin: 10px 0;">15</p>
                    </div>
                    <div style="background-color: #2ecc71; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Today's Returns</h3>
                        <p style="font-size: 24px; margin: 10px 0;">12</p>
                    </div>
                    <div style="background-color: #f1c40f; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Overdue Books</h3>
                        <p style="font-size: 24px; margin: 10px 0;">8</p>
                    </div>
                    <div style="background-color: #e74c3c; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Total Fines</h3>
                        <p style="font-size: 24px; margin: 10px 0;">$45.00</p>
                    </div>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <table style="width: 100%; border-collapse: collapse;">
                        <thead>
                            <tr style="background-color: #f8f9fa;">
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Transaction ID</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">User ID</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Book ID</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Qty</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Date</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Status</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">T001</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">U001</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">B001</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">1</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">2025-01-01</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <span style="background-color: #2ecc71; color: white; padding: 4px 8px; border-radius: 4px;">Borrow</span>
                                </td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <a href="return_transaction.jsp"> <button style="background-color: #2ecc71; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;">Return</button></a>
                                    <button style="background-color: #3498db; color: white; border: none; padding: 5px 10px; border-radius: 4px; cursor: pointer;">Details</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>


        <footer style="background-color: #2c3e50; color: white; text-align: center; padding: 15px;">
            Library System © All rights reserved 2025
        </footer>
    </body>
</html>