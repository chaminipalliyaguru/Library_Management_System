<%-- 
    Document   : edit_book_action
    Created on : Jan 27, 2025
    Author     : Chathu
--%>


<%@page import="library.classes.Book"%>
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

                <%                    
                    
                    String bookIdParam = request.getParameter("bookId");
if (bookIdParam == null || bookIdParam.isEmpty()) {
    // Handle the error, e.g., redirect or show an error message
    out.println("Book ID is missing.");
    return; // Stop further processing
}
int bookid = Integer.parseInt(bookIdParam);

                    
                    Book book = new Book(bookid);
                    book.getBookById();
                %>

                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <form action="edit_book_action.jsp" method="post">
                        <input type="hidden" name="bookId" value="<%= book.getBook_id()%>">
                        <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 20px;">
                            <div>
                                <label for="title" style="display: block; margin-bottom: 5px;">Title</label>
                                <input type="text" id="title" name="title" value="<%= book.getTitle()%>" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="author" style="display: block; margin-bottom: 5px;">Author</label>
                                <input type="text" id="author" name="author" value="<%= book.getAuthor()%>" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>
                            <div>
                                <label for="description" style="display: block; margin-bottom: 5px;">Description</label>
                                <textarea id="description" name="description" rows="3" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;"><%= book.getDescription()%></textarea>
                            </div>
                            <div>
                                <label for="category" style="display: block; margin-bottom: 5px;">Category</label>
                                <select id="category" name="category" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                                    <option value="" disabled>Select a category</option>
                                    <option value="fiction" <%= book.getCategory().equals("fiction") ? "selected" : ""%>>Fiction</option>
                                    <option value="non-fiction"<%= book.getCategory().equals("non-fiction") ? "selected" : ""%>>Non-fiction</option>
                                    <option value="science"<%= book.getCategory().equals("science") ? "selected" : ""%>>Science</option>
                                    <option value="history"<%= book.getCategory().equals("history") ? "selected" : ""%>>History</option>
                                    <option value="technology"<%= book.getCategory().equals("technology") ? "selected" : ""%>>Technology</option>
                                    <option value="others"<%= book.getCategory().equals("others") ? "selected" : ""%>>Others</option>
                                </select>
                            </div>

                            <div>
                                <label for="qty" style="display: block; margin-bottom: 5px;">Qty</label>
                                <input type="number" value="<%= book.getQty()%>" min="1" id="qty" name="qty" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                            </div>

                            <div>
                                <label for="status" style="display: block; margin-bottom: 5px;">Status</label>
                                <select id="status" name="status" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                                    <option value="" disabled selected>Select a Status</option>
                                    <option value="Available"<%= book.getStatus().equals("Available") ? "selected" : ""%>>Available</option> 
                                    <option value ="Not-Available"<%=book.getStatus().equals("Not-Available") ? "selected" : ""%>>Not-Available</option> 
                                    <option value ="Pending"<%=book.getStatus().equals("Pending") ? "selected" : ""%>>Pending</option> 
                                </select> 
                            </div>

                        </div>

                        <!-- Submit Button -->
                        <div style= "margin-top :20px;text-align:right;">
                            <!-- Save Button -->
                            <button type= "submit" style= "background-color:#3498db;color:white;border:none;padding:10px 20px;border-radius :4px; cursor:pointer;">Save Changes
                            </button >
                        </div >
                    </form >
                </div >

            </div>
        </div>

        <footer style="background-color: #2c3e50; color: white; text-align: center; padding: 15px;">
            Library System © All rights reserved 2025
        </footer>
    </body>
</html>
