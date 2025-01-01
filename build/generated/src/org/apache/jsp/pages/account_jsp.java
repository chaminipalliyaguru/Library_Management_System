package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Accounts - Library Management System</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("        \n");
      out.write("        ");
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
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <div class=\"col-md-3 col-lg-2 sidebar\">\n");
      out.write("                    <div class=\"admin-profile text-center py-4\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"home.jsp\">\n");
      out.write("                            <img src=\"../images/Logo.png\" alt=\"Library Logo\" class=\"logo\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"nav flex-column\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"home.jsp\">\n");
      out.write("                                <i class=\"bi bi-house\"></i> Home\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"account.jsp\">\n");
      out.write("                                <i class=\"bi bi-people\"></i> Accounts\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"books.html\">\n");
      out.write("                                <i class=\"bi bi-book\"></i> Books\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"transaction.jsp\">\n");
      out.write("                                <i class=\"bi bi-arrow-left-right\"></i> Transaction\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"setting.html\">\n");
      out.write("                                <i class=\"bi bi-gear\"></i> Settings\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            <!-- Main Content -->\n");
      out.write("            <div class=\"col-md-10 col-lg-10 main-content\">\n");
      out.write("                <div class=\"d-flex justify-content-between mb-4\">\n");
      out.write("                    <h2>User Accounts Management</h2>\n");
      out.write("                    <button class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#addUserModal\">\n");
      out.write("                        Add New User\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Search and Filter -->\n");
      out.write("                <div class=\"card mb-4\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"row g-3\">\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search users...\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <select class=\"form-select\">\n");
      out.write("                                    <option>All Roles</option>\n");
      out.write("                                    <option>Student</option>\n");
      out.write("                                    <option>Faculty</option>\n");
      out.write("                                    <option>Staff</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <select class=\"form-select\">\n");
      out.write("                                    <option>All Status</option>\n");
      out.write("                                    <option>Active</option>\n");
      out.write("                                    <option>Inactive</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <button class=\"btn btn-secondary w-100\">Filter</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Users Table -->\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table table-hover\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>ID</th>\n");
      out.write("                                        <th>Name</th>\n");
      out.write("                                        <th>Email</th>\n");
      out.write("                                        <th>Role</th>\n");
      out.write("                                        <th>Status</th>\n");
      out.write("                                        <th>Books Borrowed</th>\n");
      out.write("                                        <th>Actions</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>U001</td>\n");
      out.write("                                        <td>John Doe</td>\n");
      out.write("                                        <td>john@example.com</td>\n");
      out.write("                                        <td>Student</td>\n");
      out.write("                                        <td><span class=\"badge bg-success\">Active</span></td>\n");
      out.write("                                        <td>2</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <button class=\"btn btn-sm btn-info\">Edit</button>\n");
      out.write("                                            <button class=\"btn btn-sm btn-danger\">Deactivate</button>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Add User Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"addUserModal\" tabindex=\"-1\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\">Add New User</h5>\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"form-label\">Full Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"form-label\">Email</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"form-label\">Role</label>\n");
      out.write("                            <select class=\"form-select\">\n");
      out.write("                                <option>Student</option>\n");
      out.write("                                <option>Faculty</option>\n");
      out.write("                                <option>Staff</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"form-label\">Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\">Save User</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("    <footer class=\"footer mt-auto py-3 bg-light\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <span class=\"text-muted\">Library System © All rights reserved 2025</span>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
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
