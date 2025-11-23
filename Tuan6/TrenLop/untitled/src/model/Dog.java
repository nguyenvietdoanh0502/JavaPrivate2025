package model;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
        super();
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }
    @Override
    public boolean swim(){
        return true;
    }
    @Override
    public boolean fly(){
        return false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
