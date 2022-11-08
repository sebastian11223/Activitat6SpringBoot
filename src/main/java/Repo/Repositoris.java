package Repo;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import entitats.Course;



public interface Repositoris extends CrudRepository<Course, Id>{

	public List<Course> findAll();
	
	public Course findById(int id);
}