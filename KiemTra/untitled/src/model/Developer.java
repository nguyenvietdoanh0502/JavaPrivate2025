package model;

import service.Debuggable;
import service.Workable;

public class Developer extends Employee implements Debuggable, Workable {
    private int overtimeHours;

    public Developer(String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public Developer(int overtimeHours) {
        super();
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return this.getBasicSalary()+this.getBASE_SALARY_RATE() *this.overtimeHours;
    }

    @Override
    public void fixBug() {
        System.out.println("Dang fix bug");
    }

    @Override
    public void work(){
        System.out.println("Developer is Working");
    }

}
