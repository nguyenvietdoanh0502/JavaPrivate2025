package model;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
        super();
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeSound() {

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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
