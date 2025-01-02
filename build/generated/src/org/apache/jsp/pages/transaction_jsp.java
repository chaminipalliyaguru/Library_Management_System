package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class transaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Transactions - Library Management System</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"styles.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Same navbar structure -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                <img src=\"/api/placeholder/40/40\" alt=\"Library Logo\" class=\"logo\">\n");
      out.write("                Library System\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!-- Same sidebar structure -->\n");
      out.write("            <div class=\"col-md-3 col-lg-2 sidebar\">\n");
      out.write("                <div class=\"admin-profile text-center py-4\">\n");
      out.write("                    <img src=\"/api/placeholder/100/100\" alt=\"Admin Profile\" class=\"rounded-circle mb-3\">\n");
      out.write("                    <h5>Administrator</h5>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav flex-column\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.html\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"accounts.html\">Accounts</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"books.html\">Books</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"transactions.html\">Transaction</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"settings.html\">Settings</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Main Content -->\n");
      out.write("            <div class=\"col-md-9 col-lg-10 main-content\">\n");
      out.write("                <div class=\"d-flex justify-content-between align-items-center mb-4\">\n");
      out.write("                    <h2>Transactions Management</h2>\n");
      out.write("                    <button class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#newTransactionModal\">\n");
      out.write("                        New Transaction\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Transaction Stats -->\n");
      out.write("                <div class=\"row mb-4\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"card bg-info text-white\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Today's Borrows</h5>\n");
      out.write("                                <p class=\"card-text\">15</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"card bg-success text-white\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Today's Returns</h5>\n");
      out.write("                                <p class=\"card-text\">12</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"card bg-warning text-white\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Overdue Books</h5>\n");
      out.write("                                <p class=\"card-text\">8</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"card bg-danger text-white\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Pending Fines</h5>\n");
      out.write("                                <p class=\"card-text\">$45.00</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Transaction Table -->\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table table-hover\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Transaction ID</th>\n");
      out.write("                                        <th>User</th>\n");
      out.write("                                        <th>Book</th>\n");
      out.write("                                        <th>Type</th>\n");
      out.write("                                        <th>Date</th>\n");
      out.write("                                        <th>Due Date</th>\n");
      out.write("                                        <th>Status</th>\n");
      out.write("                                        <th>Actions</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>T001</td>\n");
      out.write("                                        <td>John Doe</td>\n");
      out.write("                                        <td>The Great Gatsby</td>\n");
      out.write("                                        <td>Borrow</td>\n");
      out.write("                                        <td>2025-01-01</td>\n");
      out.write("                                        <td>2025-01-15</td>\n");
      out.write("                                        <td><span class=\"badge bg-success\">Active</span></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <button class=\"btn btn-sm btn-success\">Return</button>\n");
      out.write("                                            <button class=\"btn btn-sm btn-info\">Details</button>\n");
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
      out.write("    <!-- New Transaction Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"newTransactionModal\" tabindex=\"-1\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\">New Transaction</h5>\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"form-label\">User</label>\n");
      out.write("                            <select class=\"form-select\">\n");
      out.write("                                <option>Select User</option>\n");
      out.write("                                <option>John Doe</option>\n");
      out.write("                                <option>Jane Smith</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"form-label\">Book</label>\n");
      out.write("                            <select class=\"form-select\">\n");
      out.write("                                <option>Select Book</option>\n");
      out.write("                                <option>The Great Gatsby</option>\n");
      out.write("                                <option>To Kill a Mockingbird</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"form-label\">Transaction Type</label>\n");
      out.write("                            <select class=\"form-select\">\n");
      out.write("                                <option>Borrow</option>\n");
      out.write("                                <option>Return</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"form-label\">Due Date</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\">Save Transaction</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer class=\"footer mt-auto py-3 bg-light\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <span class=\"text-muted\">Library System © All rights reserved 2025</span>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
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
