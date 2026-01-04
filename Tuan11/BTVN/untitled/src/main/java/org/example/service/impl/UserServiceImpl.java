package org.example.service.impl;

import org.example.constant.ErrorMessage;
import org.example.constant.MenuMessage;
import org.example.constant.SuccessfulMessage;
import org.example.dao.UserDAO;
import org.example.model.User;
import org.example.service.UserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    private static  UserServiceImpl instance;
    private static UserDAO userDAO;
    private List<User> users;

    private UserServiceImpl(){
        this.users = new ArrayList<>();
        userDAO = new UserDAO();
    }
    public static UserServiceImpl getInstance(){
        if(instance==null){
            instance = new UserServiceImpl();
        }
        return instance;
    }


    @Override
    public boolean login(String username, String password){
        if(userDAO.checkLogin(username,password)){
            return true;
        }
        return false;
    }

    @Override
    public void register(User user) {
        userDAO.addUser(user);
    }

    @Override
    public boolean forgotPassword(String username, String newPassword) {
        if(userDAO.checkPassword(username)){
            userDAO.changePassword(newPassword,username);
            return true;
        }
        return false;
    }
}
