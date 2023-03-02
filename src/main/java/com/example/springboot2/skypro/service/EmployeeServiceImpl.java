package com.example.springboot2.skypro.service;

import com.example.springboot2.skypro.DAO.EmployeeRepo;
import com.example.springboot2.skypro.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();

    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = employeeRepo.findById(id).get();

        return employee;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
