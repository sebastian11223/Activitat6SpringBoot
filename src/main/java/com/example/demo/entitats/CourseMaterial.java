package com.example.demo.entitats;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CourseMaterial")
public class CourseMaterial {
	
	
	@Id
	private int id; 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//el material és d'un curs o de cap 0.1 
//	@OneToOne
	@ManyToOne(optional = false)
	@JsonIgnore
	private Course course;
	
	private String url;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CourseMaterial(int id, Course course, String url) {
		super();
		this.id = id;
		this.course = course;
		this.url = url;
	}
	
	public CourseMaterial() {
		super();
	}
	
	
	
	
	
}
