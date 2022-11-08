package controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Repo.Repositoris;
import entitats.Course;



@RestController
@RequestMapping("api")
public class CourseController {
	
	@Autowired    
	Repositoris CourseRepo; 
	@GetMapping("curs/{id}")
	public Course getCourse(@PathVariable int id) {
		
		return CourseRepo.findById(id);
	}
	
	
	
}
