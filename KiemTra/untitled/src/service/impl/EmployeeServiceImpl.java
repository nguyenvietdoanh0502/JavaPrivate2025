package service.impl;

import constant.Constant;
import model.Employee;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    public List<Employee> employees = new ArrayList<>();


    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeesById(String id) {
        for(Employee x: employees){
            if(x.getId().equals(id)){
                return x;
            }
        }
        System.out.println(Constant.InvalidMessage.INVALID_ID);
        return null;
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        List<Employee> res = new ArrayList<>();
        for(Employee x: employees){
            if(x.getName().contains(name)){
                res.add(x);
            }
        }
        if(res.isEmpty()){
            System.out.println(Constant.InvalidMessage.INVALID_NAME);
            return null;
        }
        return res;
    }

}
