package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("            .toggle-switch {\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("                width: 60px;\n");
      out.write("                height: 34px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .toggle-switch input {\n");
      out.write("                opacity: 0;\n");
      out.write("                width: 0;\n");
      out.write("                height: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .slider {\n");
      out.write("                position: absolute;\n");
      out.write("                cursor: pointer;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                background-color: #ccc;\n");
      out.write("                transition: .4s;\n");
      out.write("                border-radius: 34px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .slider:before {\n");
      out.write("                position: absolute;\n");
      out.write("                content: \"\";\n");
      out.write("                height: 26px;\n");
      out.write("                width: 26px;\n");
      out.write("                left: 4px;\n");
      out.write("                bottom: 4px;\n");
      out.write("                background-color: white;\n");
      out.write("                transition: .4s;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input:checked + .slider {\n");
      out.write("                background-color: #2196F3;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input:checked + .slider:before {\n");
      out.write("                transform: translateX(26px);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button.btn {\n");
      out.write("            background-color: #2196F3;\n");
      out.write("            color: white;\n");
      out.write("            padding: 12px 24px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button.btn:hover {\n");
      out.write("            background-color: #1976D2;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin: 0; font-family: Arial, sans-serif;\">\n");
      out.write("        <nav style=\"background-color: #2c3e50; padding: 15px; color: white;\">\n");
      out.write("            <a href=\"home.jsp\">\n");
      out.write("                <img src=\"../images/Logo.png\" width=\"175px\">   \n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div style=\"display: flex; min-height: calc(100vh - 120px);\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Library Management System</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"width: 250px; background-color: #34495e; padding: 20px; color: white;\">\n");
      out.write("            <div style=\"text-align: center; margin-bottom: 20px;\">\n");
      out.write("<!--                <img src=\"/api/placeholder/100/100\" style=\"border-radius: 50%; width: 100px; height: 100px;\">-->\n");
      out.write("                <h3 style=\"margin: 10px 0;\">Administrator</h3>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"display: flex; flex-direction: column;\">\n");
      out.write("                <a href=\"home.jsp\" style=\"color: white; text-decoration: none; padding: 10px; margin: 5px 0; background-color: #2c3e50;\">Home</a>\n");
      out.write("                <a href=\"account.jsp\" style=\"color: white; text-decoration: none; padding: 10px; margin: 5px 0;\">Accounts</a>\n");
      out.write("                <a href=\"book.jsp\" style=\"color: white; text-decoration: none; padding: 10px; margin: 5px 0;\">Books</a>\n");
      out.write("                <a href=\"transaction.jsp\" style=\"color: white; text-decoration: none; padding: 10px; margin: 5px 0;\">Transactions</a>\n");
      out.write("                <a href=\"setting.jsp\" style=\"color: white; text-decoration: none; padding: 10px; margin: 5px 0;\">Settings</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("        <div class=\"settings-header\">\n");
      out.write("            <h1>Library Management System Settings</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"settings-content\">\n");
      out.write("            <form>\n");
      out.write("                <div class=\"settings-section\">\n");
      out.write("                    <h2>General Settings</h2>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"library-name\">Library Name</label>\n");
      out.write("                        <input type=\"text\" id=\"library-name\" value=\"Central Library\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"admin-email\">Administrator Email</label>\n");
      out.write("                        <input type=\"email\" id=\"admin-email\" value=\"admin@library.com\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"settings-section\">\n");
      out.write("                    <h2>Loan Settings</h2>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"loan-period\">Default Loan Period (days)</label>\n");
      out.write("                        <input type=\"number\" id=\"loan-period\" value=\"14\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"max-books\">Maximum Books Per User</label>\n");
      out.write("                        <input type=\"number\" id=\"max-books\" value=\"5\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"fine-rate\">Late Return Fine Rate (per day)</label>\n");
      out.write("                        <input type=\"number\" id=\"fine-rate\" value=\"1\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"settings-section\">\n");
      out.write("                    <h2>Notification Settings</h2>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Email Notifications</label>\n");
      out.write("                        <label class=\"toggle-switch\">\n");
      out.write("                            <input type=\"checkbox\" checked>\n");
      out.write("                            <span class=\"slider\"></span>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>SMS Notifications</label>\n");
      out.write("                        <label class=\"toggle-switch\">\n");
      out.write("                            <input type=\"checkbox\">\n");
      out.write("                            <span class=\"slider\"></span>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"settings-section\">\n");
      out.write("                    <h2>System Settings</h2>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"language\">System Language</label>\n");
      out.write("                        <select id=\"language\">\n");
      out.write("                            <option value=\"en\">English</option>\n");
      out.write("                            <option value=\"es\">Spanish</option>\n");
      out.write("                            <option value=\"fr\">French</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"timezone\">Timezone</label>\n");
      out.write("                        <select id=\"timezone\">\n");
      out.write("                            <option value=\"UTC\">UTC</option>\n");
      out.write("                            <option value=\"EST\">EST</option>\n");
      out.write("                            <option value=\"PST\">PST</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn\">Save Settings</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
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