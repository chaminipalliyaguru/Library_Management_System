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
                margin: 150px 350px 10px 350px;
                background-color: white;
                display: flex;
                align-items:left;
                height: 40vh;

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

            .login-container {
                width: 300px;
                background: yellow;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
                text-align: center;
            }
            
            .login-container h1{
                margin-top: 50px;
            }


            .login-form label {
                display: block;
                text-align: left;
                
                margin-left: 60px;
                margin-top: 30px;
                font-size: 14px;
                color: #555;
            }

            .login-form input {
                width: 100%;
                padding: 8px;
                
                margin-left: 60px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }

            .login-btn {
                width: 105%;
                margin-left: 60px;
                margin-top: 30px;
                background-color: #007bff;
                color: #fff;
                border: none;
                padding: 10px;
                font-size: 16px;
                border-radius: 4px;
                cursor: pointer;
            }

            .login-btn:hover {
                background-color: #0056b3;
            }
            
            .login-container img{
                width: 200px;
            }
            
        </style>
    </head>
    <body style="background-image: url('../images/background.jpg'); background-size: cover; ">
        <div class='navbar'>
            <img src="../images/Logo.png">
        </div>
        <div class='container'>
            <div class="login-container">
                <img src="../images/Logo.png">
                <h1>Login Here..</h1>
            </div>
            <form class="login-form">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" placeholder="Enter username">

                <label for="password">Password:</label>
                <input type="password" id="password" name="password" placeholder="Enter password">

                <button type="submit" class="login-btn">Login</button>
            </form>
        </div>
    </body>
</html>