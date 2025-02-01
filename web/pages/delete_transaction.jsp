<%@page import="java.sql.SQLException"%>
<%@page import="library.classes.Dbconnector"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Delete Transaction</title>
    </head>
    <body>
        <%
            // Get the transactionId from the request parameter
            String transactionIdStr = request.getParameter("transactionId");
            if (transactionIdStr != null && !transactionIdStr.isEmpty()) {
                int transactionId = Integer.parseInt(transactionIdStr);

                // Delete the transaction from the database
                Connection con = Dbconnector.getConnection();
                String query = "DELETE FROM transaction WHERE transaction_id = ?";
                try {
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setInt(1, transactionId);
                    int rowsAffected = pstmt.executeUpdate();

                    if (rowsAffected > 0) {
                        // Deletion successful
                        out.println("<script>alert('Transaction deleted successfully!'); window.location.href='transaction.jsp';</script>");
                    } else {
                        // No rows affected (transaction not found)
                        out.println("<script>alert('Transaction not found!'); window.location.href='transaction.jsp';</script>");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    out.println("<script>alert('Error deleting transaction!'); window.location.href='transaction.jsp';</script>");
                } finally {
                    // Close the connection
                    try {
                        if (con != null && !con.isClosed()) {
                            con.close();
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                // No transactionId provided
                out.println("<script>alert('Invalid request!'); window.location.href='transaction.jsp';</script>");
            }
        %>
    </body>
</html>