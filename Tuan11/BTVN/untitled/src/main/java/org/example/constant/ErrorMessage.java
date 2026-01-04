package org.example.constant;

public class ErrorMessage {
    public final static String INVALID_USERNAMEORPASSWORD = "Password or username is not correct";
    public final static String INVALID_USERNAME = "Username is not correct";
    public static String ERROR_SQL(String e){
        return "Lỗi hệ thống: "+e;
    }
    public final static String INVALID_CHOICE = "Your choice is invalid";
}
