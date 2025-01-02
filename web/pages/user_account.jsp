<%-- 
    Document   : user_account
    Created on : Jan 2, 2025, 11:06:45 PM
    Author     : nadee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>User Accounts - Library Management System</title>
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
                    <a href="adduser.jsp" style="background-color: #3498db; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Add New User</a>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px; margin-bottom: 20px;">
                    <div style="display: grid; grid-template-columns: 2fr 1fr 1fr 1fr; gap: 10px;">
                        <input type="text" placeholder="Search users..." style="padding: 8px; border: 1px solid #ddd; border-radius: 4px;">
                        <select style="padding: 8px; border: 1px solid #ddd; border-radius: 4px;">

                            <option>Student</option>

                        </select>

                        <button style="align-content:Left; background-color: #7f8c8d; color: white; border: none; padding: 8px; border-radius: 4px; cursor: pointer;">Filter</button>
                    </div>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <table style="width: 100%; border-collapse: collapse;">
                        <thead>
                            <tr style="background-color: #f8f9fa;">
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">ID</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">First Name</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Last Name</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Email</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Address</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Role</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Mobile No</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">U001</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">Nadeesh</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">Malaka</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">nadee@example.com</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">Piliyandala</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">Student</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">0774902773</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <button style="background-color: #3498db; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;">
                                        <a href="edit_user.jsp?id=U001" style="color: white; text-decoration: none;">Edit</a>
                                    </button>
                                    <button style="background-color: #e74c3c; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;">
                                        <a href="delete_user.jsp?id=U001" style="color: white; text-decoration: none;">Delete</a>
                                    </button>

                                </td>


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