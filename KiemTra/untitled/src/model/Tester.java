package model;

import service.Workable;

public class Tester extends Employee implements Workable {
    private int bugsDetectedCount;

    public Tester(String name, int age, double basicSalary, Device device, int bugsDetectedCount) {
        super(name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public Tester(int bugsDetectedCount) {
        super();
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public double calculateSalary() {
        return this.getBasicSalary() + this.getBASE_SALARY_RATE()*this.bugsDetectedCount;
    }

    @Override
    public void work() {
        System.out.println("Tester is working");
    }
}
