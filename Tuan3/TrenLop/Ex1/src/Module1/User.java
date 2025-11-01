package Module1;

import java.util.UUID;

public class User {
    String id;
    String name;
    double balance;
    public User(){

    }
    public User(String name,double balance) {
        this.id = UUID.randomUUID().toString();
        this.name=name;
        this.balance=balance;
    }


    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount){
        if(amount>0 && amount<this.balance){
            this.balance = this.balance - amount;
        }
        else{
            System.out.println(Constant.ErrorMassege.NOT_ENOUGH_MONEY);
            return;
        }
    }

    public void withDraw(double amount){
        if(amount>0){
            this.balance = this.balance + amount;
        }
        else{
            System.out.println();
            return;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
