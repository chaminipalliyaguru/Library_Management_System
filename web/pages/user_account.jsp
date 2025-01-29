<%-- 
    Document   : user_account
    Created on : Jan 2, 2025, 11:06:45 PM
    Author     : nadee
--%>

<%@page import="java.util.List"%>
<%@page import="library.classes.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>User Accounts - Library Management System</title>

        <%
            String status = request.getParameter("s");
            if (status != null) {
        %>
        <script>
            <% if ("0".equals(status)) { %>
            window.alert("Successfully added user");
            <% } else if ("2".equals(status)) { %>
            window.alert("Successfully updated user");
            <% } else if ("3".equals(status)) { %>
            window.alert("Successfully deleted user");
            <% } else { %>
            window.alert("Error occurred");
            <% } %>
        </script>
        <%
            }
        %>

        <script>
            function confirmDelete(userId) {
                if (confirm("Are you sure you want to delete this user? This action cannot be undone.")) {
                    window.location.href = 'user_delete.jsp?userId=' + userId;
                }
            }
        </script>
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
                    <h2 style="margin: 0;">User Accounts</h2>
                    <a href="adduser.jsp" style="background-color: #3498db; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Add New User</a>
                </div>

                <div style="background-color: white; padding: 20px; border-radius: 8px; margin-bottom: 20px;">
                    <form method="GET" action="user_account.jsp" style="display: flex; gap: 10px;">
                        <input type="text" name="search" placeholder="Search users..." 
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
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">User ID</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">First Name</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Last Name</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Email</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Mobile No</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Address</th>
                                <th style="padding: 12px; text-align: left; border-bottom: 2px solid #ddd;">Actions</th>
                            </tr>
                        </thead>
                        <tbody>

                            <%
                                User users = new User();
                                List<User> userList;
                                String searchQuery = request.getParameter("search");

                                if (searchQuery != null && !searchQuery.trim().isEmpty()) {
                                    userList = users.searchUsers(searchQuery);
                                } else {
                                    userList = users.getAllUsers();
                                }

                                for (User list : userList) {
                            %>
                            <tr>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">U0<%= list.getU_id()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getF_name()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getL_name()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getEmail()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getMobile_no()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;"><%= list.getAddress()%></td>
                                <td style="padding: 12px; border-bottom: 1px solid #ddd;">
                                    <button style="background-color: #3498db; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;">
                                        <a href="edit_user.jsp?userId=<%= list.getU_id()%>" style="color: white; text-decoration: none;">Edit</a>
                                    </button>
                                    <button 
                                        style="background-color: #e74c3c; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;" 
                                        onclick="confirmDelete(<%= list.getU_id()%>)">
                                        Delete
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
