<%-- 
    Document   : book
    Created on : Jan 1, 2025, 9:55:25 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Books - Library Management System</title>
    </head>
    <body style="margin: 0; font-family: Arial, sans-serif;">
        <!-- Same nav as index.html -->
        <nav style="background-color: #2c3e50; padding: 15px; color: white;">
            <a href="home.jsp">
                <img src="../images/Logo.png" width="175px">   
            </a>
        </nav>

        <div style="display: flex; min-height: calc(100vh - 120px);">
            <!-- Same sidebar as index.html -->
            <%@include file="header.jsp" %>
            <!-- Sidebar content -->


            <!-- Main Content -->
            <div style="flex-grow: 1; padding: 20px; background-color: #f5f6fa;">
                <div style="display: flex; justify-content: space-between; margin-bottom: 20px;">
                    <h2 style="margin: 0;">Books Management</h2>
                    <button style="background-color: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;">Add New Book</button>
                </div>

                <!-- Search Bar -->
                <div style="background-color: white; padding: 20px; border-radius: 8px; margin-bottom: 20px;">
                    <div style="display: grid; grid-template-columns: 2fr 1fr 1fr 1fr; gap: 10px;">
                        <input type="text" placeholder="Search books..." style="padding: 8px; border: 1px solid #ddd; border-radius: 4px;">
                        <select style="padding: 8px; border: 1px solid #ddd; border-radius: 4px;">
                            <option>All Categories</option>
                            <option>Fiction</option>
                            <option>Non-Fiction</option>
                        </select>
                        <select style="padding: 8px; border: 1px solid #ddd; border-radius: 4px;">
                            <option>All Status</option>
                            <option>Available</option>
                            <option>Borrowed</option>
                        </select>
                        <button style="background-color: #7f8c8d; color: white; border: none; padding: 8px; border-radius: 4px; cursor: pointer;">Filter</button>
                    </div>
                </div>

                <!-- Books Table -->
                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <table style="width: 100%; border-collapse: collapse;">
                        <thead>
                            <tr style="background-color: #f8f9fa;">
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Book ID</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Title</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Author</th>
                                <th style="justify-content: center; padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Description</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Category</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Qty</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Status</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">B001</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">The Great Gatsby</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">F. Scott Fitzgerald</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd; width: 300px;
            height: 100px;
            overflow: auto;
            word-wrap: break-word;
            white-space: normal;
">set in the 1920s, follows millionaire Jay Gatsby’s pursuit of his lost love, Daisy Buchanan. Narrated by Nick Carraway, it explores themes of love, ambition, and the American Dream against the backdrop of the glittering yet hollow Jazz Age.</td>                            
                                <td style="padding: 12px; border-bottom: 1px solid #ddd; ">Fiction</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">10</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <span style="background-color: #2ecc71; color: white; padding: 4px 8px; border-radius: 4px;">Available</span>
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
    </div>

    <footer style="background-color: #2c3e50; color: white; text-align: center; padding: 15px;">
        Library System © All rights reserved 2025
    </footer>
</body>
</html>