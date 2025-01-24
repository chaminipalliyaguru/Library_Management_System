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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

  String message = "";  
  if(request.getParameter("s") != null){
      if(request.getParameter("s").equals("0")){
          message = "<h3 style='color:red;'>Incorrect username or password</h3>";
      }
  }  

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Library System</title>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                font-family: Arial, sans-serif;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .container {\r\n");
      out.write("                margin: 150px 350px 10px 350px;\r\n");
      out.write("                background-color: white;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                align-items: left;\r\n");
      out.write("                height: 40vh;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .navbar {\r\n");
      out.write("                background-color: white;\r\n");
      out.write("                padding: 10px 20px;\r\n");
      out.write("                border-bottom: 1px solid #ddd;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .navbar img {\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                margin-right: 10px; \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-container {\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                background: yellow;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .login-container h1 {\r\n");
      out.write("                margin-top: 50px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-form label {\r\n");
      out.write("                display: block;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                margin-left: 60px;\r\n");
      out.write("                margin-top: 30px;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                color: #555;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-form input {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("                margin-left: 60px;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-btn {\r\n");
      out.write("                width: 105%;\r\n");
      out.write("                margin-left: 60px;\r\n");
      out.write("                margin-top: 30px;\r\n");
      out.write("                background-color: #007bff;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                border: none;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-btn:hover {\r\n");
      out.write("                background-color: #0056b3;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .login-container img {\r\n");
      out.write("                width: 200px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-image: url('/Library_Management_System/images/background.jpg');\">\r\n");
      out.write("        <div class='navbar'>\r\n");
      out.write("            <img src=\"/Library_Management_System/images/Logo.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class='container'>\r\n");
      out.write("            <div class=\"login-container\">\r\n");
      out.write("                <img src=\"/Library_Management_System/images/Logo.png\">\r\n");
      out.write("                <h1>Login Here..</h1>\r\n");
      out.write("                ");
      out.print(message );
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <form class=\"login-form\" action=\"../pages/login_process.jsp\" method=\"POST\">\r\n");
      out.write("                <label for=\"username\">Username:</label>\r\n");
      out.write("                <input type=\"email\" id=\"username\" name=\"username\" placeholder=\"Enter username\" required>\r\n");
      out.write("\r\n");
      out.write("                <label for=\"password\">Password:</label>\r\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter password\">\r\n");
      out.write("\r\n");
      out.write("                <button type=\"submit\" class=\"login-btn\">Login</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
