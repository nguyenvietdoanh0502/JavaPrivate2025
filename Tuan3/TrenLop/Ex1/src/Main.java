import Module1.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void ChuyenTien(User send, User recv,double amount){
        send.deposit(amount);
        recv.withDraw(amount);
        System.out.println("Nguoi dung "+send.getName()+" chuyen "+amount +" sang nguoi dung "+recv.getName());
    }
    public static void main(String[] args) {
        User user1 = new User("Nam",100000);
        User user2 = new User("Doanh",100000);
        User user3 = new User("Hoa",400000);
        ChuyenTien(user1,user2,10000);
    }
}