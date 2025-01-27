<%-- 
    Document   : addnewbook
    Created on : Jan 27, 2025
    Author     : Chathu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="library.classes.Book" %>


<%
    String title = request.getParameter("title");
    String author = request.getParameter("author");
    String description = request.getParameter("description");
    String category = request.getParameter("category");
    int qty = Integer.parseInt(request.getParameter("qty")); // Get qty parameter
    String status = request.getParameter("status");

    // Create Book object and add it
    Book book = new Book(title, author, description, category, qty, status);
    
    if (book.addbook()) {
        response.sendRedirect("book.jsp?s=0");
    } else {
        response.sendRedirect("book.jsp?s=1");
    }
%>


