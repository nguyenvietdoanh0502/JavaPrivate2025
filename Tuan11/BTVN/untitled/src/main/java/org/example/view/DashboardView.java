package org.example.view;

import org.example.constant.ErrorMessage;
import org.example.constant.MenuMessage;
import org.example.constant.SuccessfulMessage;
import org.example.controller.UserController;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;

public class DashboardView {
    Scanner sc = new Scanner(System.in);
    private UserController userController;

    public DashboardView(UserController userController) {
        this.userController = userController;
    }
    public void viewLogin() {
        System.out.print(MenuMessage.INPUT_USERNAME);
        String username = sc.nextLine();
        System.out.print(MenuMessage.INPUT_PASSWORD);
        String password = sc.nextLine();
        if(userController.login(username,password)){
            System.out.println(SuccessfulMessage.LOGIN_SUCCESSFUL);
        }
        else{
            System.out.println(ErrorMessage.INVALID_USERNAMEORPASSWORD);
        }
    }
    public void viewRegister()  {
        System.out.print(MenuMessage.INPUT_USERNAME);
        String username = sc.nextLine();
        System.out.print(MenuMessage.INPUT_PASSWORD);
        String password = sc.nextLine();
        String id = UUID.randomUUID().toString();
        userController.register(id,username,password);
        System.out.println(SuccessfulMessage.REGISTER_SUCCESSFUL);
    }
    public void viewForgotPassword(){
        System.out.print(MenuMessage.INPUT_USERNAME);
        String username = sc.nextLine();
        System.out.print(MenuMessage.INPUT_NEW_PASSWORD);
        String newPassword = sc.nextLine();
        if(userController.forgotPassword(username,newPassword)){
            System.out.println(SuccessfulMessage.CHANGE_PASSWORD_SUCCESSFUL);
        }
        else{
            System.out.println(ErrorMessage.INVALID_USERNAME);
        }

    }
    public void viewMenu(){
        System.out.println(MenuMessage.MENU);
        while (true){
            System.out.print(MenuMessage.INPUT_CHOICE);
            boolean out = false;
            int choice = sc.nextInt(); sc.nextLine();
            if(choice==1){
                viewLogin();
            }
            else if(choice==2){
                viewRegister();
            }
            else if(choice==3){
                viewForgotPassword();
            }
            else if(choice==4){
                out = true;
            }
            else{
                System.out.println(ErrorMessage.INVALID_CHOICE);
            }
            if(out){
                break;
            }
        }
    }
}
