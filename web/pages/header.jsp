<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // Get the current page name from the request URI
    String currentPage = request.getRequestURI();

    // Example administrator details (you can replace these with dynamic data)
    String adminName = "John Doe";
    String adminPhoto = "admin_photo.jpg"; // Ensure this image is in your project directory
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Library Management System</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="style.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        <style>
            .nav-link {
                color: white;
                text-decoration: none;
                padding: 10px;
                margin: 5px 0;
                display: block;
                border-radius: 4px;
            }

            .nav-link:hover {
                background-color: #3b4b5c; 
                color: white;
            }

            .active-link {
                background-color: #2c3e50 !important;
                font-weight: bold;
            }

            .submenu {
                padding-left: 20px;
            }

            .admin-section {
                text-align: center;
                margin-bottom: 20px;
            }

            .admin-photo {
                width: 80px;
                height: 80px;
                border-radius: 50%;
                object-fit: cover;
                margin-bottom: 10px;
            }

            .admin-name {
                font-size: 1.2rem;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div style="width: 250px; background-color: #34495e; padding: 20px; color: white;">
            <div class="admin-section">
                <!-- Display Administrator Photo -->
                <img src="<%= adminPhoto %>" alt="Admin Photo" class="admin-photo">

                <!-- Display Administrator Name -->
                <div class="admin-name"><%= adminName %></div>
            </div>
            <div style="display: flex; flex-direction: column;">
                <a href="home.jsp" class="nav-link" id="homeLink">Home</a>
                <div>
                    <a href="#" class="nav-link" id="accountsLink" 
                       data-bs-toggle="collapse" data-bs-target="#accountsMenu" aria-expanded="false" aria-controls="accountsMenu">Accounts</a>
                    <div id="accountsMenu" class="collapse submenu">
                        <a href="user_account.jsp" class="nav-link">Student</a>
                        <a href="admin_account.jsp" class="nav-link">Admin</a>
                    </div>
                </div>
                <a href="book.jsp" class="nav-link" id="booksLink">Books</a>
                <a href="transaction.jsp" class="nav-link" id="transactionsLink">Transactions</a>
                <a href="setting.jsp" class="nav-link" id="settingsLink">Settings</a>
            </div>
        </div>

        <script>
            // Highlight the active link
            const currentPath = window.location.pathname;
            document.querySelectorAll('.nav-link').forEach(link => {
                if (currentPath.includes(link.getAttribute('href'))) {
                    link.classList.add('active-link');
                }
            });
        </script>
    </body>
</html>
