package model;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    public Bird() {
        super();
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void makeSound() {

    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
