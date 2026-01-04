package org.example.service;

import org.example.model.User;

import java.sql.SQLException;

public interface UserService {
    public boolean login(String username,String password) throws SQLException;
    public void register(User user) throws SQLException;
    public boolean forgotPassword(String username, String newPassword) throws SQLException;
}
