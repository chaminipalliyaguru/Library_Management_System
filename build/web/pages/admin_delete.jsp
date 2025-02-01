<%-- 
    Document   : admin_delete
    Created on : Jan 2, 2025, 11:10 PM
    Author     : nadee
--%>

<%@page import="library.classes.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    int admin_id = Integer.parseInt(request.getParameter("adminId"));
    Admin admin = new Admin(admin_id);

    if (admin.deleteAdmin()) {
        response.sendRedirect("admin_account.jsp?s=3");
    } else {
        response.sendRedirect("admin_account.jsp?s=1");
    }
%>
