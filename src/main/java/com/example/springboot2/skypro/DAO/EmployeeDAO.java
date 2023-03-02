package com.example.springboot2.skypro.DAO;

import com.example.springboot2.skypro.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getEmployee();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
