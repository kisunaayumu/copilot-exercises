package main.java.copilot.exercises.ex08.p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestScoreDao {
     private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "password";

    public void saveTestScore(TestScore testScore) {
        String SQL = "INSERT INTO TEST_SCORE (id, student_id, score) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, testScore.getId());
            pstmt.setInt(2, testScore.getStudentId());
            pstmt.setInt(3, testScore.getScore());

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
