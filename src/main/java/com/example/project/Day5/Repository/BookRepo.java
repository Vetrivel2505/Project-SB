package com.example.project.Day5.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Day5.model.Book;


public interface BookRepo extends JpaRepository<Book,Integer>{

	Optional<Book>findById(Long id);
	Optional<Book>deleteById(Long id);
	boolean existsByBookName(String bookName);

}