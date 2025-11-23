package model;

public class Elephant extends Animal{
    private double trunkLength;

    public Elephant(String name, int age, double trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
    }

    public Elephant() {
        super();
        this.trunkLength = 0;
    }

    public double getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Ù ò ò!!!");
    }

}
