package model;

import java.util.UUID;

public class Device {
    private final String id;
    private String model;

    public Device( String model) {
        this.id = UUID.randomUUID().toString();
        this.model = model;
    }

    public Device() {
        this.id = UUID.randomUUID().toString();
        this.model="Lenovo LOQ 2025";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }
}
