<%-- 
    Document   : setting
    Created on : Jan 2, 2025, 10:50:16 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

            .toggle-switch {
                position: relative;
                display: inline-block;
                width: 60px;
                height: 34px;
            }

            .toggle-switch input {
                opacity: 0;
                width: 0;
                height: 0;
            }

            .slider {
                position: absolute;
                cursor: pointer;
                top: 0;
                left: 0;
                right: 0;
                bottom: 0;
                background-color: #ccc;
                transition: .4s;
                border-radius: 34px;
            }

            .slider:before {
                position: absolute;
                content: "";
                height: 26px;
                width: 26px;
                left: 4px;
                bottom: 4px;
                background-color: white;
                transition: .4s;
                border-radius: 50%;
            }

            input:checked + .slider {
                background-color: #2196F3;
            }

            input:checked + .slider:before {
                transform: translateX(26px);
            }

            button.btn {
            background-color: #2196F3;
            color: white;
            padding: 12px 24px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
            display: inline-block;
            margin-top: 20px;
        }

        button.btn:hover {
            background-color: #1976D2;
        }
        </style>
    </head>
    <body style="margin: 0; font-family: Arial, sans-serif;">
        <nav style="background-color: #2c3e50; padding: 15px; color: white;">
            <a href="home.jsp">
                <img src="../images/Logo.png" width="175px">   
            </a>
        </nav>

        <div style="display: flex; min-height: calc(100vh - 120px);">
            <%@include file="header.jsp" %>



            <div class="container">
        <div class="settings-header">
            <h1>Library Management System Settings</h1>
        </div>
        <div class="settings-content">
            <form>
                <div class="settings-section">
                    <h2>General Settings</h2>
                    <div class="form-group">
                        <label for="library-name">Library Name</label>
                        <input type="text" id="library-name" value="Central Library">
                    </div>
                    <div class="form-group">
                        <label for="admin-email">Administrator Email</label>
                        <input type="email" id="admin-email" value="admin@library.com">
                    </div>
                </div>

               
                    <div class="form-group">
                        <label for="loan-period">Administrator Password</label>
                        <input type="number" id="loan-period" value="14">
                    </div>
                    <div class="form-group">
                        <label for="max-books">Maximum Books Per User</label>
                        <input type="number" id="max-books" value="5">
                    </div>
                    <div class="form-group">
                        <label for="fine-rate">Late Return Fine Rate (per day)</label>
                        <input type="number" id="fine-rate" value="1">
                    </div>
                </div>

                <div class="settings-section">
                    <h2>Notification Settings</h2>
                    <div class="form-group">
                        <label>Email Notifications</label>
                        <label class="toggle-switch">
                            <input type="checkbox" checked>
                            <span class="slider"></span>
                        </label>
                    </div>
                    <div class="form-group">
                        <label>SMS Notifications</label>
                        <label class="toggle-switch">
                            <input type="checkbox">
                            <span class="slider"></span>
                        </label>
                    </div>
                </div>

                <div class="settings-section">
                    <h2>System Settings</h2>
                    <div class="form-group">
                        <label for="language">System Language</label>
                        <select id="language">
                            <option value="en">English</option>
                            <option value="es">Spanish</option>
                            <option value="fr">French</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="timezone">Timezone</label>
                        <select id="timezone">
                            <option value="UTC">UTC</option>
                            <option value="EST">EST</option>
                            <option value="PST">PST</option>
                        </select>
                    </div>
                </div>

                <button type="submit" class="btn">Save Settings</button>
            </form>
        </div>
    </div>
        </div>
            <footer style="background-color: #2c3e50; color: white; text-align: center; padding: 15px;">
        Library System © All rights reserved 2025
    </footer>
    </body>
</html>