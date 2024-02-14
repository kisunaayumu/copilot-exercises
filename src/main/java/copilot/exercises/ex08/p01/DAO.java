package main.java.copilot.exercises.ex08.p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
    private String url = "jdbc:mysql://localhost:5432/student";
    private String username = "root";
    private String password = "password";

    public void saveStudent(Student student) {
        String SQL = "INSERT INTO STUDENT (id, name) VALUES (id, name)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getName());

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

