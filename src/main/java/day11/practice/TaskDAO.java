package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import day11.practice.TaskDAO2.DAOException;
import day06.practice.Task;

public class TaskDAO {
    public void createTask(Task task) throws DAOException {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "123456");
            System.out.println(connection);
            String query = "INSERT INTO USERS (user_name, email_id, password) VALUES (?, ?, ?)";
            stmt = connection.prepareStatement(query);

            stmt.setString(1, task.getTaskName());
            stmt.setString(2, task.getEmail_id());
            stmt.setString(3, task.getPassword());

            int rows = stmt.executeUpdate();
            System.out.println("Rows Added: " + rows);
        } catch (SQLException e) {
            throw new DAOException("Error while creating task", e);
        } finally {
    
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
          
            }

            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
         
            }
        }
    }
}



