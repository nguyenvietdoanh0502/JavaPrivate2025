package model;

public class Technician extends Employee{
    private String techSkill;
    public Technician(){
        super();
        this.techSkill = "Deo co";
    }
    public Technician(String name, String country, double salary, String techSkill){
        super(name,country,salary);
        this.techSkill = techSkill;
    }

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }

    @Override
    public void work() {
        System.out.println("Technician work");;
    }
}
