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
                System.out.println(Constant.ErrorMessage.INCORRECT_PASSWORD);
                return null;
            }
        }
    }

    public void register(String username, String password, String email, String phoneNumber) {
        java.util.ArrayList<User> data = userService.getAllUser();
        for (User x:data) {
            if (username.equals(x.getUsername())) {
                System.out.println(Constant.ErrorMessage.USERNAME_EXIST);
                return;
            }
        }
        for (User x:data) {
            if (username.equals(x.getEmail())) {
                System.out.println(Constant.ErrorMessage.EMAIL_EXIST);
                return;
            }
        }
        for (User x:data) {
            if (username.equals(x.getPhoneNumber())) {
                System.out.println(Constant.ErrorMessage.PHONENUMBER_EXIST);
                return;
            }
        }
        if(checkPassword(password)&&checkPhonenumber(phoneNumber)&&checkEmail(email)){
            model.User x = new User(username, password, email, phoneNumber);
            userService.addUser(x);
            System.out.println(Constant.NotificationSuccessful.REGISTER_SUCCESS);
        }
        else{
            return;
        }
    }
    public void changePassword(String userID, String newPassword, String ConfirmPassword){
        User x  = userService.getUserById(userID);
        if(x!=null){
            if(!checkPassword(newPassword)){
                return;
            }
            if(newPassword.equals(x.getPassword())){
                System.out.println(Constant.ErrorMessage.MATCHES_PASSWORD);
                return;
            }
            if(!newPassword.equals(ConfirmPassword)){
                System.out.println(Constant.ErrorMessage.CONFIRM_PASSWORD_INCORRECT);
                return;
            }
            x.setPassword(newPassword);
            System.out.println(Constant.NotificationSuccessful.CHANGE_PASSWORD_SUCCESS);
        }
        else{
            System.out.println(Constant.ErrorMessage.INVALID_ID);
            return;
        }
    }
    public boolean checkEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if(!email.matches(regex)){
            System.out.println(Constant.ErrorMessage.INVALID_EMAIL);
            return false;
        }
        return true;
    }
    public boolean checkPhonenumber(String phoneNumber){
        String regex = "^(\\+84|0)(3[2-9]|5[2689]|7[06-9]|8[1-9]|9[0-9])[0-9]{7}$";
        if(!phoneNumber.matches(regex)){
            System.out.println(Constant.ErrorMessage.INVALID_PHONENUMBER);
            return false;
        }
        return true;
    }
    public boolean checkPassword(String password){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if(!password.matches(regex)){
            System.out.println(Constant.ErrorMessage.INVALID_PASSWORD);
            return false;
        }
        return true;
    }
}