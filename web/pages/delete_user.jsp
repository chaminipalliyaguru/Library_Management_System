<%-- 
    Document   : delete_user
    Created on : Jan 2, 2025, 11:14:37 PM
    Author     : nadee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete User - Library Management System</title>
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
                <h2 style="margin: 0;">Delete User</h2>
                <a href="user_account.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Back to User Accounts</a>
            </div>

            <div style="background-color: white; padding: 20px; border-radius: 8px;">
                <form action="deleteuseraction.jsp" method="post">
                    <div style="margin-bottom: 20px;">
                        <p style="font-size: 16px; color: #e74c3c;">Are you sure you want to delete this user?</p>
                    </div>
                    <div style="background-color: #f9f9f9; padding: 15px; border: 1px solid #ddd; border-radius: 4px;">
                        <p><strong>ID:</strong> U001</p>
                        <p><strong>First Name:</strong> Nadeesh</p>
                        <p><strong>Last Name:</strong> Malaka</p>
                        <p><strong>Email:</strong> nadee@example.com</p>
                        <p><strong>Address:</strong> Piliyandala</p>
                        <p><strong>Mobile No:</strong> 0774902773</p>
                    </div>
                    <input type="hidden" name="userId" value="U001">
                    <div style="margin-top: 20px; text-align: right;">
                        <button type="submit" style="background-color: #e74c3c; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;">Delete</button>
                        <a href="user_account.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Cancel</a>
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