<%-- 
    Document   : home
    Created on : Dec 5, 2024, 7:18:23 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Library System</title>
        <style>
            body{
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
            }
            
            .container{
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }
            
            .navbar{
                background-color: white;
                padding: 10px 20px;
                border-bottom: 1px solid #ddd;
                display: flex;
                align-items: center;
            }
            
            .navbar img{
                height: 40px;
                margin-right: 10px; 
            }
        </style>
    </head>
    <body style="background-image: url('../images/background.jpg'); background-size: cover; ">
        <div class='navbar'>
            <img src="../images/Logo.png">
        </div>
        <div class='container'>
            <h1>Login</h1>
        </div>
    </body>
</html>
