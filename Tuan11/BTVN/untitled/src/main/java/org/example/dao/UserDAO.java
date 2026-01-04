package org.example.dao;

import lombok.NoArgsConstructor;
import org.example.model.User;
import org.example.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.example.utils.JDBCUtils.connectionDB;
@NoArgsConstructor
public class UserDAO {

    public void addUser(User user) {
        String sql = "INSERT INTO user (id, username, password) VALUES (?, ?, ?)";
        try (
                Connection conn = JDBCUtils.connectionDB();
                PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1,user.getId());
            ps.setString(2,user.getUsername());
            ps.setString(3,user.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean checkLogin(String username, String password) {
        String sql = "SELECT * FROM user as p  WHERE p.username = ? and p.password=?";
        try(
                Connection conn = JDBCUtils.connectionDB();
                PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1,username);
            ps.setString(2,password);
            try(ResultSet res = ps.executeQuery()){
                return res.next();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean checkPassword(String username)  {
        String sql = "SELECT * FROM user as p WHERE p.username = ?";
        try(
                Connection conn = JDBCUtils.connectionDB();
                PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1,username);
            try(ResultSet res = ps.executeQuery()){
                return res.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void changePassword(String newPassword, String username){
        String sql = "UPDATE user SET password = ? WHERE username = ?";
        try(
                Connection conn = JDBCUtils.connectionDB();
                PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1,newPassword);
            ps.setString(2,username);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
