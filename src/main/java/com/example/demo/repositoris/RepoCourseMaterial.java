package com.example.demo.repositoris;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.example.demo.entitats.*;

public interface RepoCourseMaterial extends CrudRepository<CourseMaterial, Id>{


	public List<CourseMaterial> findAll();
	
	public CourseMaterial findById(int id);
}
