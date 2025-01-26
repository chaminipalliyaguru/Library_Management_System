package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Add New Book - Library Management System</title>\n");
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
      out.write('\n');

    // Redirect to login page if the admin is not logged in
    if (session.getAttribute("admin_id") == null) {
        response.sendRedirect("login.jsp?s=0");
        return;  // Ensure the rest of the code is not executed after redirection
    }

    // Safely retrieve username from session
    String adminName = (session.getAttribute("username") != null) ? session.getAttribute("username").toString() : "Admin";
    String adminPhoto = "../images/admin_photo.png"; // Ensure this image exists in your project

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Library Management System</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            .nav-link {\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin: 5px 0;\n");
      out.write("                display: block;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-link:hover {\n");
      out.write("                background-color: #3b4b5c; \n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .active-link {\n");
      out.write("                background-color: #2c3e50 !important;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submenu {\n");
      out.write("                padding-left: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .admin-section {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .admin-photo {\n");
      out.write("                width: 80px;\n");
      out.write("                height: 80px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                object-fit: cover;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .admin-name {\n");
      out.write("                font-size: 1.2rem;\n");
      out.write("                font-weight: bold;\n");
      out.write("                word-break: break-word; /* Ensures long words wrap */\n");
      out.write("                overflow-wrap: break-word; /* Breaks words that exceed width */\n");
      out.write("                max-width: 100%; /* Prevents text overflow */\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logout-btn {\n");
      out.write("                background-color: red;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                text-align: center;\n");
      out.write("                cursor: pointer;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"width: 250px; background-color: #34495e; padding: 20px; color: white;\">\n");
      out.write("            <div class=\"admin-section\">\n");
      out.write("                <!-- Display Administrator Photo -->\n");
      out.write("                <img src=\"");
      out.print( adminPhoto );
      out.write("\" alt=\"Admin Photo\" class=\"admin-photo\">\n");
      out.write("\n");
      out.write("                <!-- Display Administrator Name with wrapping -->\n");
      out.write("                <div class=\"admin-name\">");
      out.print( adminName );
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"display: flex; flex-direction: column;\">\n");
      out.write("                <a href=\"home.jsp\" class=\"nav-link\" id=\"homeLink\">Home</a>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"#\" class=\"nav-link\" id=\"accountsLink\" \n");
      out.write("                       data-bs-toggle=\"collapse\" data-bs-target=\"#accountsMenu\" aria-expanded=\"false\" aria-controls=\"accountsMenu\">Accounts</a>\n");
      out.write("                    <div id=\"accountsMenu\" class=\"collapse submenu\">\n");
      out.write("                        <a href=\"user_account.jsp\" class=\"nav-link\">Student</a>\n");
      out.write("                        <a href=\"admin_account.jsp\" class=\"nav-link\">Admin</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"book.jsp\" class=\"nav-link\" id=\"booksLink\">Books</a>\n");
      out.write("                <a href=\"transaction.jsp\" class=\"nav-link\" id=\"transactionsLink\">Transactions</a>\n");
      out.write("                <a href=\"setting.jsp\" class=\"nav-link\" id=\"settingsLink\">Settings</a>\n");
      out.write("\n");
      out.write("                <!-- Logout Button -->\n");
      out.write("                <a href=\"signout.jsp\" class=\"logout-btn\">Log Out</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // Highlight the active link based on the current URL\n");
      out.write("            const currentPath = window.location.pathname;\n");
      out.write("            document.querySelectorAll('.nav-link').forEach(link => {\n");
      out.write("                if (currentPath.includes(link.getAttribute('href'))) {\n");
      out.write("                    link.classList.add('active-link');\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div style=\"flex-grow: 1; padding: 20px; background-color: #f5f6fa;\">\n");
      out.write("                <div style=\"display: flex; justify-content: space-between; margin-bottom: 20px;\">\n");
      out.write("                    <h2 style=\"margin: 0;\">Add New Book</h2>\n");
      out.write("                    <a href=\"book.jsp\" style=\"background-color: #7f8c8d; color: white; text-decoration: none; padding: 10px 20px; border-radius: 4px;\">Back to Books</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div style=\"background-color: white; padding: 20px; border-radius: 8px;\">\n");
      out.write("                    <form action=\"addnewbook.jsp\" method=\"post\">\n");
      out.write("                        <div style=\"display: grid; grid-template-columns: 1fr 1fr; gap: 20px;\">\n");
      out.write("                            <div>\n");
      out.write("                                <label for=\"title\" style=\"display: block; margin-bottom: 5px;\">Title</label>\n");
      out.write("                                <input type=\"text\" id=\"title\" name=\"title\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <label for=\"author\" style=\"display: block; margin-bottom: 5px;\">Author</label>\n");
      out.write("                                <input type=\"text\" id=\"author\" name=\"author\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <label for=\"description\" style=\"display: block; margin-bottom: 5px;\">Description</label>\n");
      out.write("                                <textarea id=\"description\" name=\"description\" rows=\"3\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <label for=\"category\" style=\"display: block; margin-bottom: 5px;\">Category</label>\n");
      out.write("                                <select id=\"category\" name=\"category\" required>\n");
      out.write("                                    <option value=\"\" disabled selected>Select a category</option>\n");
      out.write("                                    <option value=\"fiction\">Fiction</option>\n");
      out.write("                                    <option value=\"non-fiction\">Non-fiction</option>\n");
      out.write("                                    <option value=\"science\">Science</option>\n");
      out.write("                                    <option value=\"history\">History</option>\n");
      out.write("                                    <option value=\"technology\">Technology</option>\n");
      out.write("                                    <option value=\"others\">Others</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <label for=\"qty\" style=\"display: block; margin-bottom: 5px;\">Quantity</label>\n");
      out.write("                                <input type=\"number\" min=\"1\" id=\"qty\"  name=\"qty\" required style=\"width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px;\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"margin-top: 20px; text-align: right;\">\n");
      out.write("                            <button type=\"submit\" style=\"background-color: #3498db; color: white; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer;\">Save</button>\n");
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
