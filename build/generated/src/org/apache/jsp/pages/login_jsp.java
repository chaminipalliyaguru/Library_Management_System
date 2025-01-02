package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Library System</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container{\n");
      out.write("                margin: 150px 350px 10px 350px;\n");
      out.write("                background-color: white;\n");
      out.write("                display: flex;\n");
      out.write("                align-items:left;\n");
      out.write("                height: 40vh;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar{\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                border-bottom: 1px solid #ddd;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar img{\n");
      out.write("                height: 40px;\n");
      out.write("                margin-right: 10px; \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-container {\n");
      out.write("                width: 300px;\n");
      out.write("                background: yellow;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .login-container h1{\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .login-form label {\n");
      out.write("                display: block;\n");
      out.write("                text-align: left;\n");
      out.write("                \n");
      out.write("                margin-left: 60px;\n");
      out.write("                margin-top: 30px;\n");
      out.write("                font-size: 14px;\n");
      out.write("                color: #555;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-form input {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 8px;\n");
      out.write("                \n");
      out.write("                margin-left: 60px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-btn {\n");
      out.write("                width: 105%;\n");
      out.write("                margin-left: 60px;\n");
      out.write("                margin-top: 30px;\n");
      out.write("                background-color: #007bff;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-btn:hover {\n");
      out.write("                background-color: #0056b3;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .login-container img{\n");
      out.write("                width: 200px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('../images/background.jpg'); background-size: cover; \">\n");
      out.write("        <div class='navbar'>\n");
      out.write("            <img src=\"../images/Logo.png\">\n");
      out.write("        </div>\n");
      out.write("        <div class='container'>\n");
      out.write("            <div class=\"login-container\">\n");
      out.write("                <img src=\"../images/Logo.png\">\n");
      out.write("                <h1>Login Here..</h1>\n");
      out.write("            </div>\n");
      out.write("            <form class=\"login-form\">\n");
      out.write("                <label for=\"username\">Username:</label>\n");
      out.write("                <input type=\"text\" id=\"username\" name=\"username\" placeholder=\"Enter username\">\n");
      out.write("\n");
      out.write("                <label for=\"password\">Password:</label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter password\">\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"login-btn\">Login</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
