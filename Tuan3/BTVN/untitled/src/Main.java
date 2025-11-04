import Service.AuthService;
import Service.UserService;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList<User> data = new ArrayList<>();
    public static void main(String[] args) {
        User a = new User("vietdoanh123","05022005","vietdoanh@gmail.com","0981927503");
        User b = new User("ducanh123","123456","ducanh@gmail.com","0873482149");
        User c = new User("nelam123","654321","nelam@gmail.com","0873483149");
        User d = new User("vannam123","1234568","vannam@gmail.com","0873982149");
        User e = new User("huyhoang123","1234567","huyhoang@gmail.com","0873082149");
        data.add(a);
        data.add(b);
        data.add(c);
        data.add(d);
        data.add(e);
        UserService service = new UserService(data);
        AuthService authService = new AuthService(service);
        System.out.println("--- Menu Auth ---\n" +
                "1. Login\n" +
                "2. Register\n" +
                "3. Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int choose1 = sc.nextInt();sc.nextLine();
        switch (choose1){
            case 1:
                System.out.println("--Login--");
                System.out.print("Username: ");
                String userName = sc.nextLine();
                System.out.print("Password: ");
                String password = sc.nextLine();
                User x = authService.login(userName,password);
                if(x!=null){
                    System.out.println("--- Menu User ---\n" +
                            "1. Get user by id\n" +
                            "2. Get all user\n" +
                            "3. Change password");
                    System.out.print("Your choice: ");
                    int choose2 = sc.nextInt();sc.nextLine();
                    switch (choose2){
                        case 1:
                            System.out.print("UserID: ");
                            String userID = sc.nextLine();
                            if(service.getUserById(userID)!=null){
                                service.getUserById(userID).toString();
                            }
                            break;
                        case 2:
                            ArrayList<User> show = service.getAllUser();
                            for (User user : show) {
                                System.out.print("Information of user: ");
                                System.out.println(user.getId());
                            }
                            break;
                        case 3:
                            System.out.print("New password: ");
                            String newPassword = sc.nextLine();
                            System.out.print("Confirm new password: ");
                            String confirmPassword = sc.nextLine();
                            authService.changePassword(x.getId(),newPassword,confirmPassword);
                            break;
                        default:
                            System.out.println("The option does not exist!");
                    }
                }
                break;
            case 2:
                System.out.println("--Register--");
                System.out.print("Username: ");
                String newUserName = sc.nextLine();
                System.out.print("Password: ");
                String newPassword = sc.nextLine();
                System.out.print("Email: ");
                String newEmail = sc.nextLine();
                System.out.print("Phone number: ");
                String newPhone = sc.nextLine();
                authService.register(newUserName,newPassword,newEmail,newPhone);
                break;
            case 3:
                break;
            default:
                System.out.println("The option does not exist!");
        }
    }
}