package Service;

import Constant.Constant;
import Model.Laptop;
import Model.Product;
import Model.SmartPhone;
import Validation.ProductValidator;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private ArrayList<Product> data = new ArrayList<>();
    private ProductValidator productValidator = new ProductValidator();
    public void addProduct(Product product){
        if(productValidator.isValid(product)){
            data.add(product);
            System.out.println(Constant.NotificationSuccessful.ADD_SUCCESSFUL);
        }
        else{
            return;
        }
    }
    public void addProduct(String type, String name, String description, double price){
        if(type.equalsIgnoreCase("laptop")){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter RAM type: ");
            String ram = sc.nextLine();
            System.out.print("Enter CPU type: ");
            String cpu = sc.nextLine();
            Laptop laptop = new Laptop(name, description,price,ram,cpu);
            if(productValidator.isValid(laptop)){
                data.add(laptop);
                System.out.println(Constant.NotificationSuccessful.ADD_SUCCESSFUL);
            }
            else{
                return;
            }
        }
        else if(type.equalsIgnoreCase("Smartphone")){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 5G type(true/false): ");
            boolean has5G = sc.nextBoolean();
            SmartPhone smartPhone = new SmartPhone(name, description,price,has5G);
            if(productValidator.isValid(smartPhone)){
                data.add(smartPhone);
                System.out.println(Constant.NotificationSuccessful.ADD_SUCCESSFUL);
            }
            else{
                return;
            }
        }
        else{
            System.out.println(Constant.ErrorMassage.TYPE_INCORRECT);
            return;
        }
    }
    public void removeByID(String id){
        boolean check = true;
        for(Product x : data){
            if(x.getId().equals(id)){
                data.remove(x);
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(Constant.ErrorMassage.ID_NOT_EXIST);
            return;
        }
    }
    public Product getByID(String id){
        for(Product x : data){
            if(x.getId().equals(id)){
                return x;
            }
        }
        System.out.println(Constant.ErrorMassage.ID_NOT_EXIST);
        return null;
    }
    public ArrayList<Product> getAllProduct(){
        return this.data;
    }

}
