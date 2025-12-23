package org.example.utils;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import org.example.constant.ErrorMessage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url = "jdbc:mysql://localhost:3306/inventory_db";
    private static final String user = "root";
    private static final String password = "05022005";

    public static Connection connectToDB(){
        try{
            return DriverManager.getConnection(url,user,password);
        }
        catch (SQLException e){
            throw new RuntimeException(ErrorMessage.connectionFail(e.getMessage()));
            /*e.printStackTrace();*/

        }

    }
}
