<%-- 
    Document   : edit_user_process
    Created on : Jan 24, 2025, 7:38:25 PM
    Author     : nadee
--%>

<%@page import="library.classes.User"%>
<%
    int userId = Integer.parseInt(request.getParameter("userId"));
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");
    String address = request.getParameter("address");
    String mobile = request.getParameter("mobile");
    

    User user = new User(firstName, lastName, email, mobile, address, userId);

    if (user.updateUser()) {
        response.sendRedirect("user_account.jsp?s=2"); // Update successful
    } else {
        response.sendRedirect("user_account.jsp?s=1"); // Update failed
    }
%>
