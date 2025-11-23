package model;

public class Student {
    private String name;
    private int age;
    private String classRoom;

    public Student() {
        this.name = "";
        this.age=0;
        this.classRoom="";
    }

    public Student(String name, String classRoom, int age) {
        this.name = name;
        this.classRoom = classRoom;
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

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }
}
