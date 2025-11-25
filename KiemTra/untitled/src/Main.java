import constant.Constant;
import model.Developer;
import model.Device;
import model.Employee;
import model.Tester;
import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeServiceImpl();
        Device A = new Device("Dell");
        Developer a = new Developer("VietDoanh",20,10000,A,4);
        Developer b = new Developer("TatTu",20,20000,new Device("Lenovo"),2);
        Tester c = new Tester("TamDuyen",19,10000,new Device("HP"),3);
        Tester d = new Tester("MyDuyen",19,12000,new Device("MacBook"),4);
        employeeService.addEmployee(a);
        employeeService.addEmployee(b);
        employeeService.addEmployee(c);
        employeeService.addEmployee(d);

        while(true){
            System.out.println(Constant.MenuMessage.MENU);
            System.out.print(Constant.MenuMessage.CHOICE);
            int choice = sc.nextInt();sc.nextLine();
            switch (choice){
                case 1:
                    List<Employee> res= employeeService.getAllEmployees();
                    for(Employee x : res){
                        System.out.println(x.toString());
                    }
                    break;
                case 2:
                    System.out.print(Constant.InputMessage.INPUT_ID);
                    String id = sc.nextLine();
                    Employee x = employeeService.getEmployeesById(id);
                    if(x!=null){
                        System.out.println(x);
                    }
                    break;
                case 3:
                    System.out.print(Constant.InputMessage.INPUT_NAME);
                    String name = sc.nextLine();
                    List<Employee> res2 = employeeService.getEmployeesByName(name);
                    if(res2!=null){
                        for(Employee w: res2){
                            System.out.println(w);
                        }
                    }
                    break;
                case 4:
                    System.out.println(Constant.MenuMessage.OUT);
                    break;
                default:
                    System.out.println(Constant.InvalidMessage.INVALID_CHOICE);
            }
            if(choice==4){
                break;
            }
        }


    }
}