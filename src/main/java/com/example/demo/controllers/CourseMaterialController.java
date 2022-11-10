package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitats.Course;
import com.example.demo.entitats.CourseMaterial;
import com.example.demo.repositoris.Repositoris;

import com.example.demo.repositoris.*;

@RestController
@RequestMapping("api")

public class CourseMaterialController {

		@Autowired    
		RepoCourseMaterial MaterialCourseRepo; 
		
		@GetMapping("cursos/{id}")
		public CourseMaterial getCourse(@PathVariable int id) {
			
			return MaterialCourseRepo.findById(id);
		}
		
		@GetMapping("cursos")
		public Iterable<CourseMaterial> getTitle() {
			
			return MaterialCourseRepo.findAll();
		}
		
	
	
}
