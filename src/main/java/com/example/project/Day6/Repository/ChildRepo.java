package com.example.project.Day6.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Day6.model.Child;

public interface ChildRepo extends JpaRepository<Child,Integer>{

	Optional<Child>findByBabyId(Long babyId);
	Optional<Child>deleteByBabyId(Long babyId);
	boolean existsByAddress(String address);

}