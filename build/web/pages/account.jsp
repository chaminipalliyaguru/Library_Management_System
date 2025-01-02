<%-- 
    Document   : account
    Created on : Jan 1, 2025, 2:52:36 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Accounts - Library Management System</title>
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
                <h2 style="margin: 0;">User Accounts</h2>
                <button style="background-color: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;">Add New User</button>
            </div>

            <div style="background-color: white; padding: 20px; border-radius: 8px; margin-bottom: 20px;">
                <div style="display: grid; grid-template-columns: 2fr 1fr 1fr 1fr; gap: 10px;">
                    <input type="text" placeholder="Search users..." style="padding: 8px; border: 1px solid #ddd; border-radius: 4px;">
                    <select style="padding: 8px; border: 1px solid #ddd; border-radius: 4px;">
                        <option>All Roles</option>
                        <option>Student</option>
                        <option>Faculty</option>
                    </select>
                    <select style="padding: 8px; border: 1px solid #ddd; border-radius: 4px;">
                        <option>All Status</option>
                        <option>Active</option>
                        <option>Inactive</option>
                    </select>
                    <button style="background-color: #7f8c8d; color: white; border: none; padding: 8px; border-radius: 4px; cursor: pointer;">Filter</button>
                </div>
            </div>

            <div style="background-color: white; padding: 20px; border-radius: 8px;">
                <table style="width: 100%; border-collapse: collapse;">
                    <thead>
                        <tr style="background-color: #f8f9fa;">
                            <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">ID</th>
                            <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Name</th>
                            <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Email</th>
                            <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Role</th>
                            <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Status</th>
                            <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td style="padding: 12px; border-bottom: 1px solid #ddd;">U001</td>
                            <td style="padding: 12px; border-bottom: 1px solid #ddd;">John Doe</td>
                            <td style="padding: 12px; border-bottom: 1px solid #ddd;">john@example.com</td>
                            <td style="padding: 12px; border-bottom: 1px solid #ddd;">Student</td>
                            <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                <span style="background-color: #2ecc71; color: white; padding: 4px 8px; border-radius: 4px;">Active</span>
                            </td>
                            <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                <button style="background-color: #3498db; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;">Edit</button>
                                <button style="background-color: #e74c3c; color: white; border: none; padding: 5px 10px; border-radius: 4px; cursor: pointer;">Delete</button>
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