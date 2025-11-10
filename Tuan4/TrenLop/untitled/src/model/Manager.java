package model;

import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<SaleStaff> saleStaffs;
    private ArrayList<Technician> technicians;

    public Manager(ArrayList<SaleStaff> saleStaffs, ArrayList<Technician> technicians) {
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public Manager(String name, String country, double salary, ArrayList<SaleStaff> saleStaffs, ArrayList<Technician> technicians) {
        super(name, country, salary);
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public SaleStaff getSaleStaffByid(String saleStaffid){
        for(SaleStaff x: saleStaffs){
            if(x.getId().equals(saleStaffid)){
                return x;
            }
        }
        System.out.println("Sale staff not exist");
        return null;
    }
    public Technician getTechnicianByid(String technicianid){
        for(Technician x: technicians){
            if(x.getId().equals(technicianid)){
                return x;
            }
        }
        System.out.println("Technician not exist");
        return null;
    }

    @Override
    public void work() {
        System.out.println("Manager work");
    }
}
