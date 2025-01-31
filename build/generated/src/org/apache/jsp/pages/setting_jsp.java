package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import library.classes.Setting;

public final class setting_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Library Management System - Settings</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background-color: #f5f5f5;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                max-width: 1200px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .settings-header {\n");
      out.write("                background-color: #2c3e50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 8px 8px 0 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .settings-content {\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 30px;\n");
      out.write("                border-radius: 0 0 8px 8px;\n");
      out.write("                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .settings-section {\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .settings-section h2 {\n");
      out.write("                color: #2c3e50;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                border-bottom: 2px solid #eee;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group label {\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 8px;\n");
      out.write("                color: #333;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group input[type=\"text\"],\n");
      out.write("            .form-group input[type=\"email\"],\n");
      out.write("            .form-group input[type=\"number\"],\n");
      out.write("            .form-group select {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group select {\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                background-color: #2c3e50;\n");
      out.write("                color: blue;\n");
      out.write("                padding: 12px 24px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;\n");
      out.write("                transition: background-color 0.3s;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover {\n");
      out.write("                background-color: #1976D2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .alert {\n");
      out.write("                padding: 15px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .alert-success {\n");
      out.write("                background-color: #d4edda;\n");
      out.write("                color: #155724;\n");
      out.write("                border: 1px solid #c3e6cb;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .alert-danger {\n");
      out.write("                background-color: #f8d7da;\n");
      out.write("                color: #721c24;\n");
      out.write("                border: 1px solid #f5c6cb;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav {\n");
      out.write("                background-color: #2c3e50;\n");
      out.write("                padding: 15px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer {\n");
      out.write("                background-color: #2c3e50;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 15px;\n");
      out.write("                position: relative;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Added responsive design */\n");
      out.write("            @media (max-width: 768px) {\n");
      out.write("                .container {\n");
      out.write("                    padding: 10px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .settings-content {\n");
      out.write("                    padding: 20px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .btn {\n");
      out.write("               width: 100%;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <a href=\"home.jsp\">\n");
      out.write("                <img src=\"../images/Logo.png\" width=\"175px\" alt=\"Library Logo\">   \n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div style=\"display: flex; min-height: calc(100vh - 120px);\">\n");
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
      out.write("\n");
      out.write("\n");
      out.write("            ");

                // Get current settings
                Setting currentSettings = Setting.getCurrentSettings();
                
                // Handle form submission
                String message = "";
                if ("POST".equalsIgnoreCase(request.getMethod())) {
                    try {
                        String libraryName = request.getParameter("library-name");
                        String contactNumber = request.getParameter("contact-number");
                        String libraryEmail = request.getParameter("library-email");
                        int maxBooks = Integer.parseInt(request.getParameter("max-books"));
                        int fineRate = Integer.parseInt(request.getParameter("fine-rate"));
                        
                        if (Setting.updateSettings(libraryName, contactNumber, libraryEmail, maxBooks, fineRate)) {
                            message = "Settings updated successfully!";
                            currentSettings = Setting.getCurrentSettings(); // Refresh settings
                        } else {
                            message = "Error updating settings. Please try again.";
                        }
                    } catch (NumberFormatException e) {
                        message = "Please enter valid numbers for maximum books and fine rate.";
                    }
                }
            
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"settings-header\">\n");
      out.write("                    <h1>Library Management System Settings</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"settings-content\">\n");
      out.write("                    ");
 if (!message.isEmpty()) { 
      out.write("\n");
      out.write("                        <div class=\"alert ");
      out.print( message.contains("Error") || message.contains("Please enter valid") ? "alert-danger" : "alert-success" );
      out.write("\">\n");
      out.write("                            ");
      out.print( message );
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                    <form method=\"POST\" action=\"setting.jsp\">\n");
      out.write("                        <div class=\"settings-section\">\n");
      out.write("                            <h2>General Settings</h2>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"library-name\">Library Name</label>\n");
      out.write("                                <input type=\"text\" id=\"library-name\" name=\"library-name\" \n");
      out.write("                                       value=\"");
      out.print( currentSettings.getLibraryName() != null ? currentSettings.getLibraryName() : "" );
      out.write("\" \n");
      out.write("                                       required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"contact-number\">Library Contact Number</label>\n");
      out.write("                                <input type=\"text\" id=\"contact-number\" name=\"contact-number\" \n");
      out.write("                                       value=\"");
      out.print( currentSettings.getContactNumber() != null ? currentSettings.getContactNumber() : "" );
      out.write("\" \n");
      out.write("                                       required pattern=\"[\\+]?[0-9\\s\\-]{10,}\" title=\"Please enter a valid phone number\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"library-email\">Library Email</label>\n");
      out.write("                                <input type=\"email\" id=\"library-email\" name=\"library-email\" \n");
      out.write("                                       value=\"");
      out.print( currentSettings.getLibraryEmail() != null ? currentSettings.getLibraryEmail() : "" );
      out.write("\" \n");
      out.write("                                       required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"max-books\">Maximum Books Per User</label>\n");
      out.write("                                <input type=\"number\" id=\"max-books\" name=\"max-books\" \n");
      out.write("                                       value=\"");
      out.print( currentSettings.getMaxBooks() );
      out.write("\" \n");
      out.write("                                       required min=\"1\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"fine-rate\">Late Return Fine Rate (per day)</label>\n");
      out.write("                                <input type=\"number\" id=\"fine-rate\" name=\"fine-rate\" \n");
      out.write("                                       value=\"");
      out.print( currentSettings.getFineRate() );
      out.write("\" \n");
      out.write("                                       required min=\"0\">\n");
      out.write("                            </div>\n");
      out.write("                                       <button type=\"submit\" class=\"btn\">Save Settings</button>\n");
      out.write("                        </div>\n");
      out.write("                                       \n");
      out.write("                        \n");
      out.write("                                       \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            Library System © All rights reserved 2025\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
