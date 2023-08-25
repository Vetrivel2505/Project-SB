package com.example.project.Day3.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Day3.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee , Integer>{

	boolean existsByEmail(String email);
	
	Optional<Employee> findById(Long id);
    
}
