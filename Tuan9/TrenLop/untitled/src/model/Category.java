package model;

import java.util.UUID;

public class Category {
    private String id;
    private String name;

    public Category(String id, String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public Category() {
        this.id = UUID.randomUUID().toString();
        this.name = "";
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
}
