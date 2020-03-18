package com.company;
// imports in the interface
import java.awt.*;
import java.io.StringReader;
import java.sql.*;


// This is a connection with the Data_Base in the next context.
public class Example_sql {
    // JDBC driver name and database in the url form
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL =     "jdbc:mysql://local_host/EMP";

    // Database credentials //
    static final int Id = 0; // TODO: Here we can put the next part of the main example
    static final String USER = "Your User name";
    static final String PASS = "Your Password";
    // The principal main in the architecture //
    public static void main(String[] args){
        Connection conn = null; // The connect with the database
        Statement stmt = null; //
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to Data Base");
            System.out.println("Creating an Statment");
            stmt = conn.createStatement();
            String sql;
            

        }


    }
}
