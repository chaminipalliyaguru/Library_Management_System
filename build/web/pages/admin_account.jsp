<%-- 
    Document   : admin_account
    Created on : Jan 2, 2025, 10:38:05 PM
    Author     : nadee
--%>

<%@page import="java.util.List"%>
<%@page import="library.classes.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Admin Accounts - Library Management System</title>

        <%
            String status = request.getParameter("s");
            if (status != null) {
        %>
        <script>
            <% if ("0".equals(status)) { %>
        window.alert("Successfully added admin");
            <% } else if ("2".equals(status)) { %>
        window.alert("Successfully updated admin");
            <% } else { %>
        window.alert("Error occurred");
            <% } %>
        </script>
        <%
            }
        %>


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
                    <h2 style="margin: 0;">Admin Accounts</h2>
                    <a href="addadmin.jsp" style="background-color: #3498db; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Add New Admin</a>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px; margin-bottom: 20px;">
                    <form method="GET" action="admin_account.jsp" style="display: flex; gap: 10px;">
                        <input type="text" name="search" placeholder="Search admins..." 
                               style="padding: 8px; border: 1px solid #ddd; border-radius: 4px;" 
                               value="<%= request.getParameter("search") != null ? request.getParameter("search") : ""%>">

                        <button type="submit" style="background-color: #7f8c8d; color: white; border: none; padding: 8px; border-radius: 4px; cursor: pointer;">
                            Search
                        </button>
                    </form>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px;">
                    <table style="width: 100%; border-collapse: collapse;">
                        <thead>
                            <tr style="background-color: #f8f9fa;">
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Admin ID</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">User Name</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Password</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Role</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Actions</th>
                            </tr>
                        </thead>
                        <tbody>


                            <%    Admin admins = new Admin();
                                List<Admin> adminlist;
                                String searchQuery = request.getParameter("search");

                                if (searchQuery != null && !searchQuery.trim().isEmpty()) {
                                    adminlist = admins.searchAdmins(searchQuery);  // Search function call
                                } else {
                                    adminlist = admins.getAlladmins();  // Get all admins if no search term
                                }

                                for (Admin list : adminlist) {
                            %>
                            <tr>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">A0<%= list.getAdmin_id()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getUsername()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getPassword()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">Admin</td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <button style="background-color: #3498db; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;">
                                        <a href="admin_edit.jsp?adminId=<%= list.getAdmin_id()%>" style="color: white; text-decoration: none;">Edit</a>
                                    </button>
                                    <button style="background-color: #e74c3c; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;">
                                        <a href="admin_delete.jsp?adminId=<%= list.getAdmin_id()%>" style="color: white; text-decoration: none;">Delete</a>
                                    </button>
                                </td>
                            </tr>
                            <%
                                }
                            %>



                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <footer style="background-color: #2c3e50; color: white; text-align: center; padding: 15px;">
            Library System © All rights reserved 2025
        </footer>
    </body>
</html>