package model;

import service.Flyable;
import service.Swimable;

public abstract class Animal implements Swimable, Flyable {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
        this.name="";
        this.age=0;
    }
    public abstract void makeSound();
    public abstract void eat();
    public abstract void move();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
