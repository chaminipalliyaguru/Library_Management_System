<%-- 
    Document   : admin_edit
    Created on : Jan 2, 2025, 11:00 PM
    Author     : nadee
--%>

<%@page import="library.classes.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Admin - Library Management System</title>
</head>
<body style="margin: 0; font-family: Arial, sans-serif;">
    <nav style="background-color: #2c3e50; padding: 15px; color: white;">
        <a href="home.jsp">
            <img src="../images/Logo.png" width="175px">
        </a>
    </nav>

    <div style="display: flex; min-height: calc(100vh - 120px);">
        <%@include file="header.jsp" %>

        <div style="flex-grow: 1; padding: 20px; background-color: #f5f6fa;">
            <div style="display: flex; justify-content: space-between; margin-bottom: 20px;">
                <h2 style="margin: 0;">Edit Admin</h2>
                <a href="admin_account.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Back to Admin Accounts</a>
            </div>
            
            <%
                
             int admin_id = Integer.parseInt(request.getParameter("adminId"));
             Admin admin  = new Admin(admin_id);
             admin.getAdmin();
                
            %>

            <div style="background-color: white; padding: 20px; border-radius: 8px;">
                <form action="edit_admin_process.jsp?adminId=<%=admin.getAdmin_id()%>" method="post">
                    <input type="hidden" name="adminId" value="Admin">
                    <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 20px;">
                        <div>
                            <label for="userName" style="display: block; margin-bottom: 5px;">User Name</label>
                            <input type="text" id="userName" name="username" value="<%=admin.getUsername()%>" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                        </div>
                        <div>
                            <label for="password" style="display: block; margin-bottom: 5px;">Password</label>
                            <input type="text" id="password" name="password" value="<%=admin.getPassword()%>" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                        </div>
                    </div>
                    <div style="margin-top: 20px; text-align: right;">
                        <button type="submit" style="background-color: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;">Save Changes</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <footer style="background-color: #2c3e50; color: white; text-align: center; padding: 15px;">
        Library System © All rights reserved 2025
    </footer>
</body>
</html>
