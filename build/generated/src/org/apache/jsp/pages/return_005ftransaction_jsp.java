package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class return_005ftransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Return Transaction - Library Management System</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin: 0; font-family: Arial, sans-serif;\">\n");
      out.write("        <nav style=\"background-color: #2c3e50; padding: 15px; color: white;\">\n");
      out.write("            <a href=\"home.jsp\">\n");
      out.write("                <img src=\"../images/Logo.png\" width=\"175px\">\n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div style=\"display: flex; min-height: calc(100vh - 120px);\">\n");
      out.write("            ");
      out.write('\r');
      out.write('\n');

    // Get the current page name from the request URI
    String currentPage = request.getRequestURI();

    // Example administrator details (you can replace these with dynamic data)
    String adminName = "Admin Johan";
    String adminPhoto = "../images/admin_photo.png"; // Ensure this image is in your project directory

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
      out.write("                <!-- Display Administrator Name -->\r\n");
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
      out.write("</html>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div style=\"flex-grow: 1; padding: 20px; background-color: #f5f6fa;\">\n");
      out.write("                <div style=\"display: flex; justify-content: space-between; margin-bottom: 20px;\">\n");
      out.write("                    <h2 style=\"margin: 0;\">Return Book</h2>\n");
      out.write("                    <a href=\"transaction.jsp\" style=\"background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;\">Back to Transactions</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div style=\"background-color: white; padding: 20px; border-radius: 8px;\">\n");
      out.write("                    <form action=\"returntransactionaction.jsp\" method=\"post\">\n");
      out.write("                        <div style=\"display: grid; grid-template-columns: 1fr 1fr; gap: 20px;\">\n");
      out.write("                            <!-- User ID Field -->\n");
      out.write("                            <div>\n");
      out.write("                                <label for=\"userID\" style=\"display: block; margin-bottom: 5px;\">User ID</label>\n");
      out.write("                                <input type=\"text\" id=\"userID\" name=\"userID\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Book ID Field -->\n");
      out.write("                            <div>\n");
      out.write("                                <label for=\"bookID\" style=\"display: block; margin-bottom: 5px;\">Book ID</label>\n");
      out.write("                                <input type=\"text\" id=\"bookID\" name=\"bookID\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Return Date Field -->\n");
      out.write("                            <div>\n");
      out.write("                                <label for=\"returnDate\" style=\"display: block; margin-bottom: 5px;\">Return Date</label>\n");
      out.write("                                <input type=\"date\" id=\"returnDate\" name=\"returnDate\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Notes Field -->\n");
      out.write("                            <div>\n");
      out.write("                                <label for=\"notes\" style=\"display: block; margin-bottom: 5px;\">Notes (Optional)</label>\n");
      out.write("                                <textarea id=\"notes\" name=\"notes\" rows=\"4\" style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Buttons -->\n");
      out.write("                        <div style=\"margin-top: 20px; text-align: right;\">\n");
      out.write("                            <button type=\"submit\" style=\"background-color: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;\">Return</button>\n");
      out.write("                            <button type=\"reset\" style=\"background-color: #e74c3c; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;\">Reset</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer style=\"background-color: #2c3e50; color: white; text-align: center; padding: 15px;\">\n");
      out.write("            Library System © All rights reserved 2025\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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