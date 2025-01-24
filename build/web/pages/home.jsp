<%-- 
    Document   : home
    Created on : Jan 1, 2025, 2:53:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Library Management System</title>
    </head>
    <body style="margin: 0; font-family: Arial, sans-serif;">
        <nav style="background-color: #2c3e50; padding: 15px; color: white;">
            <a href="home.jsp">
                <img src="../images/Logo.png" width="175px">   
            </a>
        </nav>

        <div style="display: flex; min-height: calc(100vh - 120px);">
            <!-- Sidebar -->
            <%@include file="header.jsp" %>

            <!-- Main Content -->
            <div style="flex-grow: 1; padding: 20px; background-color: #f5f6fa;">
                <div style="margin-bottom: 20px;">
                    <img src="../images/BGimage_enhanced.jpeg" style="width: 100%; height: 300px; object-fit: cover; border-radius: 8px;">
                </div>

                <!-- Dashboard Cards -->
                <div style="display: grid; grid-template-columns: repeat(4, 1fr); gap: 20px;">
                    <div style="background-color: #3498db; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Total Books</h3>
                        <p style="font-size: 24px; margin: 10px 0;">1,234</p>
                    </div>
                    <div style="background-color: #2ecc71; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Available Books</h3>
                        <p style="font-size: 24px; margin: 10px 0;">1,100</p>
                    </div>
                    <div style="background-color: #e74c3c; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Borrowed Books</h3>
                        <p style="font-size: 24px; margin: 10px 0;">134</p>
                    </div>
                    <div style="background-color: #f1c40f; color: white; padding: 20px; border-radius: 8px;">
                        <h3 style="margin: 0;">Total Members</h3>
                        <p style="font-size: 24px; margin: 10px 0;">567</p>
                    </div>
                </div>
            </div>
        </div>

        <footer style="background-color: #2c3e50; color: white; text-align: center; padding: 15px;">
            Library System © All rights reserved 2025
        </footer>
    </body>
</html>