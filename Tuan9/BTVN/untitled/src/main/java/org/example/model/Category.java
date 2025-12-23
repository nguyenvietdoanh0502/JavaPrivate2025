package org.example.model;

import java.util.UUID;

public class Category {
    private String id;
    private String name;

    public Category(String id,String name) {
        this.id = id;
        this.name = name;
    }
    public Category() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
