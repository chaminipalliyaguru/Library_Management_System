<%-- 
    Document   : delete_book
    Created on : Jan 27, 2025
    Author     : Chathu
--%>

<%@ page import="library.classes.Book" %>
<%
    String bookIdStr = request.getParameter("bookId");
    if (bookIdStr != null) {
        int bookId = Integer.parseInt(bookIdStr);
        Book book = new Book(bookId);
        boolean success = book.deleteBook();
        if (success) {
            response.sendRedirect("book.jsp?s=3");
        } else {
            response.sendRedirect("book.jsp?s=1");
        }
    } else {
        response.sendRedirect("book.jsp?s=1");
    }
%>
