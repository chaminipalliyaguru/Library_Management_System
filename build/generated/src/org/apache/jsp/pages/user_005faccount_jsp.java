package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005faccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/pages/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>User Accounts - Library Management System</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"margin: 0; font-family: Arial, sans-serif;\">\r\n");
      out.write("        <nav style=\"background-color: #2c3e50; padding: 15px; color: white;\">\r\n");
      out.write("            <a href=\"home.jsp\">\r\n");
      out.write("                <img src=\"../images/Logo.png\" width=\"175px\">   \r\n");
      out.write("            </a>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div style=\"display: flex; min-height: calc(100vh - 120px);\">\r\n");
      out.write("            ");
      out.write('\r');
      out.write('\n');

    // Redirect to login page if the admin is not logged in
    if (session.getAttribute("admin_id") == null) {
        response.sendRedirect("login.jsp?s=0");
        return;  // Ensure the rest of the code is not executed after redirection
    }

    // Safely retrieve username from session
    String adminName = (session.getAttribute("username") != null) ? session.getAttribute("username").toString() : "Admin";
    String adminPhoto = "../images/admin_photo.png"; // Ensure this image exists in your project

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Library Management System</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .nav-link {\r\n");
      out.write("                color: white;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                margin: 5px 0;\r\n");
      out.write("                display: block;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .nav-link:hover {\r\n");
      out.write("                background-color: #3b4b5c; \r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .active-link {\r\n");
      out.write("                background-color: #2c3e50 !important;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .submenu {\r\n");
      out.write("                padding-left: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .admin-section {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .admin-photo {\r\n");
      out.write("                width: 80px;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("                object-fit: cover;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .admin-name {\r\n");
      out.write("                font-size: 1.2rem;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                word-break: break-word; /* Ensures long words wrap */\r\n");
      out.write("                overflow-wrap: break-word; /* Breaks words that exceed width */\r\n");
      out.write("                max-width: 100%; /* Prevents text overflow */\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .logout-btn {\r\n");
      out.write("                background-color: red;\r\n");
      out.write("                color: white;\r\n");
      out.write("                border: none;\r\n");
      out.write("                padding: 10px 20px;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                display: block;\r\n");
      out.write("                margin-top: 20px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div style=\"width: 250px; background-color: #34495e; padding: 20px; color: white;\">\r\n");
      out.write("            <div class=\"admin-section\">\r\n");
      out.write("                <!-- Display Administrator Photo -->\r\n");
      out.write("                <img src=\"");
      out.print( adminPhoto );
      out.write("\" alt=\"Admin Photo\" class=\"admin-photo\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Display Administrator Name with wrapping -->\r\n");
      out.write("                <div class=\"admin-name\">");
      out.print( adminName );
      out.write("</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"display: flex; flex-direction: column;\">\r\n");
      out.write("                <a href=\"home.jsp\" class=\"nav-link\" id=\"homeLink\">Home</a>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link\" id=\"accountsLink\" \r\n");
      out.write("                       data-bs-toggle=\"collapse\" data-bs-target=\"#accountsMenu\" aria-expanded=\"false\" aria-controls=\"accountsMenu\">Accounts</a>\r\n");
      out.write("                    <div id=\"accountsMenu\" class=\"collapse submenu\">\r\n");
      out.write("                        <a href=\"user_account.jsp\" class=\"nav-link\">Student</a>\r\n");
      out.write("                        <a href=\"admin_account.jsp\" class=\"nav-link\">Admin</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"book.jsp\" class=\"nav-link\" id=\"booksLink\">Books</a>\r\n");
      out.write("                <a href=\"transaction.jsp\" class=\"nav-link\" id=\"transactionsLink\">Transactions</a>\r\n");
      out.write("                <a href=\"setting.jsp\" class=\"nav-link\" id=\"settingsLink\">Settings</a>\r\n");
      out.write("\r\n");
      out.write("                <!-- Logout Button -->\r\n");
      out.write("                <a href=\"signout.jsp\" class=\"logout-btn\">Log Out</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            // Highlight the active link based on the current URL\r\n");
      out.write("            const currentPath = window.location.pathname;\r\n");
      out.write("            document.querySelectorAll('.nav-link').forEach(link => {\r\n");
      out.write("                if (currentPath.includes(link.getAttribute('href'))) {\r\n");
      out.write("                    link.classList.add('active-link');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div style=\"flex-grow: 1; padding: 20px; background-color: #f5f6fa;\">\r\n");
      out.write("                <div style=\"display: flex; justify-content: space-between; margin-bottom: 20px;\">\r\n");
      out.write("                    <h2 style=\"margin: 0;\">User Accounts</h2>\r\n");
      out.write("                    <a href=\"register_user_process.jsp\" style=\"background-color: #3498db; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;\">Add New User</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div style=\"background-color: white; padding: 20px; border-radius: 8px; margin-bottom: 20px;\">\r\n");
      out.write("                    <div style=\"display: grid; grid-template-columns: 2fr 1fr 1fr 1fr; gap: 10px;\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Search users...\" style=\"padding: 8px; border: 1px solid #ddd; border-radius: 4px;\">\r\n");
      out.write("                        <select style=\"padding: 8px; border: 1px solid #ddd; border-radius: 4px;\">\r\n");
      out.write("\r\n");
      out.write("                            <option>Student</option>\r\n");
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("                        <button style=\"align-content:Left; background-color: #7f8c8d; color: white; border: none; padding: 8px; border-radius: 4px; cursor: pointer;\">Filter</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div style=\"background-color: white; padding: 20px; border-radius: 8px;\">\r\n");
      out.write("                    <table style=\"width: 100%; border-collapse: collapse;\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr style=\"background-color: #f8f9fa;\">\r\n");
      out.write("                                <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">ID</th>\r\n");
      out.write("                                <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">First Name</th>\r\n");
      out.write("                                <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Last Name</th>\r\n");
      out.write("                                <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Email</th>\r\n");
      out.write("                                <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Address</th>\r\n");
      out.write("                                <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Role</th>\r\n");
      out.write("                                <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Mobile No</th>\r\n");
      out.write("                                <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Actions</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">U001</td>\r\n");
      out.write("                                <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">Nadeesh</td>\r\n");
      out.write("                                <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">Malaka</td>\r\n");
      out.write("                                <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">nadee@example.com</td>\r\n");
      out.write("                                <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">Piliyandala</td>\r\n");
      out.write("                                <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">Student</td>\r\n");
      out.write("                                <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">0774902773</td>\r\n");
      out.write("                                <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">\r\n");
      out.write("                                    <button style=\"background-color: #3498db; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;\">\r\n");
      out.write("                                        <a href=\"edit_user.jsp?id=U001\" style=\"color: white; text-decoration: none;\">Edit</a>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <button style=\"background-color: #e74c3c; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;\">\r\n");
      out.write("                                        <a href=\"delete_user.jsp?id=U001\" style=\"color: white; text-decoration: none;\">Delete</a>\r\n");
      out.write("                                    </button>\r\n");
      out.write("\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <footer style=\"background-color: #2c3e50; color: white; text-align: center; padding: 15px;\">\r\n");
      out.write("            Library System © All rights reserved 2025\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
