package org.example.model;

import java.util.UUID;

public class Categoty {
    private String id;
    private String name;

    public Categoty( String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }
    public Categoty() {
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

}
