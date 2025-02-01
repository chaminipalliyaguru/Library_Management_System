<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="library.classes.Setting"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Library Management System - Settings</title>
        <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: Arial, sans-serif;
            }

            body {
                background-color: #f5f5f5;
            }

            .container {
                max-width: 1200px;
                margin: 0 auto;
                padding: 20px;
            }

            .settings-header {
                background-color: #2c3e50;
                color: white;
                padding: 20px;
                border-radius: 8px 8px 0 0;
            }

            .settings-content {
                background-color: white;
                padding: 30px;
                border-radius: 0 0 8px 8px;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            }

            .settings-section {
                margin-bottom: 30px;
            }

            .settings-section h2 {
                color: #2c3e50;
                margin-bottom: 20px;
                padding-bottom: 10px;
                border-bottom: 2px solid #eee;
            }

            .form-group {
                margin-bottom: 20px;
            }

            .form-group label {
                display: block;
                margin-bottom: 8px;
                color: #333;
                font-weight: bold;
            }

            .form-group input[type="text"],
            .form-group input[type="email"],
            .form-group input[type="number"],
            .form-group select {
                width: 100%;
                padding: 10px;
                border: 1px solid #ddd;
                border-radius: 4px;
                font-size: 16px;
            }

            .form-group select {
                background-color: white;
            }

            .btn {
                background-color: #2c3e50;
                color: blue;
                padding: 12px 24px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                font-size: 16px;
                transition: background-color 0.3s;
                display: inline-block;
                margin-top: 20px;
            }

            .btn:hover {
                background-color: #1976D2;
            }

            .alert {
                padding: 15px;
                margin-bottom: 20px;
                border-radius: 4px;
            }

            .alert-success {
                background-color: #d4edda;
                color: #155724;
                border: 1px solid #c3e6cb;
            }

            .alert-danger {
                background-color: #f8d7da;
                color: #721c24;
                border: 1px solid #f5c6cb;
            }

            nav {
                background-color: #2c3e50;
                padding: 15px;
                color: white;
            }

            footer {
                background-color: #2c3e50;
                color: white;
                text-align: center;
                padding: 15px;
                position: relative;
                bottom: 0;
                width: 100%;
            }

            /* Added responsive design */
            @media (max-width: 768px) {
                .container {
                    padding: 10px;
                }

                .settings-content {
                    padding: 20px;
                }

                .btn {
               width: 100%;
            
            }
        </style>
    </head>
    <body>
        <nav>
            <a href="home.jsp">
                <img src="../images/Logo.png" width="175px" alt="Library Logo">   
            </a>
        </nav>

        <div style="display: flex; min-height: calc(100vh - 120px);">
            <%@include file="header.jsp" %>

            <%
                // Get current settings
                Setting currentSettings = Setting.getCurrentSettings();
                
                // Handle form submission
                String message = "";
                if ("POST".equalsIgnoreCase(request.getMethod())) {
                    try {
                        String libraryName = request.getParameter("library-name");
                        String contactNumber = request.getParameter("contact-number");
                        String libraryEmail = request.getParameter("library-email");
                        int maxBooks = Integer.parseInt(request.getParameter("max-books"));
                        int fineRate = Integer.parseInt(request.getParameter("fine-rate"));
                        
                        if (Setting.updateSettings(libraryName, contactNumber, libraryEmail, maxBooks, fineRate)) {
                            message = "Settings updated successfully!";
                            currentSettings = Setting.getCurrentSettings(); // Refresh settings
                        } else {
                            message = "Error updating settings. Please try again.";
                        }
                    } catch (NumberFormatException e) {
                        message = "Please enter valid numbers for maximum books and fine rate.";
                    }
                }
            %>

            <div class="container">
                <div class="settings-header">
                    <h1>Library Management System Settings</h1>
                </div>
                <div class="settings-content">
                    <% if (!message.isEmpty()) { %>
                        <div class="alert <%= message.contains("Error") || message.contains("Please enter valid") ? "alert-danger" : "alert-success" %>">
                            <%= message %>
                        </div>
                    <% } %>

                    <form method="POST" action="setting.jsp">
                        <div class="settings-section">
                            <h2>General Settings</h2>
                            <div class="form-group">
                                <label for="library-name">Library Name</label>
                                <input type="text" id="library-name" name="library-name" 
                                       value="<%= currentSettings.getLibraryName() != null ? currentSettings.getLibraryName() : "" %>" 
                                       required>
                            </div>

                            <div class="form-group">
                                <label for="contact-number">Library Contact Number</label>
                                <input type="text" id="contact-number" name="contact-number" 
                                       value="<%= currentSettings.getContactNumber() != null ? currentSettings.getContactNumber() : "" %>" 
                                       required pattern="[\+]?[0-9\s\-]{10,}" title="Please enter a valid phone number">
                            </div>

                            <div class="form-group">
                                <label for="library-email">Library Email</label>
                                <input type="email" id="library-email" name="library-email" 
                                       value="<%= currentSettings.getLibraryEmail() != null ? currentSettings.getLibraryEmail() : "" %>" 
                                       required>
                            </div>

                            <div class="form-group">
                                <label for="max-books">Maximum Books Per User</label>
                                <input type="number" id="max-books" name="max-books" 
                                       value="<%= currentSettings.getMaxBooks() %>" 
                                       required min="1">
                            </div>

                            <div class="form-group">
                                <label for="fine-rate">Late Return Fine Rate (per day)</label>
                                <input type="number" id="fine-rate" name="fine-rate" 
                                       value="<%= currentSettings.getFineRate() %>" 
                                       required min="0">
                            </div>
                                       
                        </div>
                                       
                        <button type="submit" class="btn">Save Settings</button>
                                       
                    </form>
                </div>
            </div>
        </div>
        <footer>
            Library System © All rights reserved 2025
        </footer>
    </body>
</html>