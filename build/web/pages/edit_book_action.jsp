<%-- 
    Document   : edit_book_action
    Created on : Jan 27, 2025
    Author     : Chathu
--%>

<%@page import="library.classes.Book"%>

<%
    int bookId = Integer.parseInt(request.getParameter("bookId"));
    String title = request.getParameter("title");
    String author = request.getParameter("author");
    String description = request.getParameter("description");
    String category = request.getParameter("category");
    int qty = Integer.parseInt(request.getParameter("qty"));
    String bookstatus = request.getParameter("bookstatus");
    

    Book book = new Book(title, author, description, category, qty, bookstatus, bookId);

    if (book.updateBook()) {
        response.sendRedirect("book.jsp?s=2"); // Update successful
    } else {
        response.sendRedirect("book.jsp?s=1"); // Update failed
    }
%>
