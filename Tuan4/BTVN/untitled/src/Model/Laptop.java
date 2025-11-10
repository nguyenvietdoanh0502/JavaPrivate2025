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
        String formatString = "%-30s | %-25s | %-30s | %15.2f | %-25s | %-25s";
        String format = String.format(formatString, this.getId(), this.getName(), this.getDescription(), this.getPrice(), this.ram, this.cpu);
        return format;
    }
}
