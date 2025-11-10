package Model;

public class Laptop extends Product {
    private String ram;
    private String cpu;

    public Laptop(String name, String description, double price, String ram, String cpu) {
        super(name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop() {
        super();
        this.ram = "";
        this.cpu = "";
    }

    @Override
    public String getInfo() {
        return "Laptop{" + super.toString() +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
