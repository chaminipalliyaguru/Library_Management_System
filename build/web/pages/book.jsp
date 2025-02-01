<%-- 
    Document   : book
    Created on : Jan 27, 2025
    Author     : Chathuranga
--%>
<%@page import="java.util.List"%>
<%@page import="library.classes.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Books - Library Management System</title>
        <%
            String status = request.getParameter("s");
            if (status != null) {
        %>
        <script>
            <% if ("0".equals(status)) { %>
            window.alert("Successfully added book");
            <% } else if ("2".equals(status)) { %>
            window.alert("Successfully updated book");
            <% } else if ("3".equals(status)) { %>
            window.alert("Successfully deleted book");
            <% } else { %>
            window.alert("Error");
            <% } %>
        </script>
        <%
            }
        %>

        <script>
            function confirmDelete(bookId) {
                if (confirm("Are you sure you want to delete this book? This action cannot be undone.")) {
                    window.location.href = 'delete_book.jsp?bookId=' + bookId;
                }
            }
        </script>
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
                    <h2 style="margin: 0;">Books</h2>
                    <a href="add_book.jsp" style="background-color: #3498db; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Add New Book</a>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px; margin-bottom: 20px;">
                    <form method="GET" action="book.jsp" style="display: flex; gap: 10px;">
                        <input type="text" name="search" placeholder="Search books..." value="<%= request.getParameter("search") != null ? request.getParameter("search") : ""%>">
                        <select name="category">
                            <option value="">All Categories</option>
                            <option value="fiction">Fiction</option>
                            <option value="non-fiction">Non-fiction</option>
                            <option value="science">Science</option>
                            <option value="history">History</option>
                            <option value="technology">Technology</option>
                            <option value="others">Others</option>
                        </select>
                        <select name="bookstatus">
                            <option value="All">All Status</option>
                            <option value="Available">Available</option>
                            <option value="Not-Available">Not-Available</option>
                            <option value="Pending">Pending</option>
                        </select>
                        <button type="submit">Filter</button>
                    </form>

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

                            <%
                                Book books = new Book();
                                List<Book> bookList;
                                String searchQuery = request.getParameter("search");
                                String category = request.getParameter("category");
                                String bookstatus = request.getParameter("bookstatus");
                                

                                if (searchQuery != null && !searchQuery.trim().isEmpty()) {
                                    bookList = books.searchBooks(searchQuery, category, bookstatus);
                                } else {
                                    bookList = books.getAllBooks(category, bookstatus);
                                }

                                for (Book list : bookList) {
                            %>

                            <tr>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">B0<%= list.getBook_id()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getTitle()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getAuthor()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd; width: 300px; height: 100px; overflow: auto; word-wrap: break-word; white-space: normal;"><%= list.getDescription()%></td>                            
                                <td style="padding: 12px; border-bottom: 1px solid #ddd; "><%= list.getCategory()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getQty()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <span style="background-color: #2ecc71; color: white; padding: 4px 8px; border-radius: 4px;"><%= list.getBookstatus()%></span>
                                </td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <button style="background-color: #3498db; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;">
                                        <a href="edit_book.jsp?bookId=<%= list.getBook_id()%>" style="color: white; text-decoration: none;">Edit</a>
                                    </button>
                                    <button 
                                        style="background-color: #e74c3c; color: white; border: none; padding: 5px 10px; border-radius: 4px; cursor: pointer;" 
                                        onclick="confirmDelete(<%= list.getBook_id()%>)">
                                        Delete
                                    </button>
                                </td>
                            </tr>
                            <%
                                }
                            %>
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