package day12.solved;

import day11.solved.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class UserQuery {

    public static void main(String[] args) throws Exception {


        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);

        Statement stmt = connection.createStatement();

        // Step 03: Execute Insert Query
        String query ="INSERT INTO user (first_name, last_name, password) VALUES (\"durga\",\"lakshmi\", \"password007\")";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted :" + rows );

        //Step 04: Execute SELECT Query
        final String selectQuery = "SELECT first_name,last_name,password FROM user";

        //Step 05: Get the resultset
        ResultSet rs = stmt.executeQuery(selectQuery);

        //Step 06: Iterate the result
        while ( rs.next()) {
        	String userPass = rs.getString("password");
        	String userName = rs.getString("first_name");
            String userLname = rs.getString("last_name");

            System.out.println("UserFname:" + userName +", UserLName:" + userLname + ", password:" + userPass);
        }

        //Step 07: close the connection resources
        rs.close();
        stmt.close();
        connection.close();



    }

}