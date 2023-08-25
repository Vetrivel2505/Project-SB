package com.example.project.Day4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Day4.Repository.StudentRepo;
import com.example.project.Day4.model.StudentModel;

@Service
public class StudentService { 
	@Autowired
	StudentRepo sr;
	public StudentModel saveinfo(StudentModel s) {
		return sr.save(s);
	}
	public List<StudentModel> showinfo(){
		return sr.findAll();
	}
	public StudentModel changeinfo(StudentModel s) {
		return sr.saveAndFlush(s);
	}
	public void delete() {
		sr.deleteAll();
	}
}