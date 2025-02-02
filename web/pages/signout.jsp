<%-- 
    Document   : signout
    Created on : Jan 24, 2025, 5:04:17 PM
    Author     : nadee
--%>

<%
    if (session != null) {
        session.invalidate();
    }
    response.sendRedirect("../index.jsp");
%>
