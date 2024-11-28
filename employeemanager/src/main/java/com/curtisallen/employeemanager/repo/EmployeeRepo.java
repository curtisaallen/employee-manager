package com.curtisallen.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curtisallen.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    // You don't need a custom delete method because Spring Data JPA provides deleteById() by default
    // void deleteEmployeeById(Long id); 

    // findById is already provided by JpaRepository
     Optional<Employee> findEmployeeById(Long id); 
}
