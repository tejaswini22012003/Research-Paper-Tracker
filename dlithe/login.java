import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/user/login";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Shashi@123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        boolean authenticated = authenticateUser(email, password);

        if (authenticated) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Login successful");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Login failed");
        }
    }

    private boolean authenticateUser(String email, String password) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String query = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next(); // If a row is returned, authentication is successful
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Return false if there was an error or no matching user found
    }
}
