package com.example.project.Day3.Service;

import java.util.List;

import com.example.project.Day3.model.Employee;
import com.example.project.Day5.model.Book;


public interface ApiService {
    public boolean addTask(Employee task);

	public boolean updateTask(Long id, Employee task);

	List<Employee> getTask();

	public boolean adduser(Book book);

	public boolean updateuser(Long id, Book book);

	public boolean deleteUser(Long id);
}
