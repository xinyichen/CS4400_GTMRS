package edu.gatech.GTMRS.cs4400_Group_52;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.lang.ClassNotFoundException;

public class Connect {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        String url = "jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_Group_52";
        String username = "cs4400_Group_52";
        String password = "DDoVXAaM";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Success");
        }
        catch(ClassNotFoundException cnfe) {
            System.out.println("Error: " + cnfe.getMessage());
        }
        catch(SQLException sqle) {
            System.out.println("Error: " + sqle.getMessage());
        }
        finally {
            if (connection != null) {
                try { 
                    connection.close(); 
                } 
                catch(SQLException ignore) {}
            }
            
            if (statement != null) {
                try { 
                    statement.close(); 
                } 
                catch(SQLException ignore) {}
            }
        }
    }
}
