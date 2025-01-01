<%-- 
    Document   : header
    Created on : Jan 1, 2025, 3:02:24 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Library Management System</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="style.css" rel="stylesheet">
        
    </head>
    <body>
        <div style="width: 250px; background-color: #34495e; padding: 20px; color: white;">
            <div style="text-align: center; margin-bottom: 20px;">
<!--                <img src="/api/placeholder/100/100" style="border-radius: 50%; width: 100px; height: 100px;">-->
                <h3 style="margin: 10px 0;">Administrator</h3>
            </div>
            <div style="display: flex; flex-direction: column;">
                <a href="home.jsp" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0; background-color: #2c3e50;">Home</a>
                <a href="account.jsp" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0;">Accounts</a>
                <a href="book.jsp" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0;">Books</a>
                <a href="transaction.jsp" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0;">Transactions</a>
                <a href="settings.html" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0;">Settings</a>
            </div>
        </div>
    </body>
</html>
