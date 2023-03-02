package com.example.springboot2.skypro.service;

import com.example.springboot2.skypro.DAO.EmployeeDAO;
import com.example.springboot2.skypro.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeDAO.getEmployee();

    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = employeeDAO.getEmployeeById(id);

        return employee;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);

        Employee employee = employeeDAO.getEmployeeById(id);

    }
}
