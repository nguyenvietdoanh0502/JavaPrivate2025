package model;

import java.util.UUID;

public abstract class Employee {
    private final String id;
    private String name;
    private int age;
    private double basicSalary;
    private Device device;
    private static int employeeCount;
    private final double BASE_SALARY_RATE = 500000;

    public Employee(String name, int age, double basicSalary, Device device) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.device = device;
    }

    public Employee() {
        this.id = UUID.randomUUID().toString();
        this.name = "";
        this.age = 0;
        this.basicSalary = 0;
        this.device = new Device();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public double getBASE_SALARY_RATE() {
        return BASE_SALARY_RATE;
    }

    public String getId() {
        return id;
    }

    abstract public double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + basicSalary +
                ", device=" + device +
                ", BASE_SALARY_RATE=" + BASE_SALARY_RATE +
                '}';
    }
}
