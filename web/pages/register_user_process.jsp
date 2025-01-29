<%-- 
    Document   : register_user_process
    Created on : Jan 24, 2025, 6:35:27 PM
    Author     : nadee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="library.classes.User" %>


<%
    
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");
    String mobileNo = request.getParameter("mobile");
    String address = request.getParameter("address");

 
    User user = new User(firstName, lastName, email, mobileNo, address);
    
    if(user.register()){
       response.sendRedirect("user_account.jsp?s=0");
   }else{
       response.sendRedirect("user_account.jsp?s=1");
   }


%>


