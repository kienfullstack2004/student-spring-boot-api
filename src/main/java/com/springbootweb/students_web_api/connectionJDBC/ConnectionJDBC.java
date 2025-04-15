package com.springbootweb.students_web_api.connectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static Connection getConnection() throws SQLException {
        Connection c = null;

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        String url= "jdbc:mysql://localhost:3306/quanlysinhvien";
        String username="root";
        String password="123456";

        c = DriverManager.getConnection(url,username,password);
        return c;
    }

    public static void closeConnection(Connection c) throws SQLException {
        if(c!=null){
            c.close();
        }

    }

}
