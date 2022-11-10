package com.example.demo.repositoris;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entitats.*;


public interface Repositoris extends CrudRepository<Course, Id>{

	public List<Course> findAll();
	
	public Course findById(int id);
}