package model;

import constant.Constant;
import service.Borrowable;

import java.util.UUID;

public class Book implements Borrowable {
    public String id;
    public String title;
    public String author;
    public double price;
    public int quantity;

    public Book(String author, String title, double price, int quantity) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.id = UUID.randomUUID().toString();
    }

    public Book() {
        this.author = "";
        this.title = "";
        this.price = 0;
        this.quantity = 0;
        this.id = UUID.randomUUID().toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}');
    }

    @Override
    public int getAvailableQuantity() {
        return this.quantity;
    }

    @Override
    public boolean borrow(int quantity) {
        if(quantity<=this.quantity && quantity>0){
            this.quantity-=quantity;
            return true;
        }
        return false;
    }
}
