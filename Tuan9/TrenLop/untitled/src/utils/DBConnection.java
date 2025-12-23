package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
    public static final String url = "jdbc:mysql://localhost:3306/inventory_db";
    public static final String user = "root";
    public static final String password = "05022005";

    public static Connection connectDatabase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
