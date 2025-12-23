package org.example.dto;

import org.example.model.Product;

public class ProductDTO extends Product {
    private String categoryName;

    public ProductDTO(String id, String name, String categoryId, double price, String categoryName) {
        super(id, name, categoryId, price);
        this.categoryName = categoryName;
    }

    public ProductDTO(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }


    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "ProductDTO{id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", categoryId='" + getCategoryId() + '\''  +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
