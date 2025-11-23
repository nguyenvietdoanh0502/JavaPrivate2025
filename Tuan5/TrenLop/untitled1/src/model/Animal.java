package model;

import java.util.UUID;

public class Animal {
    private String id;
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
    }

    public Animal() {
        this.id = UUID.randomUUID().toString();
        this.name = "";
        this.age = 0;
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

    public String getId() {
        return id;
    }


    public String showInfor() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    public void makeSound(){
        System.out.println("sound!!!");
    }

}
