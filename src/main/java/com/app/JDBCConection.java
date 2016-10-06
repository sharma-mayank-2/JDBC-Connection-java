package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * class to show a working example of a JDBC connection to mysql.
 * there are in total 5 steps for connection mention in Readme Document.
 */
public class JDBCConection {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");  // Step 1) initialize a Driver class at run time.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * Step 2) creating a connection
         * mysql -> is a database
         * localhost -> is a server where mysql is running
         * xyz -> is a name of a database
         * root -> is a userName
         */
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/xyz", "root", "password");

        Statement statement = connection.createStatement();

        String s = "select firstName from customer";  // step 3) creating a query

        ResultSet resultSet = statement.executeQuery(s); // step 4) execute a query

        while(resultSet.next()){
            System.out.println(resultSet.getString("firstName"));
        }

        connection.close();  // step 5) connection close

    }
}


