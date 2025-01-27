<%-- 
    Document   : add_book
    Created on : Jan 27, 2025
    Author     : chathuranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add New Book - Library Management System</title>
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
                    <h2 style="margin: 0;">Add New Book</h2>
                    <a href="book.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Back to Books</a>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <form action="addnewbook.jsp" method="post">
                        <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 20px;">
                            <div>
                                <label for="title" style="display: block; margin-bottom: 5px;">Title</label>
                                <input type="text" id="title" name="title" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="author" style="display: block; margin-bottom: 5px;">Author</label>
                                <input type="text" id="author" name="author" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="description" style="display: block; margin-bottom: 5px;">Description</label>
                                <textarea id="description" name="description" rows="3" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;"></textarea>
                            </div>
                            <div>
                                <label for="category" style="display: block; margin-bottom: 5px;">Category</label>
                                <select id="category" name="category" required>
                                    <option value="" disabled selected>Select a category</option>
                                    <option value="fiction">Fiction</option>
                                    <option value="non-fiction">Non-fiction</option>
                                    <option value="science">Science</option>
                                    <option value="history">History</option>
                                    <option value="technology">Technology</option>
                                    <option value="others">Others</option>
                                </select>
                            </div>

                            <div>
                                <label for="qty" style="display: block; margin-bottom: 5px;">Quantity</label>
                                <input type="number" min="1" id="qty"  name="qty" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="bookstatus" style="display: block; margin-bottom: 5px;">Status</label>
                                <select id="bookstatus" name="bookstatus" required>
                                    <option value="" disabled selected>Select an status</option>
                                    <option value="Available">Available</option>
                                    <option value="Not-Available">Not-Available</option>
                                    <option value="Pending">Pending</option>
                                </select>
                            </div>
                        </div>
                        <div style="margin-top: 20px; text-align: right;">
                            <button type="submit" style="background-color: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;">Save</button>
                            <button type="reset" style="background-color: #e74c3c; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;">Reset</button>
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
