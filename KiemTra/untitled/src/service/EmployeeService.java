package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    public void addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeesById(String id);
    public List<Employee> getEmployeesByName(String name);
}
