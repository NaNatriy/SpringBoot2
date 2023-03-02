package com.example.springboot2.skypro.DAO;

import com.example.springboot2.skypro.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
