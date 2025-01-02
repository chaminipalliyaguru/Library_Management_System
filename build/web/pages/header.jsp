<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // Get the current page name from the request URI
    String currentPage = request.getRequestURI();
%>
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
                <h3 style="margin: 10px 0;">Administrator</h3>
            </div>
            <div style="display: flex; flex-direction: column;">
                <a href="home.jsp" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0; background-color: <%= currentPage.contains("home.jsp") ? "#2c3e50" : "transparent" %>;">Home</a>
                <a href="account.jsp" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0; background-color: <%= currentPage.contains("account.jsp") ? "#2c3e50" : "transparent" %>;">Accounts</a>
                <a href="book.jsp" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0; background-color: <%= currentPage.contains("book.jsp") ? "#2c3e50" : "transparent" %>;">Books</a>
                <a href="transaction.jsp" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0; background-color: <%= currentPage.contains("transaction.jsp") ? "#2c3e50" : "transparent" %>;">Transactions</a>
                <a href="setting.jsp" style="color: white; text-decoration: none; padding: 10px; margin: 5px 0; background-color: <%= currentPage.contains("setting.jsp") ? "#2c3e50" : "transparent" %>;">Settings</a>
            </div>
        </div>
    </body>
</html>
