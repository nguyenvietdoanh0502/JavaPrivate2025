package org.example.constant;

public class ErrorMessage {
    public static String connectionFail(String s){
        return "Lỗi kết nối: "+s;
    }
    public static String closeFail(String s){
        return "Không thể đóng. Lỗi: "+s;
    }
}
