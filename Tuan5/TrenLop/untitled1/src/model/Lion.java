package model;

public class Lion extends Animal{
    private double weight;

    public Lion(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    public Lion() {
        super();
        this.weight = 0;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("Gào");
    }
}
