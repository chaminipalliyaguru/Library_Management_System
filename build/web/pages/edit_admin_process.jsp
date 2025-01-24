<%-- 
    Document   : edit_user_process
    Created on : Jan 24, 2025, 3:30:12 PM
    Author     : nadee
--%>

<%@page import="library.classes.Admin"%>
<%
    int adminid = Integer.parseInt(request.getParameter("adminId"));
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
   Admin admin = new Admin(username, password, adminid);
   
   if(admin.updateadmin()){
       response.sendRedirect("admin_account.jsp?s=2");
   }else{
        response.sendRedirect("admin_account.jsp?s=1");
   }
   
    
    
    






%>