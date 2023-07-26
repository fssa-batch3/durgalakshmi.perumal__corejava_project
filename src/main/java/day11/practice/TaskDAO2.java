package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import day06.practice.Task;

public class TaskDAO2 {
    // Define the custom DAOException class within the TaskDAO class
    public static class DAOException extends Exception {
        public DAOException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public void createTask(Task task) throws DAOException {
        // Rest of the code remains the same
    }
}
