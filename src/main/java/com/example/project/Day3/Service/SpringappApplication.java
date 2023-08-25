package com.example.project.Day3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Day3.Repository.EmployeeRepo;
import com.example.project.Day3.model.Employee;
import com.example.project.Day5.model.Book;



@Service
public class SpringappApplication implements ApiService {
    @Autowired
    private EmployeeRepo taskRepository;
	@Override
	public boolean addTask(Employee task) {
		boolean taskExists=taskRepository.existsByEmail(task.getEmail());
		if(!taskExists) {
			taskRepository.save(task);
			return true;
		}else {
			return false;
	}
  }
	@Override
	public List<Employee> getTask(){
		return taskRepository.findAll();
	}
	@Override
	public boolean updateTask(Long id,Employee task) {
		taskRepository.saveAndFlush(task);
		Optional<Employee> existingTaskOptional = taskRepository.findById(id);
		if(existingTaskOptional.isPresent()) {
		Employee taskExists = existingTaskOptional.get();
		taskExists.setName(task.getName());
		taskExists.setEmail(task.getEmail());
		taskExists.setPassword(task.getPassword());
		taskRepository.save(taskExists);
		return true;
	}else {
		return false;
	}
	}
	@Override
	public boolean adduser(Book book) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean updateuser(Long id, Book book) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}