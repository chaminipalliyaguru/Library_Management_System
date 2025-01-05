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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>User Accounts - Library Management System</title>\n");
      out.write("</head>\n");
      out.write("<body style=\"margin: 0; font-family: Arial, sans-serif;\">\n");
      out.write("    <nav style=\"background-color: #2c3e50; padding: 15px; color: white;\">\n");
      out.write("        <a href=\"home.jsp\">\n");
      out.write("                <img src=\"../images/Logo.png\" width=\"175px\">   \n");
      out.write("            </a>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div style=\"display: flex; min-height: calc(100vh - 120px);\">\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');

    // Get the current page name from the request URI
    String currentPage = request.getRequestURI();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Library Management System</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("           \r\n");
      out.write("            .nav-link {\r\n");
      out.write("                color: white;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                margin: 5px 0;\r\n");
      out.write("                display: block;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            .nav-link:hover {\r\n");
      out.write("                background-color: #3b4b5c; \r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            .active-link {\r\n");
      out.write("                background-color: #2c3e50 !important;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Submenu styling */\r\n");
      out.write("            .submenu {\r\n");
      out.write("                padding-left: 20px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div style=\"width: 250px; background-color: #34495e; padding: 20px; color: white;\">\r\n");
      out.write("            <div style=\"text-align: center; margin-bottom: 20px;\">\r\n");
      out.write("                <h3 style=\"margin: 10px 0;\">Administrator</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"display: flex; flex-direction: column;\">\r\n");
      out.write("                <a href=\"home.jsp\" class=\"nav-link\" id=\"homeLink\">Home</a>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link\" id=\"accountsLink\" \r\n");
      out.write("                       data-bs-toggle=\"collapse\" data-bs-target=\"#accountsMenu\" aria-expanded=\"false\" aria-controls=\"accountsMenu\">Accounts</a>\r\n");
      out.write("                    <div id=\"accountsMenu\" class=\"collapse submenu\">\r\n");
      out.write("                        <a href=\"user_account.jsb\" class=\"nav-link\">Student</a>\r\n");
      out.write("                        <a href=\"admin_account.jsp\" class=\"nav-link\">Admin</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"book.jsp\" class=\"nav-link\" id=\"booksLink\">Books</a>\r\n");
      out.write("                <a href=\"transaction.jsp\" class=\"nav-link\" id=\"transactionsLink\">Transactions</a>\r\n");
      out.write("                <a href=\"setting.jsp\" class=\"nav-link\" id=\"settingsLink\">Settings</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            // Highlight the active link\r\n");
      out.write("            const currentPath = window.location.pathname;\r\n");
      out.write("            document.querySelectorAll('.nav-link').forEach(link => {\r\n");
      out.write("                if (currentPath.includes(link.getAttribute('href'))) {\r\n");
      out.write("                    link.classList.add('active-link');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div style=\"flex-grow: 1; padding: 20px; background-color: #f5f6fa;\">\n");
      out.write("            <div style=\"display: flex; justify-content: space-between; margin-bottom: 20px;\">\n");
      out.write("                <h2 style=\"margin: 0;\">User Accounts</h2>\n");
      out.write("                <a href=\"adduser.jsp\" style=\"background-color: #3498db; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;\">Add New User</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div style=\"background-color: white; padding: 20px; border-radius: 8px; margin-bottom: 20px;\">\n");
      out.write("                <div style=\"display: grid; grid-template-columns: 2fr 1fr 1fr 1fr; gap: 10px;\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Search users...\" style=\"padding: 8px; border: 1px solid #ddd; border-radius: 4px;\">\n");
      out.write("                    <select style=\"padding: 8px; border: 1px solid #ddd; border-radius: 4px;\">\n");
      out.write("                       \n");
      out.write("                        <option>Student</option>\n");
      out.write("                      \n");
      out.write("                    </select>\n");
      out.write("                    \n");
      out.write("                    <button style=\"align-content:Left; background-color: #7f8c8d; color: white; border: none; padding: 8px; border-radius: 4px; cursor: pointer;\">Filter</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div style=\"background-color: white; padding: 20px; border-radius: 8px;\">\n");
      out.write("                <table style=\"width: 100%; border-collapse: collapse;\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr style=\"background-color: #f8f9fa;\">\n");
      out.write("                            <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">ID</th>\n");
      out.write("                            <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">First Name</th>\n");
      out.write("                            <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Last Name</th>\n");
      out.write("                            <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Email</th>\n");
      out.write("                            <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Address</th>\n");
      out.write("                            <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Role</th>\n");
      out.write("                            <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Mobile No</th>\n");
      out.write("                            <th style=\"padding: 12px; text-align: left; border-bottom: 2px solid #ddd;\">Actions</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">U001</td>\n");
      out.write("                            <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">Nadeesh</td>\n");
      out.write("                            <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">Malaka</td>\n");
      out.write("                            <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">nadee@example.com</td>\n");
      out.write("                            <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">Piliyandala</td>\n");
      out.write("                            <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">Student</td>\n");
      out.write("                            <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">0774902773</td>\n");
      out.write("                            <td style=\"padding: 12px; border-bottom: 1px solid #ddd;\">\n");
      out.write("                                <button style=\"background-color: #3498db; color: white; border: none; padding: 5px 10px; border-radius: 4px; margin-right: 5px; cursor: pointer;\">Edit</button>\n");
      out.write("                                <button style=\"background-color: #e74c3c; color: white; border: none; padding: 5px 10px; border-radius: 4px; cursor: pointer;\">Delete</button>\n");
      out.write("                            </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer style=\"background-color: #2c3e50; color: white; text-align: center; padding: 15px;\">\n");
      out.write("        Library System © All rights reserved 2025\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
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
