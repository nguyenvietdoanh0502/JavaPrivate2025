package model;

import java.util.UUID;

public class Product {
    private String id;
    private String name;
    private double price;
    private String categoryId;

    public Product( String name, double price, String categoryId) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public Product() {
        this.id = UUID.randomUUID().toString();
        this.name = "";
        this.price = 0;
        this.categoryId = "";
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
