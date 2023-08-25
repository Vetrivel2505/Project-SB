package com.example.project.Day5.Service;

import com.example.project.Day5.model.Book;

public interface ApiService {
	

public boolean adduser(Book book);
public boolean updateuser(Long id, Book book);
boolean deleteUser(Long id);
}