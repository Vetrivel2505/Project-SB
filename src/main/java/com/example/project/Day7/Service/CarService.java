package com.example.project.Day7.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Day7.Repository.CarRepo;
import com.example.project.Day7.model.Car;

@Service
public class CarService {
	@Autowired
	CarRepo crep;
	
	public Car save(Car data) {
		return crep.save(data);
	}
	
	public List<Car> getByOwn(int own){
		return crep.getCarInFromOwners(own);
	}
	public List<Car> getByAddr(String addr){
		return crep.getCarInFromAddress(addr);
	}
	public List<Car> getByName(String name){
		return crep.getCarFromName(name);
	}
	public List<Car> getBoth(int own, String type){
		return crep.getCarInFromOwnNCt(own, type);
	}
}