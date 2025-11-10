package Model;

import Constant.Constant;

import java.util.UUID;

public class Product {
    private final String id;
    private String name;
    private String description;
    private double price;

    public Product() {
        this.id = UUID.randomUUID().toString();
        this.name = "Nguyen Van A";
        this.description = "";
        this.price = 0;
    }

    public Product(String name, String description, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getInfo() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
    public Product getByID(String id){
        if(this.id.equals(id)){
            return this;
        }
        System.out.println(Constant.ErrorMassage.ID_NOT_EXIST);
        return null;
    }
}
