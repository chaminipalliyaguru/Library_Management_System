package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("    <title>Edit User - Library Management System</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 0; font-family: Arial, sans-serif;\">\r\n");
      out.write("    <nav style=\"background-color: #2c3e50; padding: 15px; color: white;\">\r\n");
      out.write("        <a href=\"home.jsp\">\r\n");
      out.write("            <img src=\"../images/Logo.png\" width=\"175px\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div style=\"display: flex; min-height: calc(100vh - 120px);\">\r\n");
      out.write("        ");
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
      out.write("        <div style=\"flex-grow: 1; padding: 20px; background-color: #f5f6fa;\">\r\n");
      out.write("            <div style=\"display: flex; justify-content: space-between; margin-bottom: 20px;\">\r\n");
      out.write("                <h2 style=\"margin: 0;\">Edit User</h2>\r\n");
      out.write("                <a href=\"user_account.jsp\" style=\"background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;\">Back to User Accounts</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"background-color: white; padding: 20px; border-radius: 8px;\">\r\n");
      out.write("                <form action=\"edituseraction.jsp\" method=\"post\">\r\n");
      out.write("                    <div style=\"display: grid; grid-template-columns: 1fr 1fr; gap: 20px;\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <label for=\"firstName\" style=\"display: block; margin-bottom: 5px;\">First Name</label>\r\n");
      out.write("                            <input type=\"text\" id=\"firstName\" name=\"firstName\" value=\"Nadeesh\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <label for=\"lastName\" style=\"display: block; margin-bottom: 5px;\">Last Name</label>\r\n");
      out.write("                            <input type=\"text\" id=\"lastName\" name=\"lastName\" value=\"Malaka\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <label for=\"email\" style=\"display: block; margin-bottom: 5px;\">Email</label>\r\n");
      out.write("                            <input type=\"email\" id=\"email\" name=\"email\" value=\"nadee@example.com\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <label for=\"address\" style=\"display: block; margin-bottom: 5px;\">Address</label>\r\n");
      out.write("                            <input type=\"text\" id=\"address\" name=\"address\" value=\"Piliyandala\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div>\r\n");
      out.write("                            <label for=\"mobile\" style=\"display: block; margin-bottom: 5px;\">Mobile No</label>\r\n");
      out.write("                            <input type=\"text\" id=\"mobile\" name=\"mobile\" value=\"0774902773\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"margin-top: 20px; text-align: right;\">\r\n");
      out.write("                        <button type=\"submit\" style=\"background-color: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;\">Save</button>\r\n");
      out.write("                        <button type=\"reset\" style=\"background-color: #e74c3c; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;\">Reset</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <footer style=\"background-color: #2c3e50; color: white; text-align: center; padding: 15px;\">\r\n");
      out.write("        Library System © All rights reserved 2025\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
