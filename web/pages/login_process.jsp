<%-- 
    Document   : login_process
    Created on : Jan 24, 2025, 4:39:27 PM
    Author     : nadee
--%>

<%@page import="library.classes.MD5"%>
<%@page import="library.classes.Admin"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
   Admin admin = new Admin(username, password);
   
  if(admin.authenticate()){
      session.setAttribute("admin_id", admin.getAdmin_id());
      session.setAttribute("username", admin.getUsername());
      response.sendRedirect("home.jsp");
  }else{
      response.sendRedirect("login.jsp?s=0");
  }
    
    
    
 %>