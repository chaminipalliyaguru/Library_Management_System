package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
