import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signup extends HttpServlet {
    private static final String service = "jdbc:mysql://localhost:3306/sql";
    private static final String username = "root";
    private static final String password = "Shashi@123";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("firstName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phoneNo");
        String usnFacultyId = request.getParameter("usn");
        String collegeName = request.getParameter("secondName");
        String password = request.getParameter("password");
        String userType = request.getParameter("userType");

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(service, username, password);

            String query = "INSERT INTO signup (id, name, email, phone, usn_faculty_id, college_name, password, user_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, email);
            stmt.setString(4, phone);
            stmt.setString(5, usnFacultyId);
            stmt.setString(6, collegeName);
            stmt.setString(7, password);
            stmt.setString(8, userType);

            stmt.executeUpdate();

            // Redirect to a success page or display a success message
            response.sendRedirect("success.html");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Redirect to an error page or display an error message
            response.sendRedirect("error.html");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
