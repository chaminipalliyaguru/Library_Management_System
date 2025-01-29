<%-- 
    Document   : register_admin_prpcess
    Created on : Jan 24, 2025, 12:41:35 PM
    Author     : nadee
--%>

<%@page import="library.classes.MD5"%>
<%@page import="library.classes.Admin"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
   Admin admin = new Admin(username, password);
   
   if(admin.register()){
       response.sendRedirect("admin_account.jsp?s=0");
   }else{
       response.sendRedirect("admin_account.jsp?s=1");
   }



%>