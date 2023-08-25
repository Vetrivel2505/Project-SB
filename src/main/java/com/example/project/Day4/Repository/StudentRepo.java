package com.example.project.Day4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Day4.model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer>{

}