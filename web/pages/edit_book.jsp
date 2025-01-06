<%-- 
    Document   : edit_book
    Created on : Jan 5, 2025
    Author     : chathuranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Edit Book - Library Management System</title>
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
                    <h2 style="margin: 0;">Edit User</h2>
                    <a href="book.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Back to Books</a>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <form action="editbookaction.jsp" method="post">
                        <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 20px;">
                            <div>
                                <label for="title" style="display: block; margin-bottom: 5px;">Title</label>
                                <input type="text" id="title" name="title" value="The Great Gatsby" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="author" style="display: block; margin-bottom: 5px;">Author</label>
                                <input type="text" id="author" name="author" value="F. Scott Fitzgerald" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="description" style="display: block; margin-bottom: 5px;">Description</label>
                                <textarea id="description" name="description" rows="3" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">Set in the 1920s, follows millionaire Jay Gatsby’s pursuit of his lost love, Daisy Buchanan. Narrated by Nick Carraway, it explores themes of love, ambition, and the American Dream against the backdrop of the glittering yet hollow Jazz Age.</textarea>
                            </div>
                            <div>
                                <label for="category" style="display: block; margin-bottom: 5px;">Category</label>
                                <select id="category" name="category" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;" required>
                                    <option value="" disabled selected>Select a category</option>
                                    <option value="fiction" selected>Fiction</option>
                                    <option value="non-fiction">Non-fiction</option>
                                    <option value="science">Science</option>
                                    <option value="history">History</option>
                                    <option value="technology">Technology</option>
                                    <option value="others">Others</option>
                                </select>
                            </div>

                            <div>
                                <label for="qty" style="display: block; margin-bottom: 5px;">Quantity</label>
                                <input type="number" value="10" min="1" id="qty"  name="qty" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
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
