<%-- 
    Document   : user_delete
    Created on : Jan 24, 2025, 7:54:19 PM
    Author     : nadee
--%>

<%@ page import="library.classes.User" %>
<%
    String userIdStr = request.getParameter("userId");
    if (userIdStr != null) {
        int userId = Integer.parseInt(userIdStr);
        User user = new User(userId);
        boolean success = user.deleteUser();
        if (success) {
            response.sendRedirect("user_account.jsp?s=3");
        } else {
            response.sendRedirect("user_account.jsp?s=1");
        }
    } else {
        response.sendRedirect("user_account.jsp?s=1");
    }
%>
