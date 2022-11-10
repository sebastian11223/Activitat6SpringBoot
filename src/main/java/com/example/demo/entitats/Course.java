package com.example.demo.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	
	@Id
	private int id; 
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String title;



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Course(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Course() {
		super();
		
	}

	
	
	
	
}
