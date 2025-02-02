<%@page import="library.classes.Transaction"%>
<%@page import="java.util.List"%>
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

                <br><br>

                <!-- Statistics Section -->
                <div style="display: grid; grid-template-columns: repeat(4, 1fr); gap: 20px; margin-bottom: 20px;">
                    <div style="background-color: #3498db; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Today's Borrows</h3>
                        <p style="font-size: 24px; margin: 10px 0;"><%= Transaction.getTodaysBorrows()%></p>
                    </div>
                    <div style="background-color: #2ecc71; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Today's Returns</h3>
                        <p style="font-size: 24px; margin: 10px 0;"><%= Transaction.getTodaysReturns()%></p>
                    </div>
                    <div style="background-color: #f1c40f; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Overdue Books</h3>
                        <p style="font-size: 24px; margin: 10px 0;"><%= Transaction.getOverdueBooks()%></p>
                    </div>
                </div>
                <br><br><br>

                <!-- Search Form -->
                <div style="margin-bottom: 20px;">
                    <form action="transaction.jsp" method="GET" style="display: flex; gap: 10px;">
                        <input 
                            type="text" 
                            name="searchBookId" 
                            placeholder="Enter Book ID to search" 
                            style="padding: 8px; border: 1px solid #ddd; border-radius: 4px; flex-grow: 1;"
                            value="<%= request.getParameter("searchBookId") != null ? request.getParameter("searchBookId") : ""%>"
                            />
                        <button 
                            type="submit" 
                            style="background-color: #3498db; color: white; border: none; padding: 8px 16px; border-radius: 4px; cursor: pointer;"
                            >
                            Search
                        </button>
                        <a 
                            href="transaction.jsp" 
                            style="background-color: #e74c3c; color: white; text-decoration: none; padding: 8px 16px; border-radius: 4px;"
                            >
                            Clear
                        </a>
                    </form>
                </div>

                <br><br>

                <!-- Transactions Table -->
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
                            <%
                                List<Transaction> transactions;
                                String searchBookId = request.getParameter("searchBookId");
                                if (searchBookId != null && !searchBookId.isEmpty()) {
                                    // Fetch transactions by Book ID
                                    transactions = Transaction.searchTransactionsByBookId(Integer.parseInt(searchBookId));
                                } else {
                                    // Fetch all transactions
                                    transactions = Transaction.getAllTransactions();
                                }

                                for (Transaction transaction : transactions) {
                            %>
                            <tr>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= transaction.getTransactionId()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= transaction.getUserId()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= transaction.getBookId()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= transaction.getQuantity()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= transaction.getDate()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <span style="background-color: #2ecc71; color: white; padding: 4px 8px; border-radius: 4px;"><%= transaction.getStatus()%></span>
                                </td>
                                <!-- Inside the table body, where the Actions column is defined -->
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <% if (!"Return".equals(transaction.getStatus())) {%>
                                    <a href="return_transaction.jsp?transactionId=<%= transaction.getTransactionId()%>"> 
                                        <button style="background-color: #2ecc71; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;">Return</button>
                                    </a>
                                    <% } else {%>
                                    <button 
                                        style="background-color: #e74c3c; color: white; border: none; padding: 5px 10px; border-radius: 4px; cursor: pointer;" 
                                        onclick="confirmDelete('<%= transaction.getTransactionId()%>')">
                                        Delete
                                    </button>
                                    <% } %>
                                </td>
                            </tr>
                            <% }%>
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