package Service;

import constant.Constant;
import model.User;

import java.util.ArrayList;

public class AuthService {
    private final UserService userService;

    public AuthService(UserService service) {
        this.userService = service;
    }

    public User login(String username, String password) {
        ArrayList<User> data = userService.getAllUser();
        int index = -1;
        for (int i = 0; i < data.size(); i++) {
            if (username.equals(data.get(i).getUsername())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println(Constant.ErrorMessage.INVALID_USERNAME);
            return null;
        } else {
            if (password.equals(data.get(index).getPassword())) {
                System.out.println(Constant.NotificationSuccessful.LOGIN_SUCCESS);
                return data.get(index);
            } else {
                System.out.println(Constant.ErrorMessage.INVALID_PASSWORD);
                return null;
            }
        }
    }

    public void register(String username, String password, String email, String phoneNumber) {
        java.util.ArrayList<User> data = userService.getAllUser();
        int index = -1;
        for (int i = 0; i < data.size(); i++) {
            if (username.equals(data.get(i).getUsername())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(Constant.ErrorMessage.USERNAME_EXIST);
            return;
        }
        int index2 = -1;
        for (int i = 0; i < data.size(); i++) {
            if (username.equals(data.get(i).getEmail())) {
                index2 = i;
                break;
            }
        }
        if (index2 != -1) {
            System.out.println(Constant.ErrorMessage.EMAIL_EXIST);
            return;
        }
        int index3 = -1;
        for (int i = 0; i < data.size(); i++) {
            if (username.equals(data.get(i).getPhoneNumber())) {
                index3 = i;
                break;
            }
        }
        if (index3 != -1) {
            System.out.println(Constant.ErrorMessage.PHONENUMBER_EXIST);
            return;
        }
        model.User x = new User(username, password, email, phoneNumber);
        userService.addUser(x);
        System.out.println(Constant.NotificationSuccessful.REGISTER_SUCCESS);
    }
    public void changePassword(String userID, String newPassword, String ConfirmPassword){
        if(userService.getUserById(userID)!=null){
            if(newPassword.equals(ConfirmPassword)){
                userService.getUserById(userID).setPassword(newPassword);
                System.out.println(Constant.NotificationSuccessful.CHANGE_PASSWORD_SUCCESS);
            }
            else{
                System.out.println(Constant.ErrorMessage.CONFIRM_PASSWORD_INCORRECT);
                return;
            }
        }
        else{
            System.out.println(Constant.ErrorMessage.INVALID_ID);
        }
    }
}