<%@page import="library.classes.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit User - Library Management System</title>
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
                <h2 style="margin: 0;">Edit User</h2>
                <a href="user_account.jsp" style="background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;">Back to User Accounts</a>
            </div>

            <%
                int userId = Integer.parseInt(request.getParameter("userId"));
                User user = new User(userId);
                user.getUserById();
            %>

            <div style="background-color: white; padding: 20px; border-radius: 8px;">
                <form action="edit_user_process.jsp" method="post">
                    <input type="hidden" name="userId" value="<%= user.getU_id() %>">
                    <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 20px;">
                        <div>
                            <label for="firstName" style="display: block; margin-bottom: 5px;">First Name</label>
                            <input type="text" id="firstName" name="firstName" value="<%= user.getF_name() %>" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                        </div>
                        <div>
                            <label for="lastName" style="display: block; margin-bottom: 5px;">Last Name</label>
                            <input type="text" id="lastName" name="lastName" value="<%= user.getL_name() %>" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                        </div>
                        <div>
                            <label for="email" style="display: block; margin-bottom: 5px;">Email</label>
                            <input type="email" id="email" name="email" value="<%= user.getEmail() %>" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                        </div>
                        <div>
                            <label for="address" style="display: block; margin-bottom: 5px;">Address</label>
                            <input type="text" id="address" name="address" value="<%= user.getAddress() %>" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
                        </div>
                        <div>
                            <label for="mobile" style="display: block; margin-bottom: 5px;">Mobile No</label>
                            <input type="text" id="mobile" name="mobile" value="<%= user.getMobile_no() %>" required style="width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;">
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
