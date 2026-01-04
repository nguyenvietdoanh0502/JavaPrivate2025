package org.example.controller;


import org.example.constant.ErrorMessage;
import org.example.model.User;
import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;

import java.sql.SQLException;

public class UserController {
    private static UserController instance;
    private final UserService userService;
    private UserController(){
        this.userService = UserServiceImpl.getInstance();
    }
    public static UserController getInstance(){
        if(instance==null){
            instance = new UserController();
        }
        return instance;
    }
    public boolean login(String username, String password){
        try{
            return userService.login(username,password);
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println(ErrorMessage.ERROR_SQL(e.getMessage()));
            return false;
        }
    }
    public void register(String id, String username,String password) {
        User user = new User(id,username,password);
        try{
            userService.register(user);
        }
        catch (SQLException e){
            System.out.println(ErrorMessage.ERROR_SQL(e.getMessage()));
            e.printStackTrace();
        }

    }
    public boolean forgotPassword(String username, String newPassword) {
        try{
            return userService.forgotPassword(username,newPassword);
        }
        catch (SQLException e){
            System.out.println(ErrorMessage.ERROR_SQL(e.getMessage()));
            e.printStackTrace();
            return false;
        }
    }
}
