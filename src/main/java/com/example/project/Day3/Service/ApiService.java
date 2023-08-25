package com.example.project.Day3.Service;

import java.util.List;

import com.example.project.Day3.model.Employee;


public interface ApiService {
    public boolean addTask(Employee task);

	public boolean updateTask(Long id, Employee task);

	List<Employee> getTask();
}
